package br.com.cod3r.exerciciossb.controlles;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping (path = "/calculadora")
public class CalculadoraController {
    // /calçculadora/somar/10/20
    @GetMapping(path = "/somar/{a}/{b}")
    public int somar(@PathVariable int a,@PathVariable int b) {
            return a + b;
    }
    // /calçculadora/subtrair/10/20
    @GetMapping(path = "/subtrair")
    public int subtrair(@RequestParam(name = "a") int a,@RequestParam(name = "b") int b) {
            return a - b;
    }
}
