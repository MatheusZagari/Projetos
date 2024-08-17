package com.biblioteca.config.TratamentoDeErro.execption;

import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Collections;
import java.util.List;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class BusinessException extends RuntimeException {

    private final String identifier;
    private final List<String> messages;

    public BusinessException(String identifier) {
        this((Throwable) null, identifier, (List) null);
    }

    public BusinessException(String identifier, List<String> messages) {
        this((Throwable) null, identifier, messages);
    }

    public BusinessException(Throwable cause, String identifier) {
        this(cause, identifier, (List) null);
    }

    public BusinessException(Throwable cause) {
        this(cause, (String) null, (List) null);
    }

    public BusinessException(List<String> messages) {
        this((Throwable) null, (String) null, messages);
    }

    public BusinessException(String identifier, String message) {
        this((Throwable) null, identifier, Collections.singletonList(message));
    }

    private BusinessException(Throwable cause, String identifier, List<String> messages) {
        super(cause);
        this.identifier = identifier;
        this.messages = messages;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public List<String> getMessages() {
        return this.messages;
    }

    @Override
    public String getMessage() {
        String message = "";

        if (ObjectUtils.isEmpty(super.getMessage()))
            message += super.getMessage() + "\n";

        if (!CollectionUtils.isEmpty(messages))
            message += String.join("\n", messages);

        return message;
    }
}
