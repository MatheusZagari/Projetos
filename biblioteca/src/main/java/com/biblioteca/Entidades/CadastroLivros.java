package com.biblioteca.Entidades;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class CadastroLivros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    
    private String title;
    private String author;
    private int publicationYear;
    private String isbn;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "livro_genero",
        joinColumns = @JoinColumn(name = "livro_id"),
        inverseJoinColumns = @JoinColumn(name = "genero_id")
    )
    private Set<Genero> generos = new HashSet<>();

    public void setGenres(Object genres) {
        throw new UnsupportedOperationException("Unimplemented method 'setGenres'");
    }
}