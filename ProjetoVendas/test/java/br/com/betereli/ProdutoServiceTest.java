package br.com.betereli;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.betereli.dao.IProdutoDAO;
import br.com.betereli.dao.ProdutoDaoMock;
import br.com.betereli.domain.Produto;
import br.com.betereli.exceptions.TipoChaveNaoEncontradaException;
import br.com.betereli.services.IProdutoService;
import br.com.betereli.services.ProdutoService;

public class ProdutoServiceTest {
	

	private IProdutoService produtoService;
	
	private Produto produto;
	
	public ProdutoServiceTest() {
		IProdutoDAO dao = new ProdutoDaoMock();
		produtoService = new ProdutoService(dao);
	}
	
	@Before
	public void init() {
		produto = new Produto();
		produto.setCodigo("A1");
		produto.setNome("Produto 1");
		produto.setValor(BigDecimal.TEN);
	}
	
	@Test
	public void pesquisar() {
		Produto produtor = this.produtoService.consultar(produto.getCodigo());
		Assert.assertNotNull(produtor);
	}
	
	@Test
	public void salvar() throws TipoChaveNaoEncontradaException {
		Boolean retorno = produtoService.cadastrar(produto);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluir() {
		produtoService.excluir(produto.getCodigo());
	}

}
