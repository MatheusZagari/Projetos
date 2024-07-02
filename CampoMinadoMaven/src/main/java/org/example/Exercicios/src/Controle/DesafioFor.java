package org.example.Exercicios.src.Controle;

public class DesafioFor {
    public static void main(String[] args) {
        String valor = "#";
        for (int i = 1; i <= 5; i++) {
            System.out.println(valor);
            valor += "#";
        }

        // Versão do desafio
        // Não pode usar o valor número pra contar o laço.

        for(String v = "#"; !v.equals("######"); v += "#") {
            System.out.println(v);
        }
    }
}
