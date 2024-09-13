package TP1.biblioteca;

import java.time.LocalDate;

public class Prestamo {
        private final Socio socio;
        private final Ejemplar ejemplar;
        private final String fechaPrestamo;
        private  String fechaDevolucion;

        public Prestamo(Socio socio, Ejemplar ejemplar) {
            this.socio = socio;
            this.ejemplar = ejemplar;
            this.fechaPrestamo = LocalDate.now().toString();
            setEjemplar();
        }

        private void setEjemplar(){
            this.ejemplar.setEjemplarDisp(this);
        }

    public Socio getSocio() {
        return socio;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}

