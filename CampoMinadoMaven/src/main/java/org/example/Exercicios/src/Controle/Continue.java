package org.example.Exercicios.src.Controle;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            if (i % 2 == 1) {
                continue; //continue interrompe a repetição e depois continua ela
            }
            System.out.println(i);
        }
    }
}
