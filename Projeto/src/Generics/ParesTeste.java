package Generics;

public class ParesTeste {
    public static void main(String[] args) {
        Pares<Integer, String> resutladoConcurso = new Pares<>();

        resutladoConcurso.adicionar(1, "Maria");
        resutladoConcurso.adicionar(2, "Pedro");
        resutladoConcurso.adicionar(3, "Gui");
        resutladoConcurso.adicionar(4, "Ana");
        resutladoConcurso.adicionar(2, "Rebeca");

        System.out.println(resutladoConcurso.getValor(1));
        System.out.println(resutladoConcurso.getValor(4));
        System.out.println(resutladoConcurso.getValor(2));
    }
}
