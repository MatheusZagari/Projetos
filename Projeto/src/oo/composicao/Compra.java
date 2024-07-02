package oo.composicao;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList<Item> itens = new ArrayList<>();

    void adicionartem (Item item){
        itens.add(item);
        item.compra = this;
    }
    void adicionartem (String nome, int quantidade, double preco){
        itens.add(new Item(nome, quantidade, preco));
        Item item = null;
        item.compra = this;
    }

    double valorTotal() {
        double total = 0;

        for(Item item: itens) {
            total += item.quantidade * item.preco;
        }

        return total;
    }
}
