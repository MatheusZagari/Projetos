package modelo.umpraum;


import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "assento_id", unique = true)
    private Assento assento;

    //Construtor padrão
    public Cliente() {

    }

    //Construtor com nome e assento
    public Cliente(String nome, Assento assento) {
        super();
        this.nome = nome;
        this.assento = assento;
    }
    //Getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }
    //Fim dos Getter e Setter
}
