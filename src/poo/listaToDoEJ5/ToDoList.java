package listaToDoEJ5;

import java.util.ArrayList;
import java.util.Stack;

public class ToDoList {
    private ArrayList<Tarea> tareas;

    public ToDoList() {
        this.tareas = new ArrayList<Tarea>();
    }

    public void addTarea(String descripcion){
        Tarea newTarea = new Tarea(descripcion);
        this.tareas.add(newTarea);
    }

    public void addTarea(String descripcion, int prioridad,String fechaLimite){
        Tarea newTarea = new Tarea(descripcion,prioridad,fechaLimite);
        this.tareas.add(newTarea);
    }

    private void ordenarTareas(){
        int tamanio = this.tareas.size();
        for (int i = 0;i < tamanio;i++){
            for (int j = 0;j < tamanio;j++){
                if (this.tareas.get(j).getPrioridad() < this.tareas.get(i).getPrioridad()){
                    Tarea temp = this.tareas.get(j);
                    this.tareas.set(j,this.tareas.get(j+1));
                    this.tareas.set(j+1,temp);
                }
            }
        }
    }

// hacer ordenar por fecha


    public  void mostrarTareas(){
        ordenarTareas();
        for (Tarea tareaActual : tareas){
            System.out.println(tareaActual.mostrarTarea());
        }
    }
}

