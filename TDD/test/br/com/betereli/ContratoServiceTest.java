package br.com.betereli;

import br.com.betereli.Service.ContratoService;
import br.com.betereli.Service.IContratoService;
import br.com.betereli.dao.ContratoDao;
import br.com.betereli.dao.IContratoDao;
import br.com.betereli.dao.mocks.ContratoDaoMock;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    //TODO
    //Implementar métodos de buscar, excluir e atualizar.

    @Test
    public void salvarTeste(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test public void buscarTeste(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retornoBuscar = service.buscar();
        Assert.assertEquals("Retorno Buscar", retornoBuscar);

    }
    @Test public void excluirTeste(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retornoExcluir = service.excluir();
        Assert.assertEquals("Item Excluido", retornoExcluir);

    }
    @Test public void atualizarTeste(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retornoAtualizar = service.atualizar();
        Assert.assertEquals("Atualizado", retornoAtualizar);

    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTeste(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

}
