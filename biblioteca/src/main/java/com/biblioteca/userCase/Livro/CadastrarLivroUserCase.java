package com.biblioteca.userCase.Livro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.biblioteca.Entidades.CadastroLivros;
import com.biblioteca.Repositorios.RepositorioLivros;

@Component
public class CadastrarLivroUserCase {
    @Autowired
    private RepositorioLivros repositorioLivros;
    public ResponseEntity<Void> criarLivro(CadastroLivros livro) {
        CadastroLivros cadastroLivros = new CadastroLivros(
                null,
                livro.getTitulo(),
                livro.getAutor(),
                livro.getAnoPublicacao()
        );
        return ResponseEntity.status(HttpStatus.CREATED).body(null);
    }
    public CadastroLivros executar(CadastroLivros livro) {
        return repositorioLivros.save(livro);
    }
}
