package com.biblioteca.userCase.Emprestimo;

import com.biblioteca.Entidades.Emprestimo;
import com.biblioteca.Entidades.Status;
import com.biblioteca.Repositorios.RepositorioEmprestimo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HistoricoEmprestimo {
    // GET - Listar histórico de todos os empréstimos
    @Autowired
    private RepositorioEmprestimo repositorioEmprestimo;

    public List<Emprestimo> executar() {
        return repositorioEmprestimo.findByStatus(Status.DEVOLVIDO);
    }

}
