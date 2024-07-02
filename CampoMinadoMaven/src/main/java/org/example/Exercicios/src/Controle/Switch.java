package org.example.Exercicios.src.Controle;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String conceito = "";
        System.out.print("Informe a nota: ");
        int nota = entrada.nextInt();

        switch (nota) {
            case 10: case 9:
                conceito = "A";
                break;
            case 7: case 8:
                conceito = "B";
                break;
            case 5: case 6:
                conceito = "C";
                break;
            case 4: case 3:
                conceito = "D";
                break;
            case 1: case 2: case 0:
                conceito = "E";
                break;
            default:
                conceito = "conceito não informado";
        }

        System.out.println("Conceito é " + conceito);
        entrada.close();
    }
}
