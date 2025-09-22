/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package devops.gestortareasquiandiazmiguelangel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Tarea;
import service.GestorTareas;

/**
 *
 * @author dam2
 */
public class GestorTareasQuianDiazMiguelAngel {

    public static void main(String[] args) {
        boolean salir = false;
        List<Tarea> lista = new ArrayList<>();
        while (!salir) {
            System.out.println("\n-GESTOR DE TAREAS-");
            System.out.println("1. Registrar tareas");
            System.out.println("2. Marcar completadas");
            System.out.println("3. Listar tareas");
            System.out.println("4. Eliminar tareas");
            System.out.println("5. Salir del programa");

            System.out.println("\n¿Que opcion quieres?");
            int opcion = new Scanner(System.in).nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.print("Introduce un identificador a la tarea (numerico): ");
                    int id = new Scanner(System.in).nextInt();
                    System.out.print("\nIntroduce la descripcion de la tarea: ");
                    String descripcion = new Scanner(System.in).nextLine();
                    System.out.println("\n¿Esta completada la tarea?(true/false)");
                    boolean completa = new Scanner(System.in).nextBoolean();
//                    int aleat = (int) Math.floor(Math.random() * 100) + 1;
                    Tarea tarea = new Tarea(id, descripcion, completa);
                    GestorTareas.registrarTareas(tarea, lista);
                }
                case 2 -> {
                    System.out.println("Introduce el identificador de la tarea que quieres marcar completada");
                    int id = new Scanner(System.in).nextInt();
                    GestorTareas.marcarCompletada(id, lista);
                    System.out.println("Tarea completada!");
                }
                case 3 -> {
                    System.out.println("Lista de tareas:");
                    GestorTareas.listar(lista);
                }
                case 4 -> {
                    System.out.println("Introduce el identificador de la tarea que quieres eliminar");
                    int id = new Scanner(System.in).nextInt();
                    GestorTareas.eliminar(id, lista);
                }
                case 5 -> {
                    System.out.println("Saliendo del programa...");
                    salir = true;
                }
            }
        }
    }
}
