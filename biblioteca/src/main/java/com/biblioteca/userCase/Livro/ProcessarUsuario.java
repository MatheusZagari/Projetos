package com.biblioteca.userCase.Livro;

import com.biblioteca.Entidades.CadastroLivros;
import com.biblioteca.Entidades.CadastroUsuario;
import com.biblioteca.Repositorios.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ProcessarUsuario {

    @Autowired
    private CadastrarLivro cadastrarLivro;

    @Autowired
    private RepositorioUsuario repositorioUsuario;

    private CadastroLivros livro;

    public void executar(String nome, String email) {
        cadastrarLivro.executar(livro);
    }


}
