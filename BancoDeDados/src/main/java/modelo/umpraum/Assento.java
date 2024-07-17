package modelo.umpraum;

import javax.persistence.*;

@Entity
@Table(name = "assentos")
public class Assento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne(mappedBy = "assento")
    private Cliente cliente;

    //Getter e Setter
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Assento(String s) {
    }
}
