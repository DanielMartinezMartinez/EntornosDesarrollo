package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Vocales2Test {
    @Test
    public void test1(){
        String resultadoReal = Vocales2.sinvocales("Hola Mundo");
        String resultadoEsperado = "Hl Mnd";
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test2(){
        String resultadoReal = Vocales2.sinvocales("Esto Es una cadenA");
        String resultadoEsperado = "st s n cdn";
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test3(){
        String resultadoReal = Vocales2.sinvocales("Java mola MogollOn");
        String resultadoEsperado = "Jv ml Mglln";
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test4(){
        String resultadoReal = Vocales2.sinvocales("4h0r4 s0n num3r0s");
        String resultadoEsperado = "4h0r4 s0n nm3r0s";
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test5(){
        String resultadoReal = Vocales2.sinvocales("Cadena Sin Vocales");
        String resultadoEsperado = "Cdn Sn Vcls";
        assertEquals(resultadoEsperado, resultadoReal);
    }
}