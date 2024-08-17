package com.biblioteca.userCase.Emprestimo;

import com.biblioteca.Entidades.Emprestimo;
import com.biblioteca.Entidades.Status;
import com.biblioteca.Repositorios.RepositorioEmprestimo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class AtualizarLivroNoRetono {

    @Autowired
    private RepositorioEmprestimo repositorioEmprestimo;

    // PUT - atualizar cadastro quando o livro é retornado
    public Emprestimo executar(Long id) {
        Emprestimo emprestimo = repositorioEmprestimo.findById(id).orElseThrow(() ->
                new RuntimeException("Emprestimo não encontrado"));
        emprestimo.setEmprestimoData(LocalDate.now());
        emprestimo.setStatus(Status.DEVOLVIDO);
        return repositorioEmprestimo.save(emprestimo);
    }
}
