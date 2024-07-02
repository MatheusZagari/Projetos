package org.example.Fundamentos.src;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Bom dia X";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        System.out.println(s);

        Double c = 4.789;
        System.out.println(c);

        String y = "Bom dia X".replace("X", "Gui").toUpperCase().concat("!!!");
        System.out.println(y);

        // Tipos primitivos não tem o operador "."
        double a = 3.123;
        System.out.println(a);

        int b = 3;
        System.out.println(b);
    }
}
