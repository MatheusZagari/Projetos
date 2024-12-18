package modelo.basico;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "produto", schema = "curso_java")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "prod_nome", length = 200, nullable = false)
    private String nome;

    @Column(name = "prod_preco", nullable = false, precision = 10, scale = 2)
    private double preco;


    public Produto() {

    }
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
