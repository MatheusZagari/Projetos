package com.biblioteca.Controllers;

import com.biblioteca.Entidades.CadastroLivros;
import com.biblioteca.userCase.Livro.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livros")
@RequiredArgsConstructor
public class LivroController {
    private final CadastrarLivroUserCase cadastrarLivro;
    private final DeletarLivroPorId deletarLivroPorId;
    private final AtualizarLivro atualizarLivro;
    private final BuscarTodosOsLivros buscarTodosOsLivros;
    private final BuscarLivroByID buscarLivroByID;

    @PostMapping
    public CadastroLivros createBook(@RequestBody CadastroLivros livro) {
        return cadastrarLivro.executar(livro);
    }

    // GET - Consulta livro por ID
    @GetMapping("/{id}")
    public CadastroLivros buscarLibroById(@PathVariable Long id) {
        return buscarLivroByID.executar(id);
    }
    // GET - Consulta de todos os livros
    @GetMapping
    public List<CadastroLivros> getAllBooks() {
        return buscarTodosOsLivros.executar();
    }
    // PUT - Atualizar livro
    @PutMapping("/{id}")
    public CadastroLivros updateBook(@PathVariable Long id, @RequestBody CadastroLivros detalheLivro) {
        return atualizarLivro.executar(id, detalheLivro);
    }
    // DELETE - Deletar livro
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        deletarLivroPorId.executar(id);
    }
}
