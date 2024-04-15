package es.iesmz.tests;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VocalesTest {
    @Test
    public void test1(){
        int resultadoReal = Vocales.contarvocales ("Hola Mundo");
        int resultadoEsperado = 4;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test2(){
        int resultadoReal = Vocales.contarvocales ("Esto Es una cadenA");
        int resultadoEsperado = 8;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test3(){
        int resultadoReal = Vocales.contarvocales ("Java mola MogollOn");
        int resultadoEsperado = 7;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test4(){
        int resultadoReal = Vocales.contarvocales ("4h0r4 s0n num3r0s");
        int resultadoEsperado = 1;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test5(){
        int resultadoReal = Vocales.contarvocales ("Cadena S1n Vocales");
        int resultadoEsperado = 6;
        assertEquals(resultadoEsperado, resultadoReal);
    }
}