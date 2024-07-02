package org.example.Fundamentos.Operadores.src;

public class DesafioOperadoresAritmeticos {
    public static void main(String[] args) {
        // Desafio feito antes de ver a resolução
        int a = 6 * (3 + 2);
        int b = (int) Math.pow(a, 2); // Comando Math usado pra elevar a potência do número
        int equacao1 = b / 6;

        int c = (1 - 5) * (2 - 7);
        int d = c / 2;
        int equacao2 = (int) Math.pow(d, 2);

        int equacao3 = equacao1 - equacao2;
        int equacao4 = (int) Math.pow(equacao3, 3);

        int numeroDivisao = (int) Math.pow(10, 3);
        int equacao5 = equacao4 / numeroDivisao;


        System.out.println("Primeira conta, soma e depois multiplicação, resultado: " + equacao1);
        System.out.println("\nSegunda conta, duas subtrações e multiplicação, resultado: " + equacao2);
        System.out.println("\nTerceira conta, principal subtração entra as duas primeiras contas, resultado: " + equacao3);
        System.out.println("\nElevação do resultado da tercerira conta a terceira potência, resultado: " + equacao4);
        System.out.println("\nDivisão do resultado da elevação da tereceira potência, 10 elevado a terceira, resultado: " + equacao5);


    }
}
