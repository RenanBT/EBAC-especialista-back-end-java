package br.com.betereli.dao;

import br.com.betereli.domain.Cliente;

import java.util.List;

public interface IClienteDAO {

    public Integer cadastrar(Cliente cliente)throws Exception;

    Cliente consultar(String codigo)throws Exception;

    Integer excluir(Cliente clienteBD)throws Exception;

    Integer atualizar(Cliente clienteBD)throws Exception;

    List<Cliente> buscarTodos()throws Exception;
}
