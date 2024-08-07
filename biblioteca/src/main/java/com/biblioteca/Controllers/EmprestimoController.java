package com.biblioteca.Controllers;


import com.biblioteca.Entidades.*;
import com.biblioteca.Entidades.Emprestimo.Status;
import com.biblioteca.Repositorios.*;
import com.biblioteca.userCase.Emprestimo.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/emprestimos")
public class EmprestimoController {
   
        @Autowired
        private RepositorioEmprestimo repositorioEmprestimo;

        @Autowired
        private CadastrarEmprestimo cadastrarEmprestimo;

        @Autowired
        private AtualizarLivroNoRetono atualizarLivroNoRetono;
    
        //@Autowired
        //private HistoricoEmprestimo historicoEmprestimo;

        @Autowired
        private ListarEmprestimosDevolvidos listarEmprestimosDevolvidos;

        @Autowired
        private ListarEmprestimosEmAndament listarEmprestimosEmAndamento;

        @Autowired
        private ListarTodosOsEmprestimos listarTodosOsEmprestimos;

        @Autowired
        private TodosOsEmprestimosPorAutor todosOsEmprestimosPorAutor;
        
        @Autowired
        private DeletarEmprestimo deletarEmprestimo;



        // POST - Cadastrar empréstimo
        @PostMapping
        public Emprestimo createLoan(@RequestBody Emprestimo emprestimo) {
            return cadastrarEmprestimo.executar(emprestimo);
        }        
        // PUT - atualizar cadastro quando o livro é retornado
        @PutMapping("/{id}/devolucao")
        public Emprestimo devolucao(@PathVariable Long id) {
            return atualizarLivroNoRetono.executar(id);
        }
        // GET - Listar todos os empréstimos
        @GetMapping
        public List<Emprestimo> getAllLoans() {
            return listarTodosOsEmprestimos.executar();
        }    
        // GET - Listar todos os empréstimos em andamento
        @GetMapping("/emAndamento")
        public List<Emprestimo> getEmAndamentoByStatus(@RequestParam Status status) {
            return listarEmprestimosEmAndamento.executar(Status.EM_ANDAMENTO);
        }    
        // GET - Listar todos os empréstimos devolvidos
        @GetMapping("/devolvidos")
        public List<Emprestimo> getDevolvidosByStatus(@RequestParam Status status) {
            return listarEmprestimosDevolvidos.executar(Status.DEVOLVIDO);
        }
        // GET - Listar todos os empréstimos de um determinado autor
        @GetMapping("/autor/{id}")
        public List<Emprestimo> getTodosOsEmprestimosPorAutor(@PathVariable Long id) {
            return todosOsEmprestimosPorAutor.executar(id);
        }
        // DELETE - Deletar empréstimo
        @DeleteMapping("/{id}")
        public void deleteEmprestimo(@PathVariable Long id) {
            deletarEmprestimo.executar(id);
        }

        // GET - Listar histórico de todos os empréstimos
        //@GetMapping("/historico")
        //public List<Emprestimo> getLoanHistory() {
        //   return historicoEmprestimo.findByStatus(Status.DEVOLVIDO);
        //}

    }

