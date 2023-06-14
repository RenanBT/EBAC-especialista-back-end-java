package br.com.betereli.tests;

import org.junit.Assert;
import org.junit.Test;

public class FirstTest {

    @Test
    public void primeiroTeste(){
        String nome = "Renan";
        Assert.assertEquals("Renan", nome);
    }

    @Test
    public void testNotEquals(){
        String nome = "Renan";
        Assert.assertNotEquals("Renan1", nome);
    }



}

