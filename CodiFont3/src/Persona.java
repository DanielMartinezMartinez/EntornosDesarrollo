public class Persona {
    private String nombre;
    private int numero;
    private String direccionCorreo;
    private LibroDirecciones LibroDir;
    private Direccion direccion;

    public Persona(String nombre, int numero, String direccionCorreo, LibroDirecciones libroDir, Direccion direccion) {
        this.nombre = nombre;
        this.numero = numero;
        this.direccionCorreo = direccionCorreo;
        LibroDir = libroDir;
        this.direccion = direccion;
    }

    ///ToDo
    public static void TicketParking(){

    }
}
