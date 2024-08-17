package com.biblioteca.config.TratamentoDeErro.execption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UsuarioNotFoundException extends RuntimeException {

    public UsuarioNotFoundException(String message) {
        super(message == null ? "" : message);
    }

    public UsuarioNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
