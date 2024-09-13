package TP1.tads;

public class Pila {
    private Nodo tope ;
    private int cantidadElementos;

    public Pila() {
        this.tope = null;
        this.cantidadElementos = 0;
    }

    public void apilarElemento(int elemento){
        Nodo newNodo = new Nodo(elemento);
        if (this.cantidadElementos == 0){
            this.tope = newNodo;
            this.cantidadElementos++;
            return;
        }
        Nodo topeActual = this.tope;
        newNodo.setSiguiente(topeActual);
        this.tope = newNodo;
        this.cantidadElementos++;
    }

    public int desapilarElemento(){
        if (pEsVacia()){
            throw new RuntimeException("Error Pila vacia") ;}
        Nodo nodoDesapilado = this.tope;
        this.tope = nodoDesapilado.getSiguiente();
        this.cantidadElementos--;
        return nodoDesapilado.getValor();
    }



    public int cantidadElementos(){
        return this.cantidadElementos;
    }

    public boolean pEsVacia(){
        return this.cantidadElementos == 0;
    }

}
