package org.example.composicao.heranca.Desafio;

public interface Luxo {
    void ligarAr();
    void desligarAr();
    default int velocidadeDoAr() {
        return 1;
    }
}
