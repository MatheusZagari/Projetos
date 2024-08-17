package com.biblioteca.config.TratamentoDeErro.execption;

public final class UsuarioLogadoException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public UsuarioLogadoException() {
        super();
    }

    public UsuarioLogadoException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public UsuarioLogadoException(final String message) {
        super(message);
    }

    public UsuarioLogadoException(final Throwable cause) {
        super(cause);
    }

}
