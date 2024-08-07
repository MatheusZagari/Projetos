package com.biblioteca.Entidades;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

    private LocalDate emprestimoData;
    private LocalDate retornoData;

    @Enumerated(EnumType.STRING)
    private Status status;

    // Construtores

    public Emprestimo(Long id, CadastroUsuario usuario, CadastroLivros bLivros, LocalDate loanDate,
            LocalDate returnDate, Status status) {
        this.id = id;
        this.usuario = usuario;
        this.bLivros = bLivros;
        this.emprestimoData = loanDate;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.retornoData = returnDate;
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
        return emprestimoData;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.emprestimoData = loanDate;
    }

    public LocalDate getReturnDate() {
        return retornoData;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.retornoData = returnDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    
}


