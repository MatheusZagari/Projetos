package org.example.Exercicios.src.Controle;

import java.util.Scanner;

public class IF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.print("Informe a média: ");
        double media = entrada.nextDouble();

        if (media >= 7.0 && media <= 10) {
            System.out.println("Aprovado");
        }
        if (media <= 7 && media >= 4.5) {
            System.out.println("Recuperação");
        }
        if (media <= 4.5) {
            System.out.println("Reprovado");
        }
        entrada.close();

    }
}
