package com.corenetworks.presentacion;

import com.corenetworks.modelo.Process;
import com.corenetworks.modelo.ProcessManager;

import java.time.LocalTime;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio_3 {
    private static Scanner datosEntrada = new Scanner(System.in);
    static ProcessManager pM1 = new ProcessManager();

    public static void main(String[] args) {

        int opcion;
        do{
            mostrarMenu();
            opcion = datosEntrada.nextInt();
            switch (opcion){
                case 1 -> generarProceso();
                case 2 -> ejecutarLosProcesos();
            }
        }while (opcion>=1 && opcion<=2);
    }

    private static void ejecutarLosProcesos()
    {
        System.out.println(pM1.ejecutarProcesos());
    }


    private static void generarProceso() {
        String nombre;
        int id;
        int duracion;
        System.out.println("---Introduzca los Datos del Proceso ---");
        System.out.println("Escriba el id del proceso: ");
        id = datosEntrada.nextInt();
        System.out.println("Escriba el nombre del Proceso: ");
        nombre = datosEntrada.next();
        System.out.println("Introduzca los segundos que durara el Proceso: ");
        duracion = datosEntrada.nextInt();
        LocalTime tiempo = LocalTime.of(0,0,duracion);

        Process p1 = new Process(id,nombre,tiempo);
        pM1.crearProceso(p1);

    }

    public static void mostrarMenu(){
        System.out.println("----------------------------------------------------");
        System.out.println("----------------Menu de opciones -------------------");
        System.out.println("-------------- 1) Crear Proceso---------------------");
        System.out.println("-------------- 2) Ejecutar Todos los Procesos-------");
        System.out.println("-------------- 3) salir-----------------------------");
        System.out.println("-------------- Escriba la opción:------------------ ");
        System.out.println("----------------------------------------------------");
    }

}
