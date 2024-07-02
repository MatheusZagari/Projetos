package org.example.Fundamentos.Operadores.src;

public class OperadoresUnários {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        a++; // a = a + 1;
        a--; // a = a - 1;

        ++b; // b = b + 1;
        --b; // b = b - 1;

        System.out.println(a);
        System.out.println(b);

        System.out.println("Mini Desafio...");
        System.out.println(++a == b--); // A ordem do ++ e -- influencia diretamente no momento que vai ser feita a
                                        //substração ou adição, nesse caso a subtração de B vai ser feita depois que
                                        //for feita a comparação do ==

        System.out.println(a);
        System.out.println(b);
    }
}
