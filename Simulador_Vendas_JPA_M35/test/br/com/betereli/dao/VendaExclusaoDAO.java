package br.com.betereli.dao;

import main.java.br.com.betereli.dao.IVendaDAO;
import main.java.br.com.betereli.dao.generic.GenericDB1DAO;
import main.java.br.com.betereli.domain.Venda;
import main.java.br.com.betereli.exceptions.DAOException;
import main.java.br.com.betereli.exceptions.TipoChaveNaoEncontradaException;

public class VendaExclusaoDAO extends GenericDB1DAO<Venda , Long> implements IVendaDAO {

    public VendaExclusaoDAO(){super(Venda.class);}

    @Override
    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
        throw new UnsupportedOperationException("Operacao Nao Permitida");
    }
    @Override
    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public Venda consultarComCollection(Long id) {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }
}
