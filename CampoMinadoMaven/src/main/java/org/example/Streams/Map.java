package org.example.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Mercedes ");
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

//      System.out.println(maiuscula.andThen(primeiraLetra).andThen(grito).apply("BMW"));
        System.out.println("\n\nUsando composição:");
        marcas.stream().map(Utilitarios.maiuscula).map(Utilitarios.primeiraLetra).map(Utilitarios.grito).forEach(print);
    }

}
