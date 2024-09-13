package TP1.listaToDoEJ5;

import java.time.LocalDate;

public class Tarea {
    private String descripcion;
    private int prioridad;
    private boolean estado; //comienza en false ya que se supone que todavia no se realizo
    private String fechaLimite;

    public Tarea(String descripcion, int prioridad,String fechaLimite) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = false;
        this.fechaLimite =  fechaLimite;
    }

    public Tarea(String descripcion){
        this.descripcion = descripcion;
        this.estado = false;
        this.prioridad = 10;
        this.fechaLimite = LocalDate.now().plusMonths(1).toString();//un mes como maximo;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void tacharTarea(){
        this.estado = true;
    }

    public String mostrarTarea(){
        String informacion = "";
        if (!this.getEstado()){
            informacion = informacion.concat("(disponible)");
        }
        else {
            informacion = informacion.concat("(vencida)");

        }
        return informacion.concat(this.descripcion);
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }


}
