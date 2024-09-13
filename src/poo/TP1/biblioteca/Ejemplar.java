package TP1.biblioteca;

public class Ejemplar {
    private final Libro libroEjemplar;
    private Prestamo ejemplarDisp;

    public Ejemplar(Libro libro) {
        this.ejemplarDisp = null;
        this.libroEjemplar = libro;
    }

    public void setEjemplarDisp(Prestamo ejemplarDisp) {
        if (ejemplarDisp != null){
            this.ejemplarDisp = ejemplarDisp;
        }
        else{
            this.ejemplarDisp = null;
        }
    }

    public Prestamo getEjemplarDisp() {
        return ejemplarDisp;
    }
}
