package org.example.Fundamentos.Operadores.src;

public class Relacionais {
    public static void main(String[] args) {
        int a = 97;
        int b = 'a';

        System.out.println(a== b);

        System.out.println( 3 > 4); //Maior
        System.out.println( 3 >= 3); //Maior igual
        System.out.println( 3 < 7); //Menor
        System.out.println( 3 <= 7); //Menor igual
        System.out.println(30 != 7); //Diferente

        double nota = 7.3;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;

        boolean temDesconto = bomComportamento && passouPorMedia;

        System.out.println("Tem desconto? " + temDesconto);
    }
}
