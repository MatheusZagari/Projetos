package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("João", 7.1);
        Aluno a2 = new Aluno("Gabi", 6.1);
        Aluno a3 = new Aluno("Bia", 9.5);
        Aluno a4 = new Aluno("Iza", 8.5);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Predicate<Aluno> reprovado = aprovado.negate();

        //todos batem com o predicado, ou seja, se todos são aprovados
        System.out.println(alunos.stream().allMatch(aprovado));
        //se pelo algum for aprovado vai dar verdadeiro, nenhum bater da falso
        System.out.println(alunos.stream().anyMatch(aprovado));
        //ninguém bate com o predicado, vai retornar verdadeiro, se pelo menos um bate, verdadeiro
        System.out.println(alunos.stream().noneMatch(reprovado));


    }
}
