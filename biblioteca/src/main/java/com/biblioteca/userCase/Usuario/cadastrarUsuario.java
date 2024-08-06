package com.biblioteca.userCase.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.biblioteca.Entidades.CadastroUsuario;
import com.biblioteca.Repositorios.*;

@Component
public class cadastrarUsuario {

    @Autowired
    private RepositorioUsuario repositorioUsuario;


    public CadastroUsuario executar(CadastroUsuario usuario) {
        return repositorioUsuario.save(usuario);
    }
}
