package com.biblioteca.userCase.Livro;

import com.biblioteca.Repositorios.RepositorioLivros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeletarLivroPorId {

    @Autowired
    private RepositorioLivros repositorioLivros;

    public void executar(Long id) {
        repositorioLivros.deleteById(id);
    }

}
