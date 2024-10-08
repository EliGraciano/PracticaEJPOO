package TP2.EJPrendas;

public class VentaRopa {

    public double calcularPrecioConMedioDePago(Prenda prenda, MedioDePago medioDePago) {
        double precioBase = prenda.calcularPrecioVenta();
        return medioDePago.CalcularPrecioFinal(precioBase);
    }
}
