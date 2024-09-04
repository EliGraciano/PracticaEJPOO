package Billetera;

public class Moneda {
    private final String nombre;
    private double cotiz;

    public Moneda(String nombre,double cotiz) {
        this.nombre = nombre;
        this.cotiz = cotiz;
    }

    public double getCotiz() {
        return this.cotiz;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setCotiz(double cotiz) {
        this.cotiz = cotiz;
    }


}
