package es.iesmz.tests;

public class Vocales2 {
    public static String sinvocales(String cadena){
        return cadena.replaceAll("[aeiouAEIOU]", "");
    }
}
