package main.java.br.com.betereli.dao;

import main.java.br.com.betereli.dao.generic.GenericDAO;
import main.java.br.com.betereli.dao.generic.GenericDB1DAO;
import main.java.br.com.betereli.domain.Cliente;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO extends GenericDB1DAO<Cliente, Long> implements IClienteDAO<Cliente> {

    public ClienteDAO() {
        super(Cliente.class);
    }

}