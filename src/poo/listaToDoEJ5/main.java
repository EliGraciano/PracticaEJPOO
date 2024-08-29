package listaToDoEJ5;

import com.sun.tools.javac.Main;

public class main {
    public static void main(String Args[]){

        ToDoList nuevaLista = new ToDoList();
        nuevaLista.addTarea("Ir al supermercado mañana");
        nuevaLista.addTarea("Consultar repuesto del auto",1,"24/08/2024");
        nuevaLista.mostrarTareas();


//        Tarea tarea1 = new Tarea("Ir al supermercado mañana",1,"26/08/2024");
//        Tarea tarea2 = new Tarea("Consultar repuesto del auto",1,"24/08/2024");
//        Tarea tarea3 = new Tarea("Ir al cine a ver la nueva película de Marvel",1,"24/08/2024");
//        tarea2.tacharTarea();
//        System.out.println(tarea1.mostrarTarea());
//        System.out.println(tarea2.mostrarTarea());
//        System.out.println(tarea3.mostrarTarea());
//
//        tarea1.setDescripcion("Ir al supermercado");
//        System.out.println(tarea1.mostrarTarea());

    }
}
