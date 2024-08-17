package com.biblioteca;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@OpenAPIDefinition(
        info = @Info(
                title = "Sistemas de Biblioteca",
                description = "Web Service para controle da API do Sistema de Biblioteca Backend",
                contact = @Contact(
                        email = "suporte@sistemabiblioteca.com.br",
                        name = "Sistema de Biblioteca Suporte"
                ),
                version = "1.0.0"
        )
)
@ComponentScan(basePackages = "com.biblioteca")
@EntityScan(basePackages = "com.biblioteca.Entidades")
@SpringBootApplication
public class BibliotecaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BibliotecaApplication.class, args);
    }


}
