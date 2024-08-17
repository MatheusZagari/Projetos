package com.biblioteca.Controllers;


import com.biblioteca.Entidades.Emprestimo;
import com.biblioteca.Entidades.Status;
import com.biblioteca.userCase.Emprestimo.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emprestimos")
@RequiredArgsConstructor
public class EmprestimoController {
    private final CadastrarEmprestimo cadastrarEmprestimo;
    private final AtualizarLivroNoRetono atualizarLivroNoRetono;
    private final ListarEmprestimosDevolvidos listarEmprestimosDevolvidos;
    private final ListarEmprestimosEmAndament listarEmprestimosEmAndamento;
    private final ListarTodosOsEmprestimos listarTodosOsEmprestimos;
    private final TodosOsEmprestimosPorAutor todosOsEmprestimosPorAutor;
    private final DeletarEmprestimo deletarEmprestimo;


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
}

