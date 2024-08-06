package com.biblioteca.userCase.Livro;

import com.biblioteca.Entidades.CadastroLivros;
import com.biblioteca.Repositorios.RepositorioLivros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BuscarTodosOsLivros {

    @Autowired
    private RepositorioLivros RepositorioLivros;

    public List<CadastroLivros> executar() {
        return RepositorioLivros.findAll();
    }
}
