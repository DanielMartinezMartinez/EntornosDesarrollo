public class main {
    public static void main(String[] args) {
        LibroDirecciones l1 = new LibroDirecciones(72183);
        Direccion d1 = new Direccion("Calle Prueba", "Alicante", 1378);
        Persona p1 = new Persona("Antonio",610302910,  "antonio@gmail.com", l1, d1);
        Pais pais1 = new Pais(7, "España");
        Estado e1 = new Estado(1, "America", pais1);
    }
}
