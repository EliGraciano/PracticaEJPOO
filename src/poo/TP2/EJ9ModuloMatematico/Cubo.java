package TP2.EJ9ModuloMatematico;

public class Cubo extends Figuras3D{
    private final double arista;

    public Cubo(double arista) {
        this.arista = arista;
    }

    @Override
    public double getArea() {
        return 6 * this.arista * this.arista;
    }

    @Override
    public double getVolumen(){
        return this.arista * this.arista * this.arista;
    }


}
