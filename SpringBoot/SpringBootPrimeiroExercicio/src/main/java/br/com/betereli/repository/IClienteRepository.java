package br.com.betereli.repository;

import br.com.betereli.domain.Cliente;
import br.com.betereli.domain.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long> {



    void saveAll(Cliente cliente, Produto produto);
}
