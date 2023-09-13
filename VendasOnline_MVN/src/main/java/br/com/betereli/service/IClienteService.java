package br.com.betereli.service;

import java.util.List;

import br.com.betereli.domain.Cliente;
import br.com.betereli.exceptions.DAOException;
import br.com.betereli.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
