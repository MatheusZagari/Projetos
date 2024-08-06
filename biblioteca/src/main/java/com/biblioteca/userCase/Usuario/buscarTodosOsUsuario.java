package com.biblioteca.userCase.Usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.biblioteca.Entidades.*;
import com.biblioteca.Repositorios.*;
@Component
public class buscarTodosOsUsuario {

    @Autowired
     private RepositorioUsuario repositorioUsuario;

     public List<CadastroUsuario> executar() {
        return repositorioUsuario.findAll();
     }
}
