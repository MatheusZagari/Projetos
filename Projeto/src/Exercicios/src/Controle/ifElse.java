package Controle;

import javax.swing.*;

public class ifElse {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("informe o núnmero: ");
        int numero = Integer.parseInt(valor);
        /*
        if(numero % 2 == 0) {
            System.out.println("numero par");
        }
        if(numero % 2 == 1) {
            System.out.println("numero impar");
        }
         */
        if (numero % 2 == 0) { // o comando ta falando "se o resto da divisão por 2 for zero ele é par, se não é impar
            System.out.println("numero par!!");
        }
        else {
            System.out.println("numero impar!!");
        }
    }
}
