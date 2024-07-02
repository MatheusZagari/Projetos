package org.example.Fundamentos.Operadores.src;

public class Logicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && condicao2); // dois && representam o E
        System.out.println(condicao1 || condicao2); // dois || representam o OU
        System.out.println(condicao1 ^ condicao2); // o ^ representa o OU Exclusivo
        System.out.println(!!condicao1); // o !! representa uma dupla negação
        System.out.println(!condicao2); // o ! representa uma negação

        System.out.println("Tabela Verdade E (AND)");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("\nTabela Verdade OU (OR)");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("\nTabela Verdade OU Exclusivo (XOR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("\nTabela Verdade Não (NOT)");
        System.out.println(!true);
        System.out.println(!false);

    }
}
