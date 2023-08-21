package main.java.br.com.betereli.dao;

import main.java.br.com.betereli.dao.generic.GenericDAO;
import main.java.br.com.betereli.domain.Produto;

public class ProdutoDAO extends GenericDAO<Produto, Long> implements IProdutoDAO {

    public ProdutoDAO() {
        super(Produto.class);
    }

}
