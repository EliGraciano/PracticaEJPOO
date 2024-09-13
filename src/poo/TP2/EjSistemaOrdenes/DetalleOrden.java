package TP2.EjSistemaOrdenes;

public class DetalleOrden {
    private int cantidad;

    private Producto producto;

    public DetalleOrden(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }
}

