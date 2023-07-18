package br.com.betereli.services;

import br.com.betereli.dao.generics.IGenericDAO;
import br.com.betereli.domain.Produto;
import br.com.betereli.services.generic.GenericService;


	
	public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

		public ProdutoService(IGenericDAO<Produto, String> dao) {
			super(dao);
			// TODO Auto-generated constructor stub
		}


	}
