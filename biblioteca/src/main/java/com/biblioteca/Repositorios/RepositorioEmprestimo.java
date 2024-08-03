package com.biblioteca.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.Entidades.Emprestimo;
import com.biblioteca.Entidades.Emprestimo.Status;

public interface RepositorioEmprestimo extends JpaRepository<Emprestimo, Long> {
    
    List<Emprestimo> findByStatus(Status emAndamento);
   
    
}

