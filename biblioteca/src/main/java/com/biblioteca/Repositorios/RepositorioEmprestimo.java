package com.biblioteca.Repositorios;

import com.biblioteca.Entidades.Emprestimo;
import com.biblioteca.Entidades.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorioEmprestimo extends JpaRepository<Emprestimo, Long> {

    List<Emprestimo> findByStatus(Status status);

    List<Emprestimo> findByUsuarioId(@Param("id") Long id);

}

