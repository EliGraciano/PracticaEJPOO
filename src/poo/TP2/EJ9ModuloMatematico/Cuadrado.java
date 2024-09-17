package TP2.EJ9ModuloMatematico;

public class Cuadrado extends Figura {
    private final double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return this.lado * this.lado;
    }
}
