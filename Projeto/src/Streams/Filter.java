package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("João", 7.7);
        Aluno a2 = new Aluno("Maria", 5.8);
        Aluno a3 = new Aluno("Pedro", 9.8);
        Aluno a4 = new Aluno("Ana", 6.8);
        Aluno a5 = new Aluno("Maria", 7.1);
        Aluno a6 = new Aluno("Caio", 4.5);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5,a6);

        Predicate<Aluno> estaAprovado = a -> a.nota >= 7;
        Predicate<Aluno> estaReprovado = a -> a.nota <= 6;
        Function<Aluno, String> aprovado = a -> "Parabens! " + a.nome + " você foi aprovado!";
        Function<Aluno, String> reprovado = a -> "\nQue pena! " + a.nome + " você está reprovado!";

        alunos.stream().filter(estaAprovado).map(aprovado).forEach(System.out::println);
        alunos.stream().filter(estaReprovado).map(reprovado).forEach(System.out::print);

    }
}
