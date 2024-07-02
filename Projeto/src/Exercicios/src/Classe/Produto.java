package Classe;

public class Produto {
    String nome;
    double preco;
    static double desconto;

    Produto (){

    }

    Produto (String nomeInicial, double precoInicial, double descontoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    }

    public String precoComDesconto() {
        return "";
    }
}
