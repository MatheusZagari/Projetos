package com.biblioteca.Entidades;

import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CadastroUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;

}
