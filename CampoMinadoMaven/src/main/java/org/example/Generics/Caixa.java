package org.example.Generics;

public class Caixa <TIPO>{
    private TIPO coisa;

    public void guardar(TIPO coisa) {
        this.coisa = coisa;
    }
    public TIPO abrir() {
        return this.coisa;
    }
}
