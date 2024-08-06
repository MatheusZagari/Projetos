package com.biblioteca.userCase.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.biblioteca.Repositorios.RepositorioUsuario;

@Component
public class deletarUsuarioPorId {

    @Autowired
    private RepositorioUsuario repositorioUsuario;

    public void executar(Long id) {
        repositorioUsuario.deleteById(id);
    }
}
