package modelo.muitospramuitos;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "filmes")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Double nota;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "atores_filmes", joinColumns = @JoinColumn(name = "filme_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "ator_di", referencedColumnName = "id"))//relacionamento entre filmes e atores

    private List<Ator> atores;//lista de atores que participaram de um filme

    //construtores padrões
    public Filme() {

    }
    public Filme(String nome, Double nota) {
        super();
        this.nome = nome;
        this.nota = nota;
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

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public List<Ator> getAtores() {
        if(atores == null) {
            atores = new ArrayList<>();
        }
        return atores;
     }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }

    public void adicionarAtor(Ator ator) {//método para adicionar atores a um filme
        if(ator != null && !getAtores().contains(ator)) {
        atores.add(ator);
        if (!ator.getFilmes().contains(this)) {
            ator.getFilmes().add(this);
            }
        }
    }
}
