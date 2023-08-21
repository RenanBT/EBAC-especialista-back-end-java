package main.java.br.com.betereli.dao;

import main.java.br.com.betereli.dao.generic.GenericDAO;
import main.java.br.com.betereli.domain.Cliente;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

    public ClienteDAO() {
        super(Cliente.class);
    }

}