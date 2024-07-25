package br.com.cod3r.exerciciossb.model.repository;

import br.com.cod3r.exerciciossb.model.entities.Produto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {

    public Iterable<Produto> findByNomeContaining(String parteNome);

    //findByNomeContaining
    //findByNomeIsContaining
    //findByNomeContains

    //findByNomeStartingWith
    //findByNomeEndingWith

    //findByNomeNotContaining

    @Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
    public Iterable<Produto> searchByNomeLike(@Param("nome") String nome);

    Iterable<Produto> findAll();

    void save(Produto produto);

    Optional<Produto> findById(int id);

    void deleteById(int id);

    Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
}
