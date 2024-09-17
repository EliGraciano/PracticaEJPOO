package TP2.EJ9ModuloMatematico;

public class Triangulo extends Figura {
    private final double base;

    private final double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return (this.base * this.altura) / 2;
    }
}
