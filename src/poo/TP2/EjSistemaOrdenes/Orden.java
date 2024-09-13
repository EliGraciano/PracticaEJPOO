package TP2.EjSistemaOrdenes;

import java.time.LocalDate;
import java.util.ArrayList;

public class Orden {
    private LocalDate fecha;

    private int numero;

    private EstadoOrden estado;

    private ArrayList<DetalleOrden> detalles;

    public Orden(int numero, LocalDate fecha){
        this.numero = numero;
        this.fecha = fecha;
        this.estado = EstadoOrden.SIN_PROCESAR;
        this.detalles = new ArrayList<>();
    }

    public void agregarProducto(Producto producto, int cantidad){
        this.detalles.add(
                new DetalleOrden(cantidad, producto)
        );
    }

    public void aceptar(){
        this.estado = EstadoOrden.ACEPTADA;
    }

    public void rechazar(){
        this.estado = EstadoOrden.RECHAZADA;
    }
}

