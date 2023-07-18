package br.com.betereli.dao;

import br.com.betereli.dao.generics.GenericDAO;
import br.com.betereli.domain.Produto;

public class ProdutoDAO extends GenericDAO<Produto, String> implements IProdutoDAO {
	
	public ProdutoDAO() {
		super();
	}

	@Override
	public Class<Produto> getTipoClasse() {
		return Produto.class;
	}

	@Override
	public void atualiarDados(Produto entity, Produto entityCadastrado) {
		entityCadastrado.setCodigo(entity.getCodigo());
		entityCadastrado.setNome(entity.getNome());
		entityCadastrado.setValor(entity.getValor());
	}

}
