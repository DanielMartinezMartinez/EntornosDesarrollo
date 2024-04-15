package es.iesmz.tests;

public class Vocales {
    public static int contarvocales (String cadena){
            int contador = 0;
            for (int i = 0; i < cadena.length(); i++) {
                char caracter = cadena.charAt(i);
                if (esVocal(caracter)) {
                    contador++;
                }
            }
            return contador;
        }

        public static boolean esVocal(char caracter) {
            caracter = Character.toLowerCase(caracter);
            return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
        }
}
