package org.example.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MiniMax {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("João", 7.1);
        Aluno a2 = new Aluno("Gabi", 6.1);
        Aluno a3 = new Aluno("Bia", 9.5);
        Aluno a4 = new Aluno("Iza", 8.5);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Comparator<Aluno> mlehorNota = (aluno1, aluno2) -> {
            if (aluno1.nota > aluno2.nota)  return 1;
            if (aluno1.nota < aluno2.nota)  return -1;
            return 0;
        };

        System.out.println(alunos.stream().max(mlehorNota).get());
        System.out.println(alunos.stream().min(mlehorNota).get());
    }
}
