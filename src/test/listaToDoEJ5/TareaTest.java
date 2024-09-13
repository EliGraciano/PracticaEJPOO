package listaToDoEJ5;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import TP1.listaToDoEJ5.Tarea;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class TareaTest {
    public static Tarea tarea1 ;
    public static Tarea anterior;
    @BeforeEach
    void setUp() {
        tarea1 = new Tarea("ir al supermercado",10,"30/08/24");
        anterior = new Tarea("Rendir matematica discreta",5,"30/07/2024");
    }

    @Test
    void crearTarea() {
        boolean estadoResultado = tarea1.getEstado();
        assertFalse(estadoResultado);
    }

    @Test
    void marcarTareaComoCompletada() {
        tarea1.tacharTarea();
        assertTrue(tarea1.getEstado());
    }

//    @Test
//    void tacharTarea() {
//    }
}