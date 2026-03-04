package gte;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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

  
}
