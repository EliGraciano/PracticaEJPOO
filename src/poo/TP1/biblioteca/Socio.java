package TP1.biblioteca;

import java.util.ArrayList;

public class Socio {
    private final String nombre;
    private final String apellido;
    private ArrayList<Prestamo> prestamos;

    public Socio(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.prestamos = new ArrayList<>();
    }

    public void setPrestamos(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }



    public Socio buscarSocio(String nombre,String apellido,ArrayList<Socio> socios){
        boolean socioregistrado = false;
        for (Socio socio : socios){
            if (socio.getNombre().equals(nombre) && socio.getApellido().equals(apellido)){
                socioregistrado = true;
            }
            if (socioregistrado){
                return socio;
            }
        }
        return null;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

}