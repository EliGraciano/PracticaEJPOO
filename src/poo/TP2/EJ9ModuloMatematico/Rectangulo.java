package TP2.EJ9ModuloMatematico;

public class Rectangulo extends Figura{
    private final double base;

    private final double  altura;


    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea(){
        return this.base * this.altura;
    }
}
