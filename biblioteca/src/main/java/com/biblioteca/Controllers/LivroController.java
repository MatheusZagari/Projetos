package com.biblioteca.Controllers;

import com.biblioteca.Entidades.CadastroLivros;
import com.biblioteca.userCase.Livro.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livros")
@RequiredArgsConstructor
public class LivroController {
    private final CadastrarLivro cadastrarLivro;
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

    @GetMapping
    public List<CadastroLivros> getAllBooks() {
        return buscarTodosOsLivros.executar();
    }

    @PutMapping("/{id}")
    public CadastroLivros updateBook(@PathVariable Long id, @RequestBody CadastroLivros detalheLivro) {
        return atualizarLivro.executar(id, detalheLivro);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        deletarLivroPorId.executar(id);
    }
}
