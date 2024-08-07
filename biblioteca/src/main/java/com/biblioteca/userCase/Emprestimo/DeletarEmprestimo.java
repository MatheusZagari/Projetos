package com.biblioteca.userCase.Emprestimo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.biblioteca.Repositorios.RepositorioEmprestimo;

@Component
public class DeletarEmprestimo {
    @Autowired
    private RepositorioEmprestimo repositorioEmprestimo;

    public void executar(Long id) {
        repositorioEmprestimo.deleteById(id);
    }
    
}
