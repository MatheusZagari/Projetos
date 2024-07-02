package org.example.Streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
    public final static UnaryOperator<String> maiuscula = s -> s.toUpperCase();
    public final static UnaryOperator<String> primeiraLetra = s -> s.charAt(0) + "";
    public final static UnaryOperator<String> grito = s -> s + "!!! ";
}
