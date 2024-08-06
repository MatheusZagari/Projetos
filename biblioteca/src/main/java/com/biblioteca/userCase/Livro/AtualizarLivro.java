package com.biblioteca.userCase.Livro;

import com.biblioteca.Entidades.CadastroLivros;
import com.biblioteca.Repositorios.RepositorioLivros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtualizarLivro {

    @Autowired
    private RepositorioLivros RepositorioLivros;

    public CadastroLivros executar(Long id, CadastroLivros detalheLivro) {
        CadastroLivros livro = RepositorioLivros.findById(id).orElseThrow(() -> new RuntimeException("Livro não encontrado"));
        livro.setTitle(detalheLivro.getTitle());
        livro.setAuthor(detalheLivro.getAuthor());
        livro.setPublicationYear(detalheLivro.getPublicationYear());
        livro.setIsbn(detalheLivro.getIsbn());
        livro.setGenres(detalheLivro.getGenres());
        return RepositorioLivros.save(livro);
    }
}
