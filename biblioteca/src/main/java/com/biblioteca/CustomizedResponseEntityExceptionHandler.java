package br.com.forrota.config.http;

import br.com.forrota.exception.BusinessException;
import br.com.forrota.exception.ResourceNotFoundException;
import br.com.forrota.http.domain.response.DefaultResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static br.com.forrota.commons.StringUtil.isEmpty;
import static java.util.Objects.isNull;
import static java.util.Optional.empty;
import static org.springframework.http.HttpStatus.*;

@ControllerAdvice
@RestController
@Slf4j
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(HttpClientErrorException.class)
    public final ResponseEntity<DefaultResponse> handleHttpCallsExceptions(HttpClientErrorException exception, WebRequest request) {
        HttpStatus httpStatus = UNPROCESSABLE_ENTITY;

        DefaultResponse defaultResponse = createDefaulResponse(exception, httpStatus);

        getMessageListFromExceptionBody(exception)
                .ifPresent(defaultResponse::setMessages);

        return new ResponseEntity<>(defaultResponse, httpStatus);
    }

    @ExceptionHandler(BusinessException.class)
    public final ResponseEntity<DefaultResponse> handleBusinessExceptions(BusinessException exception, WebRequest request) {
        HttpStatus httpStatus = UNPROCESSABLE_ENTITY;

        DefaultResponse defaultResponse = createDefaulResponse(exception, httpStatus);
        if (exception.getMessages() == null || exception.getMessages().isEmpty())
            defaultResponse.setMessage(exception.getIdentifier());
        else
            defaultResponse.setMessages(exception.getMessages());

        return new ResponseEntity<>(defaultResponse, httpStatus);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public final ResponseEntity<DefaultResponse> handleConstraintViolation(ConstraintViolationException ex, WebRequest request) {
        HttpStatus httpStatus = UNPROCESSABLE_ENTITY;
        List<String> errors = new ArrayList<>();
        for (ConstraintViolation<?> violation : ex.getConstraintViolations()) {
            errors.add(violation.getRootBeanClass().getName() + " " +
                    violation.getPropertyPath() + ": " + violation.getMessage());
        }

        DefaultResponse defaultResponse = createDefaulResponse(ex, httpStatus);
        defaultResponse.setMessages(errors);
        return new ResponseEntity<>(defaultResponse, httpStatus);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public final ResponseEntity<DefaultResponse> handleResourceNotFoundExceptions(ResourceNotFoundException exception, WebRequest request) {
        HttpStatus httpStatus = NOT_FOUND;

        DefaultResponse defaultResponse = createDefaulResponse(exception, httpStatus);
        defaultResponse.setMessage(exception.getMessage());

        return new ResponseEntity<>(defaultResponse, httpStatus);
    }

    @Override
    protected ResponseEntity<Object> handleExceptionInternal(Exception exception, Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {
        DefaultResponse defaultResponse = createDefaulResponse(exception, status);
        defaultResponse.setMessage(exception.getMessage());
        return new ResponseEntity<>(defaultResponse, status);
    }

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<DefaultResponse> handleAllExceptions(Exception exception, WebRequest request) {
        HttpStatus httpStatus = INTERNAL_SERVER_ERROR;
        DefaultResponse defaultResponse = createDefaulResponse(exception, httpStatus);
        return new ResponseEntity<>(defaultResponse, httpStatus);
    }

    private Optional<ResponseStatus> getResponseAnnotation(Class<?> exceptionClass) {
        return Optional.ofNullable(AnnotationUtils.findAnnotation(exceptionClass, ResponseStatus.class));
    }

    private void log(Exception ex, HttpStatus httpStatus) {
        if (isNull(httpStatus) || isNull(ex) || isNull(ex.getMessage()))
            return;

        if (httpStatus.is4xxClientError()) {
            log.warn(ex.getMessage(), ex);
        } else {
            log.error(ex.getMessage(), ex);
        }
    }

    private void log(Exception ex) {
        log.error(ex.getMessage(), ex);
    }

    private String extractMessage(Exception ex) {
        return isEmpty(ex.getMessage()) ? ex.getClass().getSimpleName() : ex.getMessage();
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public final ResponseEntity<DefaultResponse> handleAllExceptions(IllegalArgumentException ex, WebRequest request) {
        return createBadRequestResponse(ex, null);
    }

    @ExceptionHandler(BadCredentialsException.class)
    public final ResponseEntity<DefaultResponse> handleAllExceptions(BadCredentialsException ex, WebRequest request) {
        return createBadRequestResponse(ex, "As credenciais informadas são inválidas ou o usuário não existe.");
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex,
            HttpHeaders headers,
            HttpStatus status,
            WebRequest request) {

        List<String> errors = new ArrayList<>();

        for (FieldError error : ex.getBindingResult().getFieldErrors())
            errors.add(error.getField() + ": " + error.getDefaultMessage());

        for (ObjectError error : ex.getBindingResult().getGlobalErrors())
            errors.add(error.getObjectName() + ": " + error.getDefaultMessage());

        DefaultResponse response = new DefaultResponse(BAD_REQUEST.name(), errors);

        return handleExceptionInternal(ex, response, headers, BAD_REQUEST, request);
    }

    private ResponseEntity<DefaultResponse> createBadRequestResponse(Exception ex, String defaultMessage) {
        Optional<ResponseStatus> annotationResponse = getResponseAnnotation(ex.getClass());
        HttpStatus httpStatus = BAD_REQUEST;
        String status = httpStatus.name();

        try {
            log.warn(ex.getMessage(), ex);

            if (annotationResponse.isPresent()) {
                httpStatus = annotationResponse.get().value();

                if (isEmpty(annotationResponse.get().reason())) {
                    status = httpStatus.name();
                } else {
                    status = annotationResponse.get().reason();
                }
            }

        } catch (Exception e) {
            log(e);
        }

        return new ResponseEntity<>(new DefaultResponse(status, isEmpty(defaultMessage) ? extractMessage(ex) : defaultMessage), httpStatus);
    }

    private DefaultResponse createDefaulResponse(Exception exception, HttpStatus httpStatus) {
        String status = httpStatus.name();
        Optional<ResponseStatus> annotationResponse = getResponseAnnotation(exception.getClass());

        try {
            if (annotationResponse.isPresent()) {
                httpStatus = annotationResponse.get().value();

                log(exception, httpStatus);

                if (isEmpty(annotationResponse.get().reason())) {
                    status = httpStatus.name();
                } else {
                    status = annotationResponse.get().reason();
                }
            } else {
                log(exception);
            }

        } catch (Exception e) {
            log(e);
        }
        return new DefaultResponse(status, extractMessage(exception));
    }

    private Optional<List> getMessageListFromExceptionBody(HttpClientErrorException exception) {
        try {
            var messages = new ObjectMapper()
                    .readValue(exception.getResponseBodyAsString(), DefaultResponse.class)
                    .getMessages();

            return Optional.ofNullable(messages);
        } catch (IOException e) {
            log.warn("Erro ao fazer parse do responseBody para DefaultResponse", e);
        }
        return empty();
    }
}
