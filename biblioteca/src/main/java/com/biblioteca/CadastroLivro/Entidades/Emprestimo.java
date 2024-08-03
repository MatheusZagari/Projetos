package com.biblioteca.CadastroLivro.Entidades;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

import org.springframework.boot.context.annotation.UserConfigurations;

@Entity
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private CadastroUsuario usuario;

    @ManyToOne
    @JoinColumn(name = "livros_id")
    private CadastroLivros bLivros; 

    private LocalDate loanDate;
    private LocalDate returnDate;

    @Enumerated(EnumType.STRING)
    private Status status;

    // Construtores

    public Emprestimo(Long id, CadastroUsuario usuario, CadastroLivros bLivros, LocalDate loanDate,
            LocalDate returnDate, Status status) {
        this.id = id;
        this.usuario = usuario;
        this.bLivros = bLivros;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.status = status;
    }
    
    // Getters and Setters
    public enum Status {
        EM_ANDAMENTO, DEVOLVIDO
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CadastroUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(CadastroUsuario usuario) {
        this.usuario = usuario;
    }

    public CadastroLivros getbLivros() {
        return bLivros;
    }

    public void setbLivros(CadastroLivros bLivros) {
        this.bLivros = bLivros;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    
}


