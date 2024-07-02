package org.example.excecao.personalizadaA;

@SuppressWarnings("serial")
public class numeroNegativoException extends RuntimeException {
    private String nomeDoAtributo;

    public numeroNegativoException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O valor do atributo '%s' é negativo", nomeDoAtributo);
    }
}
