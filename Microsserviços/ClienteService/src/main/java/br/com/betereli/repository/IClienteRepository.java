package br.com.betereli.repository;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.betereli.domain.Cliente;

public interface IClienteRepository extends MongoRepository<Cliente, String>{

	Optional<Cliente> findByCpf(Long cpf);
}
