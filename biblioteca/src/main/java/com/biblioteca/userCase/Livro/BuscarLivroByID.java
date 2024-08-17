package com.biblioteca.userCase.Livro;

import com.biblioteca.Entidades.CadastroLivros;
import com.biblioteca.Repositorios.RepositorioLivros;
import com.biblioteca.config.TratamentoDeErro.execption.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuscarLivroByID {

    @Autowired
    private RepositorioLivros repositorioLivros;

    public CadastroLivros executar(Long id) {
        return repositorioLivros.findById(id).orElseThrow(() -> new BusinessException("Livro não encontrado"));
    }
}
