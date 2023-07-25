package br.com.betereli.dao;

import br.com.betereli.Produto;

import java.util.List;

public interface IProdutoDAO {
    Integer cadastrar(Produto produto)throws Exception;

    Produto consultar(String codigo)throws Exception;

    Integer excluir(Produto produtoDB)throws Exception;

    List<Produto> buscarTodos() throws Exception;

    Integer atualizar(Produto produtoDB)throws Exception;
}

