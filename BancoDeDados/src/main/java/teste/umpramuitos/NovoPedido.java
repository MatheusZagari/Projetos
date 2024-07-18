package teste.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class NovoPedido {
    public static void main(String[] args) {
        DAO<Object> dao = new DAO<>();


        Pedido pedido = new Pedido();
        Produto produto = new Produto("Geladeira", 2499.99);
        ItemPedido item = new ItemPedido(produto, pedido, 10);

        dao.abrirTransacao().incluir(item).incluir(pedido).incluir(produto).fecharTransacao().fechar();
    }
}
