package org.example.Exercicios.src.Classe;

public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc a1 = new AreaCirc(5);
        AreaCirc a2 = new AreaCirc(5);
        //a1.pi = 10;
        AreaCirc.pi = 3.14;
        System.out.println(a1.area());

        //a2.pi = 5;
        System.out.println(a2.area());
        System.out.println(AreaCirc.area(199));
    }
}
