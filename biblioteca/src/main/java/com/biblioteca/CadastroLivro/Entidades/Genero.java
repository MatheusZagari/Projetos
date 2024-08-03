package com.biblioteca.CadastroLivro.Entidades;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "generos")
    private Set<CadastroLivros> books = new HashSet<>();

    // Getters and Setters


}
