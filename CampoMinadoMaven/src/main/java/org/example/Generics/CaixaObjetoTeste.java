package org.example.Generics;

public class CaixaObjetoTeste {
    public static void main(String[] args) {
        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.aguardar(2.3); // double -> Double

        Double coisaA = (Double) caixaA.abrir();
        System.out.println(coisaA);


        CaixaObjeto caixaB = new CaixaObjeto();
        caixaB.aguardar("Olá");

        String coisaB = (String) caixaB.abrir();
        System.out.println(coisaB);
    }
}
