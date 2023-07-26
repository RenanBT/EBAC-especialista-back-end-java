package br.com.betereli;

import br.com.betereli.dao.CursoDao;
import br.com.betereli.dao.ICursoDao;
import br.com.betereli.domain.Curso;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CursoTest {
    private ICursoDao cursoDao;
    public CursoTest(){
        cursoDao = new CursoDao();
    }

    @Test
    public void cadastrar(){


        Curso curso = new Curso();
        curso.setCodigo("A1");
        curso.setDescricao("Curso Teste");
        curso.setNome("Curso Java Backend");
        curso = cursoDao.cadastrar(curso);

        assertNotNull(curso);
        assertNotNull(curso.getId());

    }
}
