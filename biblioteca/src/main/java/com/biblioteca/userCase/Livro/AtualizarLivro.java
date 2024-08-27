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
        CadastroLivros livro = RepositorioLivros.findById(id).orElseThrow(() ->
             new RuntimeException("Livro não encontrado"));
        livro.setGenres(detalheLivro.getTitulo());
        livro.setAutor(detalheLivro.getAutor());
        livro.setAnoPublicacao(detalheLivro.getAnoPublicacao());
        livro.setIsbn(detalheLivro.getIsbn());
        livro.setGenres(detalheLivro.getGeneros());
        return RepositorioLivros.save(livro);
    }
}
