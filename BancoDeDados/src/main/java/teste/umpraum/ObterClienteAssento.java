package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {
    public static void main(String[] args) {
        DAO<Cliente> daCliente = new DAO<>(Cliente.class);

        Cliente cliente = daCliente.obterPorId(1L);
        System.out.println(cliente.getAssento().getCliente().getNome());

        daCliente.fechar();

        DAO<Assento> daoAssento = new DAO<>(Assento.class);
        Assento assento = daoAssento.obterPorId(4L);

        System.out.println(assento.getCliente().getNome());

        daoAssento.fechar();
    }
}
