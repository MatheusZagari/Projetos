package modelo.muitospramuitos;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    @ManyToMany(mappedBy = "sobrinhos")
    private List<Sobrinho> sobrinhos = new ArrayList<>();

    //construtores padrões
    public Tio() {

    }
    public Tio(String nome) {
        super();
        this.nome = nome;
    }

    //getters e setters
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

    public List<Sobrinho> getSobrinhos() {
        return sobrinhos;
    }

    public void setSobrinhos(List<Sobrinho> sobrinhos) {
        this.sobrinhos = sobrinhos;
    }
    //fim getters e setters
}
