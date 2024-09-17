package TP2.EJ9ModuloMatematico;

public class Esfera extends Figuras3D{
    private final double radio;

    private final static double PI = 3.14;

    public Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return 4 * PI * this.radio * this.radio;
    }
    @Override
    public double getVolumen(){
        return (4.0/3.0) * PI * this.radio * this.radio * this.radio;
    }
}
