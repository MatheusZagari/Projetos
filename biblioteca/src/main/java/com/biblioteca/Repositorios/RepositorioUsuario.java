package com.biblioteca.Repositorios;

import com.biblioteca.Entidades.CadastroUsuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUsuario extends JpaRepository<CadastroUsuario, Long> {

}