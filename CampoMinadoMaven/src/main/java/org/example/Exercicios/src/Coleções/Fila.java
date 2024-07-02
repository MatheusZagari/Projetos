package org.example.Exercicios.src.Coleções;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        //offer e add -> adiciona elementos na fila.
        // difrença é o comportamento quando a fila está cheia
        fila.add("ana"); //retorna false
        fila.offer("bia"); //lança uma exceção
        fila.add("calos");
        fila.offer("daniel");
        fila.add("rafaela");
        fila.offer("gui");

        //peek e element -> obter o próximo elemento da fila sem remover.
        //Difenreça é o comportamento ocorre qunado a fila está vazia.
        System.out.println(fila.peek()); //retorne false
        System.out.println(fila.peek());
        System.out.println(fila.element()); //lança uma exceção

        System.out.println(fila.poll());

    }
}
