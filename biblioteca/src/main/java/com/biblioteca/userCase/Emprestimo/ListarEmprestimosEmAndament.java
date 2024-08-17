package com.biblioteca.userCase.Emprestimo;

import com.biblioteca.Entidades.Emprestimo;
import com.biblioteca.Entidades.Status;
import com.biblioteca.Repositorios.RepositorioEmprestimo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Component
public class ListarEmprestimosEmAndament {

    @Autowired
    private RepositorioEmprestimo repositorioEmprestimo;

    @GetMapping("/emAndamento")
    public List<Emprestimo> executar(Status emAndamento) {
        return repositorioEmprestimo.findByStatus(Status.EM_ANDAMENTO);
    }
}
