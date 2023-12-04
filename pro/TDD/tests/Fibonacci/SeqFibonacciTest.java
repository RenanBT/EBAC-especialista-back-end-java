package Fibonacci;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeqFibonacciTest {
    private SeqFibonacci fibonacci;


// Teste testSeqFibonacci compara os indices (0,1,2,10) calculados utilizando método encontrarElementoPD
// com valores reais da sequencia de Fibonacci.

    @Test
    public void testSeqFibonacci(){
        SeqFibonacci fibonacci = new SeqFibonacci();

        assertEquals(0, SeqFibonacci.encontrarElementoPD(0));
        assertEquals(1,SeqFibonacci.encontrarElementoPD(1));
        assertEquals(1,SeqFibonacci.encontrarElementoPD(2));
        assertEquals(55,SeqFibonacci.encontrarElementoPD(10));

    }


}
