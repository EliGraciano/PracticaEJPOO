package TP2.EjSistemaOrdenes;

import java.time.LocalDate;
import java.util.ArrayList;

public class app {

    private ArrayList<Orden> Ordenes;

    public app() {
        this.Ordenes = new ArrayList<>();
    }

    public void CargarOrden(int NroOrden, LocalDate fecha,ArrayList<String> productos,int cantProducts[]) {
        Orden newOrden = new Orden(NroOrden,fecha);
        for (int i = 0; i < productos.size();i++) {
            Producto productoAgregar = new Producto(productos.get(i));
            newOrden.agregarProducto(productoAgregar, cantProducts[i]);
        }
    }
}
