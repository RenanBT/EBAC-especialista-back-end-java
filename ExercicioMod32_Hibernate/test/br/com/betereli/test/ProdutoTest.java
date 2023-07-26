package br.com.betereli.test;

import br.com.betereli.Produto;
import br.com.betereli.dao.IProdutoDao;
import br.com.betereli.dao.ProdutoDao;
import org.junit.Test;

import javax.transaction.TransactionScoped;

import static org.junit.Assert.assertNotNull;

public class ProdutoTest {

    private IProdutoDao produtoDao;

    public ProdutoTest(){
        produtoDao = new ProdutoDao();
    }

    @Test
    public void cadastrar() {
        Produto prod = new Produto();
        prod.setNome("Mouse");
        prod.setValor(75.99d);
        produtoDao.cadastrar(prod);

        assertNotNull(prod);
        assertNotNull(prod.getId());
    }


}
