package com.biblioteca.userCase.Emprestimo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.biblioteca.Entidades.Emprestimo;
import com.biblioteca.Entidades.Emprestimo.Status;
import com.biblioteca.Repositorios.RepositorioEmprestimo;

@Component
public class HistoricoEmprestimo {
    // GET - Listar histórico de todos os empréstimos
    @Autowired
    private RepositorioEmprestimo repositorioEmprestimo;

    public List<Emprestimo> executar() {
        return repositorioEmprestimo.findByStatus(Status.DEVOLVIDO);
    }
    
}
