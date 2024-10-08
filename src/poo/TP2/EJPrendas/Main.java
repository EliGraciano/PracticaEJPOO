package TP2.EJPrendas;

public class Main {
    public static void main(String[] args) {
        Prenda camisa = new Camisa(2000, true); // Camisa de manga larga
        Prenda remera = new Remera(1500);       // Remera
        Prenda sweater = new Sweater(2500);     // Sweater

        MedioDePago tarjetaComun = new Tarjeta(0.01);
        MedioDePago tarjetaDorada = new TarjetaDorada(0.015,100);

        VentaRopa venta = new VentaRopa();

        // Calcular precios finales
        System.out.println("Camisa (con tarjeta común): " + venta.calcularPrecioConMedioDePago(camisa, tarjetaComun));
        System.out.println("Remera (con tarjeta dorada): " + venta.calcularPrecioConMedioDePago(remera, tarjetaDorada));
        System.out.println("Sweater (con tarjeta común): " + venta.calcularPrecioConMedioDePago(sweater, tarjetaComun));
    }
}

