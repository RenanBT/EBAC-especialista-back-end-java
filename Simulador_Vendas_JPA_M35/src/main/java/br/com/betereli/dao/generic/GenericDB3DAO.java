package main.java.br.com.betereli.dao.generic;

import main.java.br.com.betereli.domain.Persistente;

import java.io.Serializable;

public abstract class GenericDB3DAO <T extends Persistente, E extends Serializable>
        extends GenericDAO<T,E> {

    public GenericDB3DAO(Class<T> persistenteClass) {
        super(persistenteClass, "Mysql1");
    }

}
