package org.example.Exercicios.src.Controle;

import java.util.Scanner;
import java.util.Locale;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digita a nota: ");
        double nota = entrada.nextDouble();


        if (nota > 10 || nota < 0) {
            System.out.println("Nota invalida");
        }
        else if (nota >= 8.1) {
            System.out.println("Conceito A");
            }
        else if (nota >= 6.1) {
            System.out.println("Conceito B");
        }
        else if (nota >= 4.1) {
            System.out.println("Conceito C");
        }
        else if (nota >= 2.1) {
            System.out.println("Conceito D");
        }
        else {
            System.out.println("Conceito E");
        }

        entrada.close();
    }
}
