package TP2.EjSistemaOrdenes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        app Repuestera = new app();
        Scanner scan = new Scanner(System.in);


        while (true){
            System.out.println("Bienvenido al sistema,Elija una opcion [0 - 4]");
            System.out.println("0 - Salir del sistema");
            System.out.println("1 - Cargar Orden");
            System.out.println("0 - Salir del sistema");
            System.out.println("0 - Salir del sistema");
            int accion = scan.nextInt();
            if (accion == 0){
                System.out.println("saliendo del sistema...");
                break;
            } else if (accion == 1) {
                System.out.println("inserte numero de orden: ");
                int nroOrden  = scan.nextInt();
                System.out.println();

                Repuestera.CargarOrden();
            }

        }


    }
}
