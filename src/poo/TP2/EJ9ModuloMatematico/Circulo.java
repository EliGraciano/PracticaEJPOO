package TP2.EJ9ModuloMatematico;

public class Circulo extends Figura {
    private final double radio;

    private final static double PI = 3.14;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return PI * this.radio * this.radio;
    }


}
