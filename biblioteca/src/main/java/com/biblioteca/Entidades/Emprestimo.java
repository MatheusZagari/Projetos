package com.biblioteca.Entidades;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Data @ToString @NoArgsConstructor @AllArgsConstructor
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

    //Método de Formatação da Data

    /*
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
    */
    
}


