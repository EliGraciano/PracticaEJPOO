package TP1.biblioteca;

public class App {
//    public static int mostrarMenu() {
  //      Scanner scanner = new Scanner(System.in);
    //    System.out.println("Bienvenido al programa de la Biblioteca\n");

        //System.out.print("0 - Salir\n" +
                //"1 - Ingresar un  nuevo Socio\n" +
                //"2 - Agregar un libro con sus respectivos ejemplares  \n" +
              //  "3 - Ingresar un nuevo Prestamo \n" +
            //    "4 - Ingresar una Devolucion\n" +
          //      "5 - Mostrar informacion del libro\n" +
        //        " \n Seleccione una opcion: ");
      //  return scanner.nextInt();
    //}

    public static void main(String args[]) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.generarSocio("Elias","Graciano");
        biblioteca.agregarAutor("Hernan","Romero");
        biblioteca.agregarAutor("Joaquin","Falco");
        biblioteca.agregarLibro("Harry Potter",10,12345,5);
        biblioteca.agregarLibro("Piense y Hagase rico",100,13645,5);
        biblioteca.mostrarAutores();
        biblioteca.mostrarSocios();
        //biblioteca.comparacionLibros("Harry Potter","Piense y Hagase rico");

    }
}
//
//int accion;
//Scanner sc = new Scanner(System.in);
//Biblioteca biblioteca = new Biblioteca();
//        while (true){
//accion = mostrarMenu();
//            if (accion == 1) {
//        System.out.print("Ingrese nombre de Socio: ");
//String nombreSocio = sc.nextLine();
//                System.out.print("Ingrese apellido de Socio: ");
//String apellido = sc.nextLine();
//                if (biblioteca.buscarSocio(nombreSocio,apellido) != null){break;}
//        else {
//        biblioteca.generarSocio(nombreSocio, apellido);
//                    biblioteca.mostrarSocios();
//                }
//                        }
//                        else if (accion == 2) {
//        System.out.print("Primero Ingrese el Nombre del autor: ");
//String nombreAutor = sc.nextLine();
//                System.out.print("Apellido del autor: ");
//String apellidoAutor = sc.nextLine();
//                if (biblioteca.buscarAutor(nombreAutor,apellidoAutor) != null){
//        System.out.print("Ingrese Titulo: ");
//String nombreLibro = sc.nextLine();
//                    System.out.print("Ingrese la Cantidad de paginas: ");
//int cantPaginas = sc.nextInt();
//                    System.out.print("Ingrese el ISBN: ");
//int ISBN = sc.nextInt();
//                    System.out.print("Ingrese la cantidad de ejemplares actual: ");
//int catnEjemplares = sc.nextInt();
//                    biblioteca.agregarLibro(nombreLibro,cantPaginas,ISBN,catnEjemplares);
//                    biblioteca.mostrarAutores();
//                }
//                        else {
//                        biblioteca.agregarAutor(nombreAutor,apellidoAutor);
//                System.out.print("Ingrese Titulo: ");
//String nombreSocio = sc.nextLine();
//                System.out.print("Ingrese la Cantidad de paginas: ");
//int cantPaginas = sc.nextInt();
//                System.out.print("Ingrese el ISBN: ");
//int ISBN = sc.nextInt();
//                System.out.print("Ingrese la cantidad de ejemplares actual: ");
//int catnEjemplares = sc.nextInt();
//                biblioteca.agregarLibro(nombreSocio,cantPaginas,ISBN,catnEjemplares);
//                biblioteca.mostrarAutores();
//                }
//                        }
//                        else if (accion == 3){
//        System.out.print("Ingrese nombre de Socio: ");
//String nombreSocio = sc.nextLine();
//                System.out.print("Ingrese apellido de Socio: ");
//String apellido = sc.nextLine();
//Socio socio = biblioteca.buscarSocio(nombreSocio,apellido);
//                if (socio == null){
//        System.out.println("SOCIO NO REGISTRADO");
//                    break;
//                            }
//                            else {
//                            System.out.print("Ingrese titulo de libro a llevar: ");
//String nombreLibro = sc.nextLine();
//                    biblioteca.generarPrestamo(socio,nombreLibro);
//                    System.out.println("PRESTAMO REALIZADO CON EXITO!");
//                }
//                        }
//                        else if (accion == 0){
//        System.out.println("Cerrando el programa...");
//                break;
//                        }
//                        }
//                        return;