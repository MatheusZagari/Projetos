package org.example.Exercicios.src.Controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        // Domingo -> | Segunda -> 2 | Terça -> 3 | Quarta -> 4 | Quinta -> 5 | Sexta -> 6 | Sánado -> 7
        // Fazer um código que reconheça o número digitado e informe o dia da semana.

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o nome do dia: ");

        String dia = entrada.next(); // o NEXT sem o Line serve pra pegar uma única palavra

        if (dia.equalsIgnoreCase("domingo")) { //o IGNORECASE serve pra não importar se é escrito com letra maiusculo ou minuscula
            System.out.println(1);
        } else if (dia.equalsIgnoreCase("segunda")) {
            System.out.println(2);
        } else if ("terça".equalsIgnoreCase(dia) || "terca".equalsIgnoreCase(dia)) {
            System.out.println(3);
        } else if (dia.equalsIgnoreCase("quarta")) {
            System.out.println(4);
        } else if (dia.equalsIgnoreCase("quinta")) {
            System.out.println(5);
        } else if (dia.equalsIgnoreCase("sexta")) {
            System.out.println(6);
        } else if ("sábado".equalsIgnoreCase(dia) || "sabado".equalsIgnoreCase(dia)) {
            System.out.println(7);
        } else {
            System.out.println("Dia Invalido");
        }

        entrada.close();
    }
}
