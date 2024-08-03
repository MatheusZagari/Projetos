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

    public class LoanController {
    
        @Autowired
        private RepositorioEmprestimo loanRepository;
    
        @PostMapping
        public Emprestimo createLoan(@RequestBody Emprestimo loan) {
            loan.setLoanDate(LocalDate.now());
            loan.setStatus(Status.EM_ANDAMENTO);
            return loanRepository.save(loan);
        }
    
        @PutMapping("/{id}/return")
        public Emprestimo returnBook(@PathVariable Long id) {
            Emprestimo loan = loanRepository.findById(id).orElseThrow(() -> new RuntimeException("Loan not found"));
            loan.setReturnDate(LocalDate.now());
            loan.setStatus(Status.DEVOLVIDO);
            return loanRepository.save(loan);
        }
    
        @GetMapping
        public List<Emprestimo> getAllLoans() {
            return loanRepository.findAll();
        }
    
        @GetMapping("/ongoing")
        public List<Emprestimo> getOngoingLoans() {
            return loanRepository.findByStatus(Status.EM_ANDAMENTO);
        }
    
        @GetMapping("/history")
        public List<Emprestimo> getLoanHistory() {
            return loanRepository.findByStatus(Status.DEVOLVIDO);
        }
    }
    

}
