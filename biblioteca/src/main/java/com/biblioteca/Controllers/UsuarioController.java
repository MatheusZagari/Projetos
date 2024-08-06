package com.biblioteca.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.biblioteca.Repositorios.*;
import com.biblioteca.Entidades.*;   
import com.biblioteca.userCase.Usuario.*;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
    // Autowired - Inserir no respositório
    @Autowired
    private RepositorioUsuario repositorioUsuario;
    // Autowired - Inserir no respositório via PUT
    @Autowired
    private atualizarUsuario atualizarUsuario;
    // Autowired - Inserir no respositório
    @Autowired
    private cadastrarUsuario cadastrarUsuario;
    // Autowired - Inserir no respositório 
    @Autowired
    private buscarTodosOsUsuario buscarTodosOsUsuario;
    // Autowired - Inserir no respositório 
    @Autowired
     private deletarUsuarioPorId deletarUsuarioPorId;
    

    // POST - Cadastrar usuário
    @PostMapping
    public CadastroUsuario createUser(@RequestBody CadastroUsuario usuario) {
        return cadastrarUsuario.executar(usuario);
    }
    // GET - Listar todos os usuários
    @GetMapping
    public List<CadastroUsuario> getAllUsers() {
        return buscarTodosOsUsuario.executar();
    }
    // PUT - Atualizar usuário
    // método usado para atualizar os dados do usuário, sendo eles nome e email
    @PutMapping("/{id}")
    public CadastroUsuario updateBook(@PathVariable Long id, @RequestBody CadastroUsuario detalheUsuario) {
        return atualizarUsuario.executar(id, detalheUsuario);
    }
    // DELETE - Deletar usuário
    // é o metodo utlizado para mapear os usuarios cadastrados e deletar o registro através do id
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        deletarUsuarioPorId.executar(id);
    }
}
