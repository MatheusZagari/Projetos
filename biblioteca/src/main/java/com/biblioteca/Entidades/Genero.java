package com.biblioteca.Entidades;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany(mappedBy = "generos")
    private Set<CadastroLivros> books = new HashSet<>();

    // Construtores

    public Genero(Long id, String nome, Set<CadastroLivros> books) {
        this.id = id;
        this.nome = nome;
        this.books = books;
    }
    
    // Getters and Setters
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

    public Set<CadastroLivros> getBooks() {
        return books;
    }

    public void setBooks(Set<CadastroLivros> books) {
        this.books = books;
    }



}
