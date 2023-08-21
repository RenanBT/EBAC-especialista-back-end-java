package br.com.betereli;

import main.java.br.com.betereli.dao.ClienteDAO;
import main.java.br.com.betereli.dao.IClienteDAO;
import main.java.br.com.betereli.domain.Cliente;
import main.java.br.com.betereli.exceptions.DAOException;
import main.java.br.com.betereli.exceptions.MaisDeUmRegistroException;
import main.java.br.com.betereli.exceptions.TableException;
import main.java.br.com.betereli.exceptions.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Test;

public class ClienteDaoTest {

    private IClienteDAO clienteDAO;

    public ClienteDaoTest(){
        this.clienteDAO = new ClienteDAO();

    }

    @Test
    public void pesquisarCliente() throws TipoChaveNaoEncontradaException, DAOException, MaisDeUmRegistroException, TableException {
        Cliente cliente = criarCliente();
        clienteDAO.cadastrar(cliente);

        Cliente clienteConsultado = clienteDAO.consultar(cliente.getId());
        Assert.assertNotNull(clienteConsultado);

    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException, MaisDeUmRegistroException, TableException, DAOException {
        Cliente cliente = criarCliente();
        Cliente retorno = clienteDAO.cadastrar(cliente);
        Assert.assertNotNull(retorno);

        Cliente clienteConsultado = clienteDAO.consultar(retorno.getId());
        Assert.assertNotNull(clienteConsultado);

        clienteDAO.excluir(cliente);

        Cliente clienteConsultado1 = clienteDAO.consultar(retorno.getId());
        Assert.assertNull(clienteConsultado1);
    }

    @Test
    public void excluirCliente() throws TipoChaveNaoEncontradaException, MaisDeUmRegistroException, TableException, DAOException {
        Cliente cliente = criarCliente();
        Cliente retorno = clienteDAO.cadastrar(cliente);
        Assert.assertNotNull(retorno);

        Cliente clienteConsultado = clienteDAO.consultar(cliente.getId());
        Assert.assertNotNull(clienteConsultado);

        clienteDAO.excluir(cliente);
        clienteConsultado = clienteDAO.consultar(cliente.getId());
        Assert.assertNull(clienteConsultado);
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException, MaisDeUmRegistroException, TableException, DAOException {
        Cliente cliente = criarCliente();
        Cliente retorno = clienteDAO.cadastrar(cliente);
        Assert.assertNotNull(retorno);

        Cliente clienteConsultado = clienteDAO.consultar(cliente.getId());
        Assert.assertNotNull(clienteConsultado);

        clienteConsultado.setNome("Rodrigo Pires");
        clienteDAO.alterar(clienteConsultado);

        Cliente clienteAlterado = clienteDAO.consultar(clienteConsultado.getId());
        Assert.assertNotNull(clienteAlterado);
        Assert.assertEquals("Rodrigo Pires", clienteAlterado.getNome());

        clienteDAO.excluir(cliente);
        clienteConsultado = clienteDAO.consultar(clienteAlterado.getId());
        Assert.assertNull(clienteConsultado);
    }


    private Cliente criarCliente() {
        Cliente cliente = new Cliente();
        cliente.setCpf(789456123L);
        cliente.setNome("Renan Betereli");
        cliente.setCidade("Campinas");
        cliente.setEstado("SP");
        cliente.setEnd("Rua Teste");
        cliente.setNumero(123);
        cliente.setTel(741258963258L);
        return cliente;
    }
}
