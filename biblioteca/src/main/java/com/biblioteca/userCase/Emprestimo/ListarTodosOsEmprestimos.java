package com.biblioteca.userCase.Emprestimo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.biblioteca.Entidades.Emprestimo;
import com.biblioteca.Repositorios.RepositorioEmprestimo;

public class ListarTodosOsEmprestimos {

        @Autowired
        private RepositorioEmprestimo repositorioEmprestimo;

        // GET - Listar todos os empréstimos
        public List<Emprestimo> executar() {
            return repositorioEmprestimo.findAll();
        }
    
}
