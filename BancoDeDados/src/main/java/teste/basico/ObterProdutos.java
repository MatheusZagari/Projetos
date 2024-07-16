package teste.basico;

import infra.ProdutoDAO;
import modelo.basico.Produto;

import java.util.List;

public class ObterProdutos {
    public static void main(String[] args) {
        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> produtos = dao.obterTodos(10, 0);

        for (Produto produto : produtos) {
            System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome());
        }
        double precoTotal = produtos.stream().map(p -> p.getPreco()).reduce(0.0, (t, p) -> t+ p).doubleValue();
        System.out.println("Valor total dos produtos: " + precoTotal);

        dao.fechar();
    }
}