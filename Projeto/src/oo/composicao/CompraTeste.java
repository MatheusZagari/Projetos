package oo.composicao;

import java.awt.event.ActionListener;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.cliente = "joão pedro";
        compra1.adicionartem(new Item ("Carol", 20, 14.50));
        compra1.adicionartem(new Item ("Borracha", 10, 10.00));
        compra1.adicionartem(new Item ("Caneta", 18, 27.50  ));


        System.out.println(compra1.itens.size());
        System.out.println("o valor total dos produtos é: " + compra1.valorTotal());
    }
}
