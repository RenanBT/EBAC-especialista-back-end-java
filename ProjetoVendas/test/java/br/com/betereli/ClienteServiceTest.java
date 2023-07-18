package br.com.betereli;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.betereli.dao.ClienteDAOMock;
import br.com.betereli.dao.IClienteDAO;
import br.com.betereli.domain.Cliente;
import br.com.betereli.exceptions.TipoChaveNaoEncontradaException;
import br.com.betereli.services.ClienteService;
import br.com.betereli.services.IClienteService;

public class ClienteServiceTest {
	
	private IClienteService clienteService;
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDAOMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente(); 
		cliente.setCpf(1234567891L);
		cliente.setNome("Renan");
		cliente.setCidade("Campinas");
		cliente.setEnd("Rua teste");
		cliente.setNumero(10);
		cliente.setEstado("SP");
		cliente.setTel(19977158063L);
		
		
	}
	@Test
	public void pesquisarCliente() {
			
			Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
			assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
		
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException{
		
		cliente.setNome("Renan Betereli");
		clienteService.alterar(cliente);
		Assert.assertEquals("Renan Betereli", cliente.getNome());
		
	}

}
