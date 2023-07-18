package br.com.betereli.services;

import br.com.betereli.domain.Cliente;
import br.com.betereli.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {

	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
