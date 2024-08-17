package com.biblioteca.Controllers;

import com.biblioteca.Entidades.CadastroUsuario;
import com.biblioteca.Repositorios.RepositorioUsuario;
import com.biblioteca.userCase.Usuario.atualizarUsuario;
import com.biblioteca.userCase.Usuario.buscarTodosOsUsuario;
import com.biblioteca.userCase.Usuario.cadastrarUsuario;
import com.biblioteca.userCase.Usuario.deletarUsuarioPorId;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
@RequiredArgsConstructor
public class UsuarioController {
    // Autowired - Inserir no respositório
    private RepositorioUsuario repositorioUsuario;
    // Autowired - Inserir no respositório via PUT
    private atualizarUsuario atualizarUsuario;
    // Autowired - Inserir no respositório
    private cadastrarUsuario cadastrarUsuario;
    // Autowired - Inserir no respositório
    private buscarTodosOsUsuario buscarTodosOsUsuario;
    // Autowired - Inserir no respositório
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
    // é o método utilizado para mapear os usuários cadastrados e deletar o registro através do id
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        deletarUsuarioPorId.executar(id);
    }
}
