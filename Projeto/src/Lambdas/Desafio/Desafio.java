package Lambdas.Desafio;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
//        1. A partir do produto calcular o preco real (com desconto)
//        2. Importo Municipal: >= 2500 (8,5%)/ < 2500 (insento)
//        3. Frete: >= 3000 (100) / < 3000 (50)
//        4. Arredondar: Deixsar duas casas decimais
//        5. Formatar: R$1234,56
        Produto p = new Produto("ipad", 3235.89, 0.13);

        Function<Produto, Double> precoFinal = p1 -> p1.preco * (1 - p1.desconto);
        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar = preco -> Math.round(preco * 100.0) / 100.0;
        Function<Double, String> formatar = preco -> String.format("R$%.2f", preco).replace(".", ",");

        String preco = precoFinal.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar).apply(p);

        System.out.println("Preço: " + preco);
    }
}
