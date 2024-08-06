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

    public void executar(String nome, String email) {
        var usuario = new CadastroUsuario(null, nome, email, new Date());
        repositorioUsuario.save(usuario);

        var livro = new CadastroLivros(null, "Livro 1", "Autor 1", 2021, "978-9789789789789");
        cadastrarLivro.executar(livro);
    }


}
