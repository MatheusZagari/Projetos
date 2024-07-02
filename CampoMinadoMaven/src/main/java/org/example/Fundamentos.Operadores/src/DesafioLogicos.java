package org.example.Fundamentos.Operadores.src;

public class DesafioLogicos {
    public static void main(String[] args) {
        //Trabalho na terça (V ou F)
        //Trabalho na quinta (V ou F)

        boolean trabalho1 = true;
        boolean trabalho2 = false;

        boolean comprouTv50 = trabalho1 && trabalho2; //trabalhou terça E quinta
        boolean comprouTv32 = trabalho1 ^ trabalho2; //trabalhou terça OU EXCLUSIVO quinta
        boolean comprouSorvete = trabalho1 || trabalho2; //trabalhou terça OU quinta
        boolean maisSaudavel  = !comprouSorvete; //Negação e Operador Unário

        System.out.println("Comprou TV 50\"? " + comprouTv50);
        System.out.println("Comprou TV 32\"? " + comprouTv32);
        System.out.println("Comprou Sorvete? " + comprouSorvete);

        //Operador Unário
        System.out.println("Mais Saudável? " + maisSaudavel);


    }
}
