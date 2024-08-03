package com.biblioteca.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.biblioteca.Entidades.CadastroLivros;
import com.biblioteca.Repositorios.RepositorioLivros;


@RestController
@RequestMapping("/api/CadastroLivros")
public class LivroController {

    @Autowired
    private RepositorioLivros RepositorioLivros;

    @PostMapping
    public CadastroLivros createBook(@RequestBody CadastroLivros book) {
        return RepositorioLivros.save(book);
    }

    @GetMapping
    public List<CadastroLivros> getAllBooks() {
        return RepositorioLivros.findAll();
    }

    @PutMapping("/{id}")
    public CadastroLivros updateBook(@PathVariable Long id, @RequestBody CadastroLivros bookDetails) {
        CadastroLivros book = RepositorioLivros.findById(id).orElseThrow(() -> new RuntimeException("Livro não encontrado"));
        book.setTitle(bookDetails.getTitle());
        book.setAuthor(bookDetails.getAuthor());
        book.setPublicationYear(bookDetails.getPublicationYear());
        book.setIsbn(bookDetails.getIsbn());
        book.setGenres(bookDetails.getGenres());
        return RepositorioLivros.save(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        RepositorioLivros.deleteById(id);
    }    
}
