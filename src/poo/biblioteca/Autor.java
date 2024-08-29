package biblioteca;

import java.util.ArrayList;

public class Autor {
    private final String nombre;
    private final String apellido;
    private  ArrayList<Libro> libros;

    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.libros = new ArrayList<Libro>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Autor buscarAutor(String nombre,String apellido,ArrayList<Autor> autores){
        boolean autorEsta = false;
        for (Autor autor : autores){
            if (autor.getNombre().equals(nombre) && autor.getApellido().equals(apellido)){
                autorEsta = true;
            }
            if (autorEsta){
                return autor;
            }
        }
        return null;
    }

    public Libro buscarLibro(String titulo){
        boolean libroesta = false;
        for (Libro libro : this.libros){
            if (libro.getTitulo() == titulo){
                libroesta = true;
            }
            if (libroesta){
                return libro;
            }
        }
        return null;
    }

    public Libro buscarLibro(Libro libro){
        if(this.libros.contains(libro.getTitulo())){
            return libro;
        }
        return null;
    }

    public void setLibros(Libro libro) {
        this.libros.add(libro);
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

}
