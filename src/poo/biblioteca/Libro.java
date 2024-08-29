package biblioteca;

import java.util.ArrayList;

public class Libro {
    private final String titulo;
    private final int cantPaginas;
    private final int ISBN;
    private  ArrayList<Ejemplar> ejemplaresDisp;
    private int ejemplaresPrestados;

    public Libro(String titulo, int cantPaginas, int ISBN,int cantEjemplares) {
        this.titulo = titulo;
        this.cantPaginas = cantPaginas;
        this.ISBN = ISBN;
        this.ejemplaresDisp = new ArrayList<Ejemplar>();
        this.ejemplaresPrestados = 0;// se supone que estan dando de alta un libro,todavia no prestaron ninguno
        setcantidadejemp(cantEjemplares);
    }

    public Libro(String titulo,int cantPaginas,int ISBN){
        this.titulo = titulo;
        this.ejemplaresDisp = new ArrayList<Ejemplar>();
        this.cantPaginas = cantPaginas;
        this.ISBN = ISBN;
        Ejemplar newejemplar = new Ejemplar(this);
        this.ejemplaresDisp.add(newejemplar);
    }

    private void setcantidadejemp(int cantEjemplares){
        for (int i = 0; i < cantEjemplares;i++){
            Ejemplar newEjemplar = new Ejemplar(this);
            this.ejemplaresDisp.add(newEjemplar);
        }
        return;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public Libro libroMasPaginas(Libro libro){
        if (this.cantPaginas > libro.cantPaginas){
            return this;
        }
        else {return libro;}
    }

    public Ejemplar getEjemplarPrestado(){
        for (Ejemplar ejemplar : this.ejemplaresDisp){
            if (ejemplar.getEjemplarDisp() != null){
                return ejemplar;
            }
        }
        return null;
    }

    public Ejemplar getejemplaresDisp(){
        for (Ejemplar ejemplar : this.ejemplaresDisp){
            if (ejemplar.getEjemplarDisp() == null  ){
                return ejemplar;
            }
        }
        return null;
    }
}
