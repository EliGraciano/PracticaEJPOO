package TP2.EjSistemaOrdenes;

import java.util.HashMap;

public class Stock {
    private HashMap<Producto, Integer> stock;

    public Stock() {
        this.stock = new HashMap<>();
    }

    public boolean hayDisponible(Producto producto, int cantidad){
        return this.stock.containsKey(producto) && this.stock.get(producto) >= cantidad;
    }

    public void agregarStock(Producto producto, int cantidad){
        if(this.stock.containsKey(producto)){
            this.stock.put(producto, this.stock.get(producto) + cantidad
            );
        }
    }

    public void restarStock(Producto producto,int cantidad) {
        if(this.stock.containsKey(producto) &&  this.stock.get(producto) > 0){
            for (int i = 0; i < cantidad ;i++){
                this.stock.put(producto, this.stock.get(producto) - 1);
            }
        }
    }
}
