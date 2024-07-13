package teste.basico;

import modelo.basico.Produto;
import infra.DAO;

public class NovoProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Monitor 23",  789.89);

        DAO<Produto> dao = new DAO<>(Produto.class);
        try {
            dao.incluirAtomico(produto).fechar();
            System.out.println("Produto adicionado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Id do produto: " + produto.getId());
    }
}
