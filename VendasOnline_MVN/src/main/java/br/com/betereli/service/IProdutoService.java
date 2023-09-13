package br.com.betereli.service;

import java.util.List;

import br.com.betereli.domain.Produto;
import br.com.betereli.services.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}