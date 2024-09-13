package TP1.tads;

public class Test_Pila {
    public static void main(String[] args) {
        Pila pila = new Pila();

        pila.apilarElemento(1);
        pila.apilarElemento(2);
        pila.apilarElemento(3);

        if (pila.desapilarElemento() != 3){
            throw new AssertionError("No anda el desapilar/apilar :P");
        }
        System.out.println("Test: desapilar//apilar Paso!!");

        if (!pila.toString().equals("2, 1")){
            throw new AssertionError("Error en la funcion:  toString");
        };
        System.out.println("Test: toString Paso!!");

        pila.desapilarElemento();pila.desapilarElemento();

        if (!pila.pEsVacia()){
            throw new AssertionError("Error en la funcion: estaVacia");
        };
        System.out.println("Test: estaVacia Paso!!");
    }
}
