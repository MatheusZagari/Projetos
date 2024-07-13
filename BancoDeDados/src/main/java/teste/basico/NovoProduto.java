package teste.basico;

import modelo.basico.Produto;
import infra.DAO;

public class NovoProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Caneta", 7.45);

        DAO<Produto> dao = new DAO<>(Produto.class);
        dao.abrirTransacao().incluirAtomico(produto).fecharTransacao().fechar();
    }
}
