package org.example.Lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        System.out.println(maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0)); //de cima pra baixo a prioridade

        int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0); //de baixo pra cima a prioridade
    }

}
