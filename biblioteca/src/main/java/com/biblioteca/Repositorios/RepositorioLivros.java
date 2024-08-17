package com.biblioteca.Repositorios;

import com.biblioteca.Entidades.CadastroLivros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioLivros extends JpaRepository<CadastroLivros, Long> {

}