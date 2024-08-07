package com.biblioteca.userCase.Emprestimo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;


import com.biblioteca.Entidades.Emprestimo;
import com.biblioteca.Entidades.Emprestimo.Status;
import com.biblioteca.Repositorios.RepositorioEmprestimo;

@Component
public class CadastrarEmprestimo {
        @Autowired
        private RepositorioEmprestimo repositorioEmprestimo;

        // POST - Cadastrar empréstimo
        @PostMapping
        public Emprestimo executar(Emprestimo emprestimo) {
            emprestimo.setLoanDate(LocalDate.now());
            emprestimo.setStatus(Status.EM_ANDAMENTO);
            return repositorioEmprestimo.save(emprestimo);
        }  
    
}
