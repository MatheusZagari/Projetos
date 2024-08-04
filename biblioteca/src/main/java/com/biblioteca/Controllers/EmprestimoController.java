package com.biblioteca.Controllers;


import com.biblioteca.Entidades.*;
import com.biblioteca.Entidades.Emprestimo.Status;
import com.biblioteca.Repositorios.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/emprestimos")
public class EmprestimoController {
   
        @Autowired
        private RepositorioEmprestimo RepositorioEmprestimo;
    
        @PostMapping
        public Emprestimo createLoan(@RequestBody Emprestimo loan) {
            loan.setLoanDate(LocalDate.now());
            loan.setStatus(Status.EM_ANDAMENTO);
            return RepositorioEmprestimo.save(loan);
        }
    
        @PutMapping("/{id}/retorno")
        public Emprestimo returnBook(@PathVariable Long id) {
            Emprestimo emprestimo = RepositorioEmprestimo.findById(id).orElseThrow(() -> new RuntimeException("Emprestimo não encontrado"));
            emprestimo.setReturnDate(LocalDate.now());
            emprestimo.setStatus(Status.DEVOLVIDO);
            return RepositorioEmprestimo.save(emprestimo);
        }
    
        @GetMapping
        public List<Emprestimo> getAllLoans() {
            return RepositorioEmprestimo.findAll();
        }
    
        @GetMapping("/emAndamento")
        public List<Emprestimo> getOngoingLoans() {
            return RepositorioEmprestimo.findByStatus(Status.EM_ANDAMENTO);
        }
    
        @GetMapping("/historico")
        public List<Emprestimo> getLoanHistory() {
            return RepositorioEmprestimo.findByStatus(Status.DEVOLVIDO);
        }
    }

