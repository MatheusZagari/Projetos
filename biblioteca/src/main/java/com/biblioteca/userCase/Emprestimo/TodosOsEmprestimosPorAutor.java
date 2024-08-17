package com.biblioteca.userCase.Emprestimo;

import com.biblioteca.Entidades.Emprestimo;
import com.biblioteca.Repositorios.RepositorioEmprestimo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TodosOsEmprestimosPorAutor {
    // GET - Listar todos os empréstimos devolvidos de um determinado autor
    @Autowired
    private RepositorioEmprestimo repositorioEmprestimo;

    public List<Emprestimo> executar(Long id) {
        return repositorioEmprestimo.findByUsuarioId(id);
    }

}
