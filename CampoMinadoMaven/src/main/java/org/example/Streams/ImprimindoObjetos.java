package org.example.Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("João", "Maria", "Pedro");

        System.out.println("Usando forEach");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nUsando Iterator");
        Iterator<String> it = aprovados.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("\nUsando Stream");
        Stream<String> st = aprovados.stream();
        st.forEach(System.out::println); //Laço interno

//        for (int i = 0; i < aprovados.size(); i++) {
//            System.out.println(aprovados.get(i));
//        }
    }
}
