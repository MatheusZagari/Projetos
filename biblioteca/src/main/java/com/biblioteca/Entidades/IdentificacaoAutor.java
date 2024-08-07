package com.biblioteca.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
public class IdentificacaoAutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private IdentificacaoAutor autor;

    // Contrutores

    public IdentificacaoAutor() {

    }

    public IdentificacaoAutor(Long id, String nome, IdentificacaoAutor autor) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
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

    public IdentificacaoAutor getAutor() {
        return autor;
    }

    public void setAutor(IdentificacaoAutor autor) {
        this.autor = autor;
    }

}
