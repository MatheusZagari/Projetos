package oo.composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class ClienteTeste {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 9.67, 100);
        compra1.adicionarItem(new Produto("noteebook", 234.56), 2);

        Compra compra2 = new Compra();
        compra1.adicionarItem("Caderno", 10.00, 10);
        compra2.adicionarItem(new Produto("Impressora", 345.67), 5);

        Cliente cliente = new Cliente ("Maria Julia Moraes");
        cliente.compras.add(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.obterValorTotal());

    }
}
