package teste.basico;

import modelo.basico.Produto;
import infra.DAO;

public class NovoProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Caneta", 7.45);

        DAO<Produto> dao = new DAO<>(Produto.class);
        try {
            dao.abrirTransacao().incluirAtomico(produto).fecharTransacao().fechar();
            System.out.println("Produto adicionado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
