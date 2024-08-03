package com.biblioteca.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.biblioteca.Repositorios.RepositorioUsuario;
import com.biblioteca.Entidades.CadastroUsuario;

@RestController
@RequestMapping("/api/usuariuo")
public class UsuarioController {

    @Autowired
    private RepositorioUsuario RepositorioUsuario;

    @PostMapping
    public CadastroUsuario createUser(@RequestBody CadastroUsuario usuario) {
        return RepositorioUsuario.save(usuario);
    }

    @GetMapping
    public List<CadastroUsuario> getAllUsers() {
        return RepositorioUsuario.findAll();
    }

    @PutMapping("/{id}")
    public CadastroUsuario updateUser(@PathVariable Long id, @RequestBody CadastroUsuario userDetails) {
        CadastroUsuario user = RepositorioUsuario.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());
        return RepositorioUsuario.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        RepositorioUsuario.deleteById(id);
    }
}
