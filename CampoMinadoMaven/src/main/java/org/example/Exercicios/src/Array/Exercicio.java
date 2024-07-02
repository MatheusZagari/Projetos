package org.example.Exercicios.src.Array;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[4];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.8;

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[notasAlunoA.length - 1]); // comando pra pegar o último valor do Array

        double totalAlunoA = 0;
        for (int i = 0; i < 3; i++){
             totalAlunoA += notasAlunoA[i];
        }
        System.out.println(totalAlunoA / notasAlunoA.length);

        final double notaArmazenada = 5.9;
        double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};

        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];
        }
        System.out.println(Arrays.toString(notasAlunoB));
        System.out.println(totalAlunoB / notasAlunoA.length);
    }
}
