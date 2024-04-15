package es.iesmz.tests;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumerosTest {
    @Test
    public void test1(){
        int resultadoReal = Numeros.soniguales(4,55,7);
        int resultadoEsperado = 2;
        assertEquals(resultadoReal, resultadoEsperado);
    }

    @Test
    public void test2(){
        int resultadoReal = Numeros.soniguales(14,23,27);
        int resultadoEsperado = 2;
        assertEquals(resultadoReal, resultadoEsperado);
    }

    @Test
    public void test3(){
        int resultadoReal = Numeros.soniguales(14,55,14);
        int resultadoEsperado = 1;
        assertEquals(resultadoReal, resultadoEsperado);
    }

    @Test
    public void test4(){
        int resultadoReal = Numeros.soniguales(14,14,33);
        int resultadoEsperado = 1;
        assertEquals(resultadoReal, resultadoEsperado);
    }

    @Test
    public void test5(){
        int resultadoReal = Numeros.soniguales(32,55,55);
        int resultadoEsperado = 1;
        assertEquals(resultadoReal, resultadoEsperado);
    }

    @Test
    public void test6(){
        int resultadoReal = Numeros.soniguales(329,329,329);
        int resultadoEsperado = 0;
        assertEquals(resultadoReal, resultadoEsperado);
    }
};
