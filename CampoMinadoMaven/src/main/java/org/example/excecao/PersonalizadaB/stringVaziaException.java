package org.example.excecao.PersonalizadaB;

@SuppressWarnings("serial")
public class stringVaziaException extends RuntimeException {
    private String nomeDoAtributo;

    public stringVaziaException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O valor do atributo '%s' está vazio", nomeDoAtributo);
    }
}
