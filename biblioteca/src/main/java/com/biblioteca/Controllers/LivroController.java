package com.biblioteca.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.biblioteca.Entidades.CadastroLivros;
import com.biblioteca.userCase.Livro.AtualizarLivro;
import com.biblioteca.userCase.Livro.BuscarTodosOsLivros;
import com.biblioteca.userCase.Livro.CadastrarLivro;
import com.biblioteca.userCase.Livro.DeletarLivroPorId;

@RestController
@RequestMapping("/api/CadastroLivros")
public class LivroController {

    @RestController
    @RequestMapping("/api/livros")
    public class BookController {

        @Autowired
        private CadastrarLivro cadastrarLivro;

        @Autowired
        private DeletarLivroPorId deletarLivroPorId;

        @Autowired
        private AtualizarLivro atualizarLivro;

        @Autowired
        private BuscarTodosOsLivros buscarTodosOsLivros;

        @PostMapping
        public CadastroLivros createBook(@RequestBody CadastroLivros livro) {
            return cadastrarLivro.executar(livro);
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
}
