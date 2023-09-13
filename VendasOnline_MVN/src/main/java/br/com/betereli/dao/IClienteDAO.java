package br.com.betereli.dao;

import java.util.List;

import br.com.betereli.dao.generic.IGenericDAO;
import br.com.betereli.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
