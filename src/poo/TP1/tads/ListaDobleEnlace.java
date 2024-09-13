package TP1.tads;


public class ListaDobleEnlace {

    private NodoDobleEnlace inicio;

    private int cantidadElementos;

    public ListaDobleEnlace() {
        this.cantidadElementos = 0;
    }

    public void agregar(int elemento){
        NodoDobleEnlace newNodo = new NodoDobleEnlace(elemento);
        if (estaVacia()){
            this.inicio = newNodo;
            cantidadElementos++;
            return;
        }
        NodoDobleEnlace nodoActual= this.inicio;
        while (nodoActual.hasSiguiente() ){
            if (nodoActual.valorIs(elemento)){
                return;
            }
            nodoActual = nodoActual.getSiguiente();
        }
        if (!nodoActual.hasSiguiente() && !nodoActual.valorIs(elemento)){
            nodoActual.setSiguiente(newNodo);
            newNodo.setAnterior(nodoActual);
            this.cantidadElementos++;
        }

    }

    public void eliminar(int elemento){
        if (estaVacia()){
            return;
        }
        NodoDobleEnlace nodoActual = this.inicio;
        if (nodoActual.valorIs(elemento)){
            this.inicio = nodoActual.getSiguiente();
            this.inicio.setAnterior(null);
            this.cantidadElementos--;
            return;
        }
        while (nodoActual.hasSiguiente()) {
            if (nodoActual.valorIs(elemento)){
                NodoDobleEnlace nodoAEliminar = nodoActual; // nodo a eliminar
                nodoActual = nodoActual.getAnterior(); // esta parado en el nodo anterior a eliminar
                nodoActual.setSiguiente(nodoAEliminar.getSiguiente()); // al anterior,le seteo el siguiente del nodo que hay que elminar
                nodoAEliminar.getSiguiente().setAnterior(nodoActual); // al siguiente del que hay que eliminar,le seteo el anterior del que hay que eliminar
                this.cantidadElementos--;
            }
            nodoActual = nodoActual.getSiguiente();
        }
        if (nodoActual.valorIs(elemento)) {
            nodoActual = nodoActual.getAnterior(); // esta parado en el nodo anterior a eliminar
            nodoActual.setSiguiente(null); // al anterior,le seteo null
            this.cantidadElementos--;
        }
    }

    public boolean buscar(int valor){
        if (estaVacia()){
            return false;
        }
        boolean centinela = true;
        NodoDobleEnlace nodoActual = this.inicio;
        while(nodoActual.hasSiguiente() && centinela){
            if (nodoActual.valorIs(valor)){
                centinela = false;
            }
            nodoActual = nodoActual.getSiguiente();
        }
        return !centinela;
    }

    public void mostrarLista(){
        NodoDobleEnlace nodoActual = this.inicio;
        int i = 1;
        System.out.print("[");
        while (nodoActual.hasSiguiente()){
            System.out.print(nodoActual.getValor() + ",");
            i++;
            nodoActual = nodoActual.getSiguiente();
        }
        System.out.println(nodoActual.getValor()+ "]");
    }

    public ListaDobleEnlace crearListaDesdeArray(int[] arraylista){
        ListaDobleEnlace listacreada = new ListaDobleEnlace();
        for (int i = 0; i< arraylista.length; i++){
            listacreada.agregar(arraylista[i]);
        }
        return listacreada;
    }

    public void insertar(int valor,int posicion){
        if (posicion < 1 || this.buscar(valor)){return;}
        if (posicion > this.cantidadElementos){
            this.agregar(valor);
            return;
        }
        NodoDobleEnlace newNodo = new NodoDobleEnlace(valor);
        if (this.estaVacia()){
            this.inicio = newNodo;
            this.cantidadElementos++;
            return;
        }
        NodoDobleEnlace nodoActual = this.inicio;
        if (posicion == 1){
            this.inicio = newNodo;
            newNodo.setSiguiente(nodoActual) ;
            nodoActual.setAnterior(newNodo);
            this.cantidadElementos++;
            return;
        }
        int i = 1;
        while (nodoActual != null) {
            if (i == posicion){
                NodoDobleEnlace aux = nodoActual.getAnterior();
                aux.setSiguiente(newNodo);
                newNodo.setAnterior(aux);
                newNodo.setSiguiente(nodoActual);
                nodoActual.setAnterior(newNodo);
                this.cantidadElementos++;
                return;
            }
            i++;
            nodoActual = nodoActual.getSiguiente();
        }
    }
    //falta insertar y recuperar

    public boolean estaVacia(){
        return this.cantidadElementos == 0;
    }

    public  int getCantidadElementos(){
        return this.cantidadElementos;
    }

}
