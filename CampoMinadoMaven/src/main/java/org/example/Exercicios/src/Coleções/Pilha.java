package org.example.Exercicios.src.Coleções;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<String>();

        livros.add("o pequeno principe");
        livros.push("hobbit");
        livros.push("dom quixote");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.pop()); //comando pra tirar o valor da linha
        System.out.println(livros.remove());//comando pra tirar o valor da linha

    }
}
