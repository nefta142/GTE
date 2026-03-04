package gte;

import java.util.ArrayList;

/**
 *
 * @author nefta
 */
public class GestorTareas {
    private final ArrayList<Tarea> tareas;

    public GestorTareas() {
        this.tareas = new ArrayList<>();
    }

    public void añadirTarea(String descripcion) {
        tareas.add(new Tarea(descripcion));
    }

    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas.");
            return;
        }

        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + ". " + tareas.get(i));
        }
    }
}