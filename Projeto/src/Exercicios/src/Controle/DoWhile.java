package Controle;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        // if n(....) senteça; ou {}
        // while (...) senteça; ou {}
        // for (...; ,,,; ...) senteça; ou {}

        // do senteça; ou {} while (...)
        Scanner entrada = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println("Você precisa falar " + "as palavras mágicas...");
            System.out.print("Quer sair?");
            texto = entrada.nextLine();

        } while(!texto.equalsIgnoreCase("por favor"));

        System.out.println("Obrigado!");

        entrada.close();


    }
}
