package com.biblioteca.userCase.Emprestimo;

import com.biblioteca.Entidades.Emprestimo;
import com.biblioteca.Entidades.Status;
import com.biblioteca.Repositorios.RepositorioEmprestimo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListarEmprestimosDevolvidos {

    @Autowired
    private RepositorioEmprestimo repositorioEmprestimo;

    public List<Emprestimo> executar(Status devolvido) {
        return repositorioEmprestimo.findByStatus(Status.DEVOLVIDO);
    }

}
