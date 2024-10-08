package TP2.EJPrendas;

public class Tarjeta extends MedioDePago{
    protected double descuento;

    public Tarjeta(double descuento) {
        this.descuento = descuento;
    }

    @Override
    protected double CalcularPrecioFinal(double precio) {
        double descuentoARestar = precio * this.descuento;
        precio -= descuentoARestar;
        return precio;
    }
}
