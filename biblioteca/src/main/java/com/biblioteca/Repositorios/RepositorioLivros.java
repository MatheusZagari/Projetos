package com.biblioteca.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.Entidades.CadastroLivros;

public interface RepositorioLivros extends JpaRepository<CadastroLivros, Long> {

}