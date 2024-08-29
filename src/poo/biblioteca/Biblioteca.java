package biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;

public class Biblioteca {
    private final ArrayList<Socio> socios;
    private final ArrayList<Autor> autores;
    private int cantprestamos;

    public Biblioteca() {
        this.socios = new ArrayList<>();
        this.autores = new ArrayList<>();
    }

    public void generarPrestamo(String nombreSocio,String apellidoSocio,String titulo){
        Socio socio = this.buscarSocio(nombreSocio,apellidoSocio);
        Ejemplar ejemdisp;
        Libro libr_aux = null;
        for (Autor autor : autores){
            libr_aux = autor.buscarLibro(titulo);
        }
        ejemdisp = libr_aux.getejemplaresDisp();
        if (ejemdisp != null) {
            Prestamo nuevoPrestamo = new Prestamo(socio, ejemdisp);
            socio.setPrestamos(nuevoPrestamo);
            this.cantprestamos++;
        }
        else {
            System.out.println("NO SE PUDO GENERAR EL PRESTAMO");
        }

    }

    public void registrarDevolucion(String nombreSocio,String apellidoSocio,String titulo){
        Socio socio = this.buscarSocio(nombreSocio,apellidoSocio);
        Ejemplar ejemprestado;
        Libro libr_aux = null;
        for (Autor autor : this.autores){
            libr_aux = autor.buscarLibro(titulo);
        }
        ejemprestado = libr_aux.getEjemplarPrestado();
        Prestamo prestamoActual = ejemprestado.getEjemplarDisp();
        if (prestamoActual.getSocio() == socio){
            ejemprestado.setEjemplarDisp(null);
            prestamoActual.setFechaDevolucion(LocalDate.now().toString());
        }

    }

    public void generarSocio(String Nombre,String Apellido){
        Socio nuevoSocio = new Socio(Nombre,Apellido);
        this.socios.add(nuevoSocio);
    }

    public Socio buscarSocio(String nombre,String apellido){
        boolean socioregistrado = false;
        for (Socio socio : socios){
            if (socio.getNombre().equals(nombre) && socio.getApellido().equals(apellido)){
                socioregistrado = true;
            }
            if (socioregistrado){
                return socio;
            }
        }
        return null;
    }

    public void mostrarSocios(){
        for(Socio socio : this.socios){
            System.out.println("Socio: "+socio.getNombre());
        }
    }

    public void agregarAutor(String nombre,String apellido){
        Autor nuevoautor = new Autor(nombre,apellido);
        this.autores.add(nuevoautor);
        System.out.println("Autor del libro Agregado con exito");
    }

    public void agregarLibro(String titulo,int cantpaginas,int ISBN,int cantidadEjemplares){
        Libro nuevoLibro = new Libro(titulo,cantpaginas,ISBN,cantidadEjemplares);
        for(Autor autor : this.autores){
            if (autor.buscarLibro(nuevoLibro) == null){
                autor.setLibros(nuevoLibro);
            }

        }
    }

    public Autor buscarAutor(String nombre,String apellido){
        boolean autorEsta = false;
        for (Autor autor : this.autores){
            if (autor.getNombre().equals(nombre) && autor.getApellido().equals(apellido)){
                autorEsta = true;
            }
            if (autorEsta){
                return autor;
            }
        }
        return null;
    }



    public void mostrarAutores() {
        for (Autor autor : this.autores) {
            System.out.println("Autor: " + autor.getNombre());
            for (Libro libro : autor.getLibros()){
                System.out.println("Libros: " + libro.getTitulo());
            }
        }
    }





}
