package br.com.betereli.dao;

import br.com.betereli.dao.generics.GenericDAO;
import br.com.betereli.domain.Cliente;
import br.com.betereli.exceptions.TipoChaveNaoEncontradaException;

public class ClienteDAOMock extends GenericDAO<Cliente, Long> implements IClienteDAO {
    
    
	@Override
	public void excluir(Long cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Cliente consultar(Long valor) {
		Cliente cliente = new Cliente();
		cliente.setCpf(valor);
		return cliente;
	}

	@Override
	public Class<Cliente> getTipoClasse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
		// TODO Auto-generated method stub
		
	}
}
