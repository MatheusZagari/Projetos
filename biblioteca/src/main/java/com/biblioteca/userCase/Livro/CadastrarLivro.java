package com.biblioteca.userCase.Livro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.biblioteca.Entidades.CadastroLivros;
import com.biblioteca.Repositorios.RepositorioLivros;

@Component
public class CadastrarLivro {

    @Autowired
    private RepositorioLivros repositorioLivros;

    public CadastroLivros executar(CadastroLivros livro) {
        return repositorioLivros.save(livro);
    }
}
