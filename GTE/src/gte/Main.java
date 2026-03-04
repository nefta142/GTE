/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gte;

import java.util.Scanner;

/**
 *
 * @author nefta
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();

        System.out.println("1. Añadir tarea");
        System.out.print("Seleccione una opción: ");

        int opcion = sc.nextInt();
        sc.nextLine(); 

        if (opcion == 1) {
            System.out.print("Introduce la descripción de la tarea: ");
            String descripcion = sc.nextLine();

            gestor.añadirTarea(descripcion);

            System.out.println("Tarea añadida correctamente.");
        }
        
    }
    
}
