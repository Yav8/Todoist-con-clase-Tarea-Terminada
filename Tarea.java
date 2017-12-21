
public class Tarea {
    private String tarea;
    private boolean tareaCompletada;
    
    public Tarea(String textoTarea) {
        tarea = textoTarea;
        tareaCompletada = false;
    }
    
    public String obtenerTarea() {
        return tarea;
    }
    
    public boolean tareaEstaCompletada() {
        return tareaCompletada;
    }
}
