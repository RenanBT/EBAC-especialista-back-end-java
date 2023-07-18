package br.com.betereli;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.betereli.dao.ClienteDAO;
import br.com.betereli.dao.ClienteDAOMock;
import br.com.betereli.dao.IClienteDAO;
import br.com.betereli.domain.Cliente;
import br.com.betereli.exceptions.TipoChaveNaoEncontradaException;

public class ClienteDAOTest {
		
		private IClienteDAO clienteDao;
		
		private Cliente cliente;
		
		public ClienteDAOTest() {
			clienteDao = new ClienteDAOMock();		
		}
	
		@Before
		public void init() throws TipoChaveNaoEncontradaException {
			cliente = new Cliente(); 
			cliente.setCpf(1234567891L);
			cliente.setNome("Renan");
			cliente.setCidade("Campinas");
			cliente.setEnd("Rua teste");
			cliente.setNumero(10);
			cliente.setEstado("SP");
			cliente.setTel(19977158063L);
			clienteDao.cadastrar(cliente);
			
		}
		
		@Test
		public void pesquisarCliente() {
				
				Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
				
				assertNotNull(clienteConsultado);
		}
		
		@Test
		public void salvarCliente() throws TipoChaveNaoEncontradaException {
			cliente.setCpf(1234567891L);
			Boolean retorno = clienteDao.cadastrar(cliente);
			Assert.assertTrue(retorno);
		}
		
		@Test
		public void excluirCliente() {
			clienteDao.excluir(cliente.getCpf());
			
		}

		@Test
		public void alterarCliente() throws TipoChaveNaoEncontradaException {
			
			cliente.setNome("Renan Betereli");
			clienteDao.alterar(cliente);
			Assert.assertEquals("Renan Betereli", cliente.getNome());
			
		}
		
		

}
