package Billetera;

public class Usuario {
    private String nombre;
    private String apellido;
    private final int DNI;

    public Usuario(String nombre, String apellido, int DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }

    public int getDNI() {
        return DNI;
    }


}
