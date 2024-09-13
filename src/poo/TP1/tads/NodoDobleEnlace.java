package TP1.tads;

public class NodoDobleEnlace{
    /**
     * Nodo anterior a este nodo
     */
    private NodoDobleEnlace siguiente;

    private NodoDobleEnlace anterior;

    private final int valor;

    public NodoDobleEnlace(int valor) {
        this.valor = valor;
    }

    public boolean hasAnterior() {
        return this.anterior != null;
    }

    public NodoDobleEnlace getAnterior() {
        return this.anterior;
    }

    public void setAnterior(NodoDobleEnlace anterior) {
        this.anterior = anterior;
    }

    public int getValor() {
        return this.valor;
    }

    public void setSiguiente(NodoDobleEnlace nodo){
        this.siguiente = nodo;
    }

    public boolean hasSiguiente() {
        return this.siguiente != null;
    }

    public NodoDobleEnlace getSiguiente() {
        return this.siguiente;
    }

    public boolean valorIs(int valor) {
        return this.valor == valor;
    }


}
