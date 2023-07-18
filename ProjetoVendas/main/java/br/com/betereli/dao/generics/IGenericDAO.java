package br.com.betereli.dao.generics;

import java.io.Serializable;
import br.com.betereli.dao.Persistente;
import br.com.betereli.exceptions.TipoChaveNaoEncontradaException;

public interface IGenericDAO <T extends Persistente, E extends Serializable> {

	   
	    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

	    public void excluir(E valor);

	  
	    public void alterar(T entity) throws TipoChaveNaoEncontradaException;

	 
	    public T consultar(E valor);



}
