import java.util.ArrayList;

public class Direccion {
    private String direccion;
    private String ciudad;
    private int codigoPostal;
    private Estado estado;
    private ArrayList<Persona>persona;

    public Direccion(String direccion, String ciudad, int codigoPostal) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.estado = estado;
        this.persona = persona;
    }
}
