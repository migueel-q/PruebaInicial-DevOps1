/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.Tarea;

/**
 *
 * @author dam2
 */
public class GestorTareas {

    public static void registrarTareas(Tarea tarea, List<Tarea> lista) {
        if (lista.add(tarea)) {
            System.out.println("Se ha registrado correctamente");
        } else {
            System.out.println("No se ha podido registrar la tarea");
        }
    }

    public static void marcarCompletada(int id, List<Tarea> lista) {
        boolean salir = false;
        for (int i = 0; i < lista.size() && !salir; i++) {
            Tarea tarea = lista.get(i);
            if (tarea.getId() == id) {
                tarea.setCompletada(true);
                salir = true;
            }
        }
    }

    public static void listar(List<Tarea> lista) {
        for (int i = 0; i < lista.size(); i++) {
            Tarea tarea = lista.get(i);
            System.out.println(tarea.toString());
        }
        if (lista.size() == 0) {
            System.out.println("No hay tareas");
        }
    }

    public static void eliminar(int id, List<Tarea> lista) {
        boolean salir = false;
        for (int i = 0; i < lista.size() && !salir; i++) {
            Tarea tarea = lista.get(i);
            if (tarea.getId() == id) {
                if (lista.remove(tarea)) {
                    System.out.println("Se ha eliminado correctamente");
                } else {
                    System.out.println("No se ha podido eliminar");
                }
            }
        }
    }
}
