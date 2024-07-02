package org.example.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::println;

        Stream<String> langs = Stream.of("Java ", "C++ ", "Python ", "C# " , "Javascript\n");
        langs.forEach(print);

        String[] maisLangs = {"Lisp ", "Lua ", "Perls ", "Go\n"};

        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1, 3).forEach(print);

        List<String> outrasLangs = Arrays.asList("Kotlin ", "C ", "PHP\n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);

//        Stream.generate(() -> "a").forEach(print);
        Stream.iterate(0, n -> n + 1).forEach(println);
    }
}
