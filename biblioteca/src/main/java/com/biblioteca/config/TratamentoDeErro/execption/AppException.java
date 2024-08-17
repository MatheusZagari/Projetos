package com.biblioteca.config.TratamentoDeErro.execption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class AppException extends RuntimeException {

    public AppException() {
        super();
    }

    public AppException(String message) {
        super(message == null ? "" : message);
    }

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }
}
