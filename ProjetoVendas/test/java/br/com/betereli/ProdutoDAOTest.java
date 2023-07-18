package br.com.betereli;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.betereli.dao.ProdutoDAO;
import br.com.betereli.domain.Produto;
import br.com.betereli.exceptions.TipoChaveNaoEncontradaException;

public class ProdutoDAOTest {
	
	private ProdutoDAO produtoDao;

	private Produto produto;
	
	public ProdutoDAOTest() {
		produtoDao = new ProdutoDAO();
	}
	
	@Before
	public void init() throws TipoChaveNaoEncontradaException {
		produto = new Produto();
		produto.setCodigo("A1");
		produto.setNome("Produto 1");
		produto.setValor(BigDecimal.TEN);
		produtoDao.cadastrar(produto);
	}
	
	@Test
	public void pesquisar() {
		Produto produto = this.produtoDao.consultar(this.produto.getCodigo());
		Assert.assertNotNull(produto);
	}
	
	@Test
	public void salvar() throws TipoChaveNaoEncontradaException {
		produto.setCodigo("A2");
		Boolean retorno = produtoDao.cadastrar(produto);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluir() {
		produtoDao.excluir(produto.getCodigo());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		produto.setNome("Rodrigo Pires");
		produtoDao.alterar(produto);
		
		Assert.assertEquals("Rodrigo Pires", produto.getNome());
	}

}
