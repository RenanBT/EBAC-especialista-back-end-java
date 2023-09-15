package main.java.br.com.betereli.dao;

import main.java.br.com.betereli.dao.generic.IGenericDAO;
import main.java.br.com.betereli.domain.Cliente;
import main.java.br.com.betereli.domain.Persistente;

public interface IClienteDAO<T extends Persistente> extends IGenericDAO<T, Long>{

}
