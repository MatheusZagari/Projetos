package com.biblioteca.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.biblioteca.Entidades.Emprestimo;
import com.biblioteca.Entidades.Emprestimo.Status;

public interface RepositorioEmprestimo extends JpaRepository<Emprestimo, Long> {
    
    List<Emprestimo> findByStatus(Status status);

    Emprestimo executar(Emprestimo emprestimo);

    List<Emprestimo> findByAuthorId(@Param("id") Long id);
   
}

