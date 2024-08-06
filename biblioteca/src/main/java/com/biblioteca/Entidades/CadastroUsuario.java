package com.biblioteca.Entidades;

import java.util.Date;

import jakarta.persistence.*;

@Entity
public class CadastroUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;

    //Construtores
    public CadastroUsuario() {

    }

    public CadastroUsuario(Long id, String nome, String email, Date dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public static CadastroUsuario executar(CadastroUsuario usuario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executar'");
    }
    
}
