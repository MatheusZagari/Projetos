package com.biblioteca.userCase.Emprestimo;

import com.biblioteca.Entidades.Emprestimo;
import com.biblioteca.Repositorios.RepositorioEmprestimo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListarTodosOsEmprestimos {

    @Autowired
    private RepositorioEmprestimo repositorioEmprestimo;

    // GET - Listar todos os empréstimos
    public List<Emprestimo> executar() {
        return repositorioEmprestimo.findAll();
    }

}
