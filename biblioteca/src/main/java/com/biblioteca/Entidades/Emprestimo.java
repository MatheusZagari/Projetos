package com.biblioteca.Entidades;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Data
@ToString
@NoArgsConstructor
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
    @Enumerated(EnumType.STRING)
    private Status status;
    // Construtores

    public Emprestimo(Long id, CadastroUsuario usuario, CadastroLivros bLivros, LocalDate loanDate,
                      LocalDate returnDate, Status status) {
        this.id = id;
        this.usuario = usuario;
        this.bLivros = bLivros;
        this.emprestimoData = loanDate;
        this.retornoData = returnDate;
        this.status = status;
    }
}


