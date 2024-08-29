package tads;

public class Lista {

    private Nodo inicio;

    private int cantidadElementos;

    public Lista() {
        this.cantidadElementos = 0;
    }

    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (this.estaVacia()) {
            this.inicio = nuevoNodo;
            this.cantidadElementos++;
            return;
        }
        Nodo nodoActual = this.inicio;
        while (nodoActual.hasSiguiente()) {
            if (nodoActual.valorIs(valor)) {
                return;
            }
            nodoActual = nodoActual.getSiguiente();
        }
        if (nodoActual.valorIs(valor)){
            return;
        }
        nodoActual.setSiguiente(nuevoNodo);
        this.cantidadElementos++;
    }

    public boolean estaVacia() {
        return this.cantidadElementos == 0;
    }

    public int listLongitud(){
        return this.cantidadElementos;
    }

    public Integer recuperar(int index){
        if (estaVacia()){
            return null;
        }
        int i = 1;
        Nodo nodoActual = this.inicio;
        while (i < index){
            i++;
            nodoActual = nodoActual.getSiguiente();
        }
        return nodoActual.getValor();


    }

    public void eliminar(int valor){
        if (estaVacia()){
            return;
        }
        Nodo nodoActual = this.inicio;
        if (nodoActual.valorIs(valor)){
            this.inicio = nodoActual.getSiguiente();
            this.cantidadElementos--;
            return;
        }
        boolean centinela = true;
        while(nodoActual.hasSiguiente() && centinela){
            if (nodoActual.getSiguiente().valorIs(valor)){
                Nodo nodoAux = nodoActual.getSiguiente();
                nodoActual.setSiguiente(nodoAux.getSiguiente());
                centinela = false;
                this.cantidadElementos--;
            }else{
                nodoActual = nodoActual.getSiguiente();
            }
        }
    }

    public boolean buscar(int valor){
        if (estaVacia()){
            return false;
        }
        boolean centinela = true;
        Nodo nodoActual = this.inicio;
        while(nodoActual.hasSiguiente() && centinela){
            if (nodoActual.valorIs(valor)){
                centinela = false;
            }
            nodoActual = nodoActual.getSiguiente();
        }
        return !centinela;
    }

    public void insertar(int index,int elemento){
        if (index < 1 || buscar(elemento)){return;}
        Nodo nuevoNodo = new Nodo(elemento);
        if (estaVacia()){
            cantidadElementos++;
            this.inicio =  nuevoNodo;
            return;
        }
        Nodo nodoActual = this.inicio;
        if (index == 1){
            this.inicio = nuevoNodo;
            nuevoNodo.setSiguiente(nodoActual) ;
        }
        Nodo nodoAnt = this.inicio;
        int i = 1;
        while (i < index && nodoActual != null){
            nodoAnt = nodoActual;
            nodoActual = nodoActual.getSiguiente();
            i++;
        }
        nodoAnt.setSiguiente(nuevoNodo);
        nuevoNodo.setSiguiente(nodoActual);
        cantidadElementos++;
    }

    public String toString() {
        String resultado = "";
        Nodo nodoActual = this.inicio;
        int i = 1;
        while (nodoActual.hasSiguiente()) {
            resultado += nodoActual.getValor();
            resultado += ", ";
            i++;
            nodoActual = nodoActual.getSiguiente();
        }
        resultado += nodoActual.getValor();
        return resultado;
    }
}
