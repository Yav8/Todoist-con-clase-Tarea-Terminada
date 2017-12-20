
public class Tarea {
    private String tarea;
    private boolean tareaCompletada;
    
    public Tarea(String textoTarea) {
        tarea = textoTarea;
        tareaCompletada = false;
    }
    
    public void añadirTarea(String textoTarea) {
        tarea = textoTarea;
    }
    
    public String obtenerTarea() {
        return tarea;
    }
    
    public boolean tareaEstaCompletada() {
        return tareaCompletada;
    }
}
