package com.corenetworks.presentacion;

import java.time.LocalTime;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        int sizeArchivo;
        int sizePagina;
        int nPaginas;
        Scanner datosEntrada = new Scanner(System.in);
        System.out.println("Introduzca el tamaño del archivo: ");
        sizeArchivo = datosEntrada.nextInt();
        System.out.println("Introduzca el tamaño de pagina: ");
        sizePagina = datosEntrada.nextInt();
        nPaginas = sizeArchivo / sizePagina;
        if(sizeArchivo % sizePagina != 0)
        {
            nPaginas++;
        }
        System.out.println("Se necesitan " + nPaginas + " paginas.");
        LocalTime duracion = LocalTime.of(10, 30, 45);
        System.out.println(duracion);
    }

}
