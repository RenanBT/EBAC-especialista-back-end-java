package br.com.betereli;

import br.com.betereli.dao.IMatriculaDao;
import br.com.betereli.dao.MatriculaDao;
import br.com.betereli.domain.Matricula;
import org.junit.Test;

import java.time.Instant;

import static org.junit.Assert.assertNotNull;

public class MatriculaTest {

    private IMatriculaDao matriculaDao;

    public MatriculaTest(){
        matriculaDao = new MatriculaDao();
    }
    @Test
    public void cadasatrar(){
        Matricula mat = new Matricula();
        mat.setCodigo("M1");
        mat.setDataMatricula(Instant.now());
        mat.setStatus("ATIVA");
        mat.setValor(2000d);
        matriculaDao.cadastrar(mat);

        assertNotNull(mat);
        assertNotNull(mat.getId());

    }
}
