package br.com.betereli.dao;

import br.com.betereli.domain.Cliente;

import java.util.Collection;

public interface IClienteDAO {
    public Boolean cadastar (Cliente cliente);

    public void excluir(Long cpf);

    public void alterar (Cliente cliente);

    public Cliente consultar (Long cpf);

    public Collection<Cliente> buscarTodos();

}
