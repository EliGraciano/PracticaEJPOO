package TP2.EJ9ModuloMatematico;


public class Tetraedro extends Figuras3D{
    private final double arista;

    public Tetraedro(double arista) {
        this.arista = arista;
    }

    @Override
    public double getArea() {
        return this.arista * this.arista  ; // me falta hacer bien el calculo, no se como usar la raiz
    }

    @Override
    public double getVolumen(){
        return this.arista * this.arista * this.arista ; // me falta hacer bien el calculo, no se como usar la raiz
    }
}
