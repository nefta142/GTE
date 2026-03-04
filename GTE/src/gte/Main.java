package gte;

import java.util.Scanner;

/**
 *
 * @author nefta
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();
        int opcion;

        do {

            System.out.println("\n1. Añadir tarea");
            System.out.println("2. Listar tareas");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Introduce la descripción de la tarea: ");
                    String descripcion = sc.nextLine();
                    gestor.añadirTarea(descripcion);
                    System.out.println("Tarea añadida.");
                    break;

                case 2:
                    gestor.mostrarTareas();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}