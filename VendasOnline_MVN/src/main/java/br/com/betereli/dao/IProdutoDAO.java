package br.com.betereli.dao;

import java.util.List;

import br.com.betereli.dao.generic.IGenericDAO;
import br.com.betereli.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
