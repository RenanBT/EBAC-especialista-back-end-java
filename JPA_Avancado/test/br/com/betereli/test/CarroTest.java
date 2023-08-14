package br.com.betereli.test;

import br.com.betereli.dao.*;
import br.com.betereli.domain.Acessorio;
import br.com.betereli.domain.Carro;
import br.com.betereli.domain.Marca;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/*
select * from tb_acessorio;
select * from tb_acessorio_carro;
select * from tb_carro;
select * from tb_marca;

 */

public class CarroTest {

    private ICarroDAO carroDAO;
    private IAcessorioDAO acessorioDAO;
    private IMarcaDAO marcaDAO;

    public CarroTest(){
        
        carroDAO = new CarroDao();
        acessorioDAO = new AcessorioDao();
        marcaDAO = new MarcaDao();
    }

    @Test
    public void cadastrar(){
        Marca marca = criarMarca("M1");
        Acessorio acessorio = criarAcessorio("A1");
        
        Carro carro = new Carro();
        carro.setCodigo("C2");
        carro.setModelo("Up");
        carro.setPlaca("ABC1234");
        carro.setChassi(123456789L);
        carro.setMarca(marca);
        carro.add(acessorio);

        carro = carroDAO.cadastrar(carro);

        assertNotNull(carro);
        assertNotNull(carro.getId());

    }

    private Acessorio criarAcessorio(String codigo) {
        Acessorio acessorio = new Acessorio();
        acessorio.setCodigo(codigo);
        acessorio.setNome("Aerofolio");
        acessorio.setEsportivo(true);
        acessorio.setPreco(499.99d);
        return acessorioDAO.cadastrar(acessorio);
    }

    private Marca criarMarca(String codigo) {
        Marca marca = new Marca();
        marca.setCodigo(codigo);
        marca.setNacionalidade("Alema");
        marca.setNome("Volkswagen");
        return marcaDAO.cadastrar(marca);
    }
/*
    private Carro criarCarro(String codigo){
        Carro carro = new Carro();
        Acessorio acessorio = criarAcessorio("C1");
        carro.setCodigo("C1");
        carro.setPlaca("ABC1234");
        carro.setChassi(123456789L);
        carro.add(acessorio);
        return carroDAO.cadastrar(carro);

    }
*/
    /*
    @Test
    public void cadastrar(){
        Marca marca = new Marca();
        marca.setCodigo("C1");
        marca.setNacionalidade("Alema");
        marca.setNome("VolksWagen");
        marca = marcaDAO.cadastrar(marca);

        assertNotNull(marca);
        assertNotNull(marca.getId());
    }
     */
}
