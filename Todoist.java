
import java.util.ArrayList;
/**
 * Clase que permite almacenar las tareas pendientes que tenemos por hacer
 */
public class Todoist {
    private ArrayList<String> listaTareas;
    private ArrayList<Boolean> listaTareasEnModoBooleano;
    
    /**
     * Constructor de la clase Todoist.
     */
    public Todoist() {
        listaTareas = new ArrayList<String>();
        listaTareasEnModoBooleano = new ArrayList<Boolean>();
    }
    
    /**
     * Inserta una nueva tarea
     */
    public void addTarea(String textoTarea) {
        Tarea tarea = new Tarea(textoTarea);
        listaTareas.add(tarea.obtenerTarea());
        listaTareasEnModoBooleano.add(tarea.tareaEstaCompletada());
    }

    /**
     * Metodo que imprime todas las tareas existentes, una por linea.
     * El metodo imprime el numero de posicion de la tarea antes del
     * nombre de la tarea. Si la tarea está completada, entonces muestra
     * un "[X]" delante de la tarea; si no está completada muestra un "[ ]"
     */
    public void mostrarTareasNumeradas() {
        int contador = 0;
        String tareaActual = "";
        while(contador < listaTareas.size()) {
            tareaActual = listaTareas.get(contador);
            if(listaTareasEnModoBooleano.get(contador) == false) {
                System.out.println("[ ] " + (contador + 1) + ". " + tareaActual);
            }
            else {
                System.out.println("[X] " + (contador + 1) + ". " + tareaActual);
            }
            contador += 1;
        }
    }
    
    /**
     * Marca como completada la tarea indicada como parámetro. Por ejemplo,
     * si el parámetro es 0 marca como completada la primera tarea, si es 1 la
     * segunda, etc.
     */
    public void marcarComoCompletada(int indiceTarea) {
        if(indiceTarea < listaTareasEnModoBooleano.size() && indiceTarea >= 0) {
            listaTareasEnModoBooleano.set(indiceTarea, true);
        }
        else {
            System.out.println("Error, el número introducido no pertenece a ningún elemento de la lista");
        }
    }
}
