package TP2.EJPrendas;

public class TarjetaDorada extends Tarjeta{
    protected double plus;

    public TarjetaDorada(double descuento, double plus) {
        super(descuento);
        this.plus = plus;
    }

    @Override
    protected double CalcularPrecioFinal(double precio) {
        precio -= this.plus;
        double descuentoARestar = precio * descuento;
        precio -= descuentoARestar;
        return precio;
    }
}
