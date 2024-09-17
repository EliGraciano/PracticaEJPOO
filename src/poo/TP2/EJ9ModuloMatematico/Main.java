package TP2.EJ9ModuloMatematico;

public class Main {

    public static void main(String[] args) {
        // Figuras 2D
        Figura cuadrado = new Cuadrado(4);
        Figura circulo = new Circulo(3);
        Figura triangulo = new Triangulo(4,3);
        Figura rectangulo = new Rectangulo(4,3);


        System.out.println("Área del cuadrado: " + cuadrado.getArea());
        System.out.println("Área del círculo: " + circulo.getArea());
        System.out.println("Área del triangulo: " + triangulo.getArea());
        System.out.println("Área del rectangulo: " + rectangulo.getArea());

        // Figuras 3D
        Figuras3D cubo = new Cubo(3);
        Figuras3D esfera = new Esfera(2);
        //Figuras3D tetraedro = new Tetraedro(5);

        System.out.println("Área del cubo: " + cubo.getArea());
        System.out.println("Volumen del cubo: " + cubo.getVolumen());

        System.out.println("Área de la esfera: " + esfera.getArea());
        System.out.println("Volumen de la esfera: " + esfera.getVolumen());

        // Resultados del Tetraedro
        //System.out.println("Área del tetraedro: " + tetraedro.getArea());
        //System.out.println("Volumen del tetraedro: " + tetraedro.getVolumen());
    }

}
