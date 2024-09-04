package Billetera;

public class Moneda {
    private String nombre;
    private double cotiz;

    public Moneda(String nombre,double cotiz) {
        this.nombre = nombre;
        this.cotiz = cotiz;
    }

    public double getCotiz() {
        return this.cotiz;
    }

    public String getNombre() {
        return nombre;
    }
}
