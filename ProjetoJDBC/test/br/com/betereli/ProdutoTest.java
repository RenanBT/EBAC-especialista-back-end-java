package br.com.betereli;

import br.com.betereli.dao.IProdutoDAO;
import br.com.betereli.dao.ProdutoDAO;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

public class ProdutoTest {
    //TODO
    //Implementar BUSCAR TODOS e ATUALIZAR
    //Implementar mesmas funcionalidades para PRODUTO ( CADASTRAR, ATUALIZAR, BUSCAR, BUSCARTODOS E EXCLUIR)

    private IProdutoDAO produtoDAO;

    @Test
    public void cadastrarTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();
        Produto produto =  new Produto();
        produto.setCodigo("10");
        produto.setNome("Mouse");
        produto.setDescricao("Mouse sem fio marca teste");
        produto.setValor(BigDecimal.valueOf(75.90));

        Integer qtd = dao.cadastrar(produto);
        assertTrue(qtd ==1);

        Produto produtoBD = dao.consultar(produto.getCodigo());

        assertNotNull(produtoBD);
        assertNotNull(produtoBD.getId());
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());

        Integer qtdDel = dao.excluir(produtoBD);
        assertTrue(qtd == 1);

    }

    @Test
    public void excluirTest() throws Exception {

        ProdutoDAO dao = new ProdutoDAO();

        Produto produto =  new Produto();
        produto.setCodigo("10");
        produto.setNome("Mouse");
        produto.setDescricao("Mouse sem fio marca teste");
        produto.setValor(BigDecimal.valueOf(75.90));
        Integer count = produtoDAO.cadastrar(produto);
        assertTrue(count == 1);

        Produto produtoDB = produtoDAO.consultar("10");
        assertNotNull(produtoDB);
        assertEquals(produto.getCodigo(), produtoDB.getCodigo());
        assertEquals(produto.getNome(), produtoDB.getNome());

        Integer countDel = produtoDAO.excluir(produtoDB);
        assertTrue(countDel == 1);



    }

    @Test
    public void atualizarTest() throws Exception {

        produtoDAO = new ProdutoDAO();
        Produto produto =  new Produto();
        produto.setCodigo("10");
        produto.setNome("Mouse");
        produto.setDescricao("Mouse sem fio marca teste");
        produto.setValor(BigDecimal.valueOf(75.90));

        Integer qtd = produtoDAO.cadastrar(produto);
        assertTrue(qtd ==1);

        Produto produtoDB = produtoDAO.consultar("10");
        assertNotNull(produtoDB);
        assertEquals(produto.getCodigo(), produtoDB.getCodigo());
        assertEquals(produto.getNome(), produtoDB.getNome());

        produto.setCodigo("15");
        produto.setNome("Monitor");
        produto.setDescricao("Monitor 24 pol marca etc");
        produto.setValor(BigDecimal.valueOf(999.90));

        Integer countUpdate = produtoDAO.atualizar(produtoDB);
        assertTrue(countUpdate == 1);

        Produto produtoDB1 = produtoDAO.consultar("10");
        assertNull(produtoDB1);

        Produto produtoDB2 = produtoDAO.consultar("15");
        assertNotNull(produtoDB1);

        assertEquals(produtoDB.getCodigo(), produtoDB2.getCodigo());
        assertEquals(produtoDB.getNome(), produtoDB2.getNome());
        assertEquals(produtoDB.getDescricao(), produtoDB2.getDescricao());
        assertEquals(produtoDB.getValor(), produtoDB2.getValor());

        List<Produto> list = produtoDAO.buscarTodos();
        for (Produto prod : list){
            produtoDAO.excluir(prod);
        }



    }
    @Test
    public void buscarTodosTest() throws Exception {
        produtoDAO = new ProdutoDAO();

        Produto produto =  new Produto();
        produto.setCodigo("10");
        produto.setNome("Mouse");
        produto.setDescricao("Mouse sem fio marca teste");
        produto.setValor(BigDecimal.valueOf(75.90));

        Integer qtd = produtoDAO.cadastrar(produto);
        assertTrue(qtd ==1);

        Produto produto1 =  new Produto();
        produto1.setCodigo("15");
        produto1.setNome("Monitor");
        produto1.setDescricao("Monitor 24 pol marca etc");
        produto1.setValor(BigDecimal.valueOf(999.90));
        Integer qtd1 = produtoDAO.cadastrar(produto1);
        assertTrue(qtd1 ==1);

        List<Produto> list = produtoDAO.buscarTodos();
        assertNotNull(list);
        assertEquals(2, list.size());

        int countDel = 0;
        for (Produto prod : list){
            produtoDAO.excluir(prod);
            countDel++;
        }
        assertEquals(list.size(),countDel);

        list = produtoDAO.buscarTodos();
        assertEquals(list.size(), 0);
    }

}
