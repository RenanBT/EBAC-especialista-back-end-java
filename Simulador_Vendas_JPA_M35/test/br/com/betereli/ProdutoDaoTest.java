package br.com.betereli;

import main.java.br.com.betereli.dao.IProdutoDAO;
import main.java.br.com.betereli.dao.ProdutoDAO;
import main.java.br.com.betereli.domain.Produto;
import main.java.br.com.betereli.exceptions.DAOException;
import main.java.br.com.betereli.exceptions.MaisDeUmRegistroException;
import main.java.br.com.betereli.exceptions.TableException;
import main.java.br.com.betereli.exceptions.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertNull;

public class ProdutoDaoTest {

    private IProdutoDAO produtoDAO;

    public ProdutoDaoTest(){
        this.produtoDAO = new ProdutoDAO();
    }

    @Test
    public void pesquisar() throws MaisDeUmRegistroException, TableException, DAOException, TipoChaveNaoEncontradaException {
        Produto produto = criarProduto("A1");
        Assert.assertNotNull(produto);
        Produto produtoDB = this.produtoDAO.consultar(produto.getId());
        Assert.assertNotNull(produtoDB);
    }

    @Test
    public void salvar() throws TipoChaveNaoEncontradaException, DAOException {
        Produto produto = criarProduto("A2");
        Assert.assertNotNull(produto);
    }

    @Test
    public void excluir() throws DAOException, TipoChaveNaoEncontradaException, MaisDeUmRegistroException, TableException {
        Produto produto = criarProduto("A3");
        Assert.assertNotNull(produto);
        this.produtoDAO.excluir(produto);
        Produto produtoBD = this.produtoDAO.consultar(produto.getId());
        assertNull(produtoBD);
    }

    private Produto criarProduto(String codigo) throws TipoChaveNaoEncontradaException, DAOException {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setDescricao("Produto Teste");
        produto.setNome("Produto 1");
        produto.setValor(BigDecimal.TEN);
        produtoDAO.cadastrar(produto);
        return produto;

    }
}
