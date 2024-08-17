package com.biblioteca.userCase.Emprestimo;

import com.biblioteca.Entidades.Emprestimo;
import com.biblioteca.Entidades.Status;
import com.biblioteca.Repositorios.RepositorioEmprestimo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

@Component
public class CadastrarEmprestimo {
    @Autowired
    private RepositorioEmprestimo repositorioEmprestimo;

    // POST - Cadastrar empréstimo
    @PostMapping
    public Emprestimo executar(Emprestimo emprestimo) {
        emprestimo.setEmprestimoData(LocalDate.now());
        emprestimo.setStatus(Status.EM_ANDAMENTO);
        return repositorioEmprestimo.save(emprestimo);
    }

}
