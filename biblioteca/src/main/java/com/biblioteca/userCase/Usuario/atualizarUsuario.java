package com.biblioteca.userCase.Usuario;

import com.biblioteca.Entidades.CadastroUsuario;
import com.biblioteca.Repositorios.RepositorioUsuario;
import com.biblioteca.config.TratamentoDeErro.execption.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class atualizarUsuario {

    @Autowired
    private RepositorioUsuario RepositorioUsuario;


    public CadastroUsuario executar(Long id, CadastroUsuario detalheUsuario) {
        CadastroUsuario usuario = RepositorioUsuario.findById(id).orElseThrow(() -> new BusinessException("Usuário não encontrado"));
        usuario.setNome(detalheUsuario.getNome());
        usuario.setEmail(detalheUsuario.getEmail());
        return RepositorioUsuario.save(usuario);
    }

}
