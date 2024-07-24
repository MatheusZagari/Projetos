package br.com.cod3r.exerciciossb.controlles;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

    @RequestMapping(path = "/ola")
    public String ola() {
        return "Olá Spring Boot";
    }

    @PostMapping(path = "/saudacao")
    public String saudacao() {
        return "Olá Spring Boot (POST)";
    }
}
