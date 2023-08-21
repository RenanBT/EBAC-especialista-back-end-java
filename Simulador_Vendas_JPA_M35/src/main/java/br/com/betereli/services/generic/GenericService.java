package main.java.br.com.betereli.services.generic;

import main.java.br.com.betereli.dao.generic.IGenericDAO;
import main.java.br.com.betereli.domain.Persistente;
import main.java.br.com.betereli.exceptions.DAOException;
import main.java.br.com.betereli.exceptions.MaisDeUmRegistroException;
import main.java.br.com.betereli.exceptions.TableException;
import main.java.br.com.betereli.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public class GenericService <T extends Persistente, E extends Serializable>
        implements IGenericService<T, E> {

    protected IGenericDAO<T, E> dao;

    public GenericService(IGenericDAO<T, E> dao) {
        this.dao = dao;
    }


    @Override
    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
        return this.dao.cadastrar(entity);
    }

    @Override
    public void excluir(T entity) throws DAOException {
        this.dao.excluir(entity);
    }

    @Override
    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
        return this.dao.alterar(entity);
    }

    @Override
    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException {
        return this.dao.consultar(valor);
    }

    @Override
    public Collection<T> buscarTodos() throws DAOException {
        return this.dao.buscarTodos();
    }


}