package gte;
public class Tarea {
    private String descripcion;
    private boolean completada;

    public Tarea(String descripcion) {
        if (descripcion == null || descripcion.trim().isEmpty()) {
            throw new IllegalArgumentException("La descripción no puede estar vacía.");
        }
        this.descripcion = descripcion.trim();
        this.completada = false;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion == null || descripcion.trim().isEmpty()) {
            throw new IllegalArgumentException("La descripción no puede estar vacía.");
        }
        this.descripcion = descripcion.trim();
    }

    public void marcarCompletada() {
        this.completada = true;
    }

    public void marcarPendiente() {
        this.completada = false;
    }

    @Override
    public String toString() {
        return (completada ? "[X] " : "[ ] ") + descripcion;
    }
}
