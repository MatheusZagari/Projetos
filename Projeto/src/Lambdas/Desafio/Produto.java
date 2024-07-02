package Lambdas.Desafio;

public class Produto extends Object{
    public final String nome;
    public double preco;
    public double desconto;
    double precoOriginal;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }
    public String toString() {
        double precoFinal = preco * (1 - desconto);
        return "Nome: " + nome + " tem preço de R$" + precoFinal;
    }
}
