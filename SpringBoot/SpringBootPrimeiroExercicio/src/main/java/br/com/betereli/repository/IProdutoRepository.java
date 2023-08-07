package br.com.betereli.repository;

import br.com.betereli.domain.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProdutoRepository extends CrudRepository<Produto, Long> {
    void saveAll();
}
