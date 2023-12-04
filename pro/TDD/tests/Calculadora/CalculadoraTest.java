package Calculadora;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {



    @Test
    public void testSoma(){
        int a = 2;
        int b = 2;

        Calculadora calculadora = new Calculadora();
        int sum = calculadora.sum(a,b);

        assertEquals(4, sum);
    }

    @Test
    public void testSub(){
        int a = 2;
        int b = 2;

        Calculadora calculadora = new Calculadora();
        int sub = calculadora.sub(a,b);

        assertEquals(0, sub);

    }

    @Test
    public void testMult() {
        int a = 2;
        int b = 2;
        Calculadora calculadora = new Calculadora();

        int multi = calculadora.multi(a,b);
        assertEquals( 4,multi);
    }

    @Test
    public void testDiv() {
        int a = 2;
        int b = 2;
        Calculadora calculadora = new Calculadora();

        int div = calculadora.div(a,b);
        assertEquals(1,div);
    }

}
