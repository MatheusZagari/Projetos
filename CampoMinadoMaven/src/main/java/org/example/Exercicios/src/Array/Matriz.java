package org.example.Exercicios.src.Array;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantos alunos? ");
        int qtdeAlunos = entrada.nextInt();

        System.out.print("Quantas notas por aluno?");
        int qtdeNotas = entrada.nextInt();

        double[][] notasDaTruma = new double[qtdeAlunos] [qtdeNotas];

        double total = 0;
        for (int i = 0; i < notasDaTruma.length; i++) {
            for (int j = 0; j < notasDaTruma[i].length; j++) {
                System.out.printf("Informe a a nota %d do aluno %d", j, i);

                notasDaTruma[i][j] = entrada.nextDouble();
            }
        }
        double media = total / (qtdeAlunos * qtdeNotas);
        System.out.println("media da turma é " + media);
        entrada.close();
    }
}
