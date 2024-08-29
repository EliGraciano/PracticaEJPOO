package tads;

public class Cola {

    private NodoDobleEnlace primerNodo;

    private NodoDobleEnlace ultimoNodo;

    private int cantidadElementos;

    public Cola() {
        this.cantidadElementos = 0;
    }

    public boolean estaVacia() {
        return this.cantidadElementos == 0;
    }

    public int getCantidadElementos() {
        return this.cantidadElementos;
    }

    public void encolar(int valor) {
        NodoDobleEnlace newNodo = new NodoDobleEnlace(valor);
        if (estaVacia()) {
            this.primerNodo = newNodo;
            this.ultimoNodo = newNodo;
            this.cantidadElementos++;
            return;
        }
        newNodo.setSiguiente(this.primerNodo);
        this.primerNodo = newNodo;
        this.cantidadElementos++;
    }

    public int desencolar() {
        NodoDobleEnlace nodoDesencolado = this.ultimoNodo;
        NodoDobleEnlace newNodoUltimo = nodoDesencolado.getAnterior();
        this.ultimoNodo = newNodoUltimo;
        this.cantidadElementos--;
        return nodoDesencolado.getValor();
    }
}