package br.com.betereli.services;

import br.com.betereli.dao.IClienteDAO;

import br.com.betereli.domain.Cliente;
import br.com.betereli.exceptions.TipoChaveNaoEncontradaException;
import br.com.betereli.services.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	
	
	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return this.dao.consultar(cpf);
	}
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		
	}


	



}