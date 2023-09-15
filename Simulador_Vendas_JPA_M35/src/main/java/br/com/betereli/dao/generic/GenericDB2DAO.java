package main.java.br.com.betereli.dao.generic;

import main.java.br.com.betereli.domain.Persistente;

import java.io.Serializable;

public abstract class GenericDB2DAO <T extends Persistente, E extends Serializable>
        extends GenericDAO<T,E> {

    public GenericDB2DAO(Class<T> persistenteClass) {
        super(persistenteClass, "Postgre2");
    }

}
