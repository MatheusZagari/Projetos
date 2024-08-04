package br.com.cod3r.exerciciossb.controlles;

import br.com.cod3r.exerciciossb.model.entities.Produto;
import br.com.cod3r.exerciciossb.model.repository.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Produto SalvarProduto(@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }
    @GetMapping(path = "/nome/{ParteNome}")
    public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome) {
//      return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
        return produtoRepository.searchByNomeLike(parteNome);
    }

    //Consulta Paginada
    @GetMapping(path = "/paginada/{numeroPagina}")
    public Iterable<Produto> obterProdutosPorPagina(@PathVariable int numeroPagina, @PathVariable int qtdePagina) {
        if (qtdePagina >= 5) qtdePagina = 5;
        Pageable page = (Pageable) PageRequest.of(numeroPagina, qtdePagina);
        return produtoRepository.findAll();
    }
    @GetMapping(path ="/{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
        return produtoRepository.findById(id);
    }
    @DeleteMapping(path ="/{id}")
    public void excluirProduto(@PathVariable int id) {
        produtoRepository.deleteById(id);
    }
//    @PutMapping
//    public Produto alterarProduto(@Valid Produto produto) {
//        return produtoRepository.save(produto);
//        return produto;
//    }
//    @PostMapping
//    public @ResponseBody Produto novoProduto(
//            @RequestParam String nome,
//            @RequestParam double preco,
//            @RequestParam double desconto) {
//        Produto produto = new Produto(nome, preco, desconto);
//        produtoRepository.save(produto);
//        return produto;
//    }
}
