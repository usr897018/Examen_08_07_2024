package com.corenetworks.modelo;

import java.util.ArrayDeque;
import java.util.Queue;

public class ProcessManager {
    private static Queue<Process> registroDeProcesos = new ArrayDeque<>();
    public boolean crearProceso(Process p1)
    {
       return registroDeProcesos.offer(p1);
    }
    public String ejecutarProcesos()
    {
        String texto = "";
        for(Process elemento: registroDeProcesos)
        {
            texto += registroDeProcesos.poll() + "\n";
        }
        return texto;
    }

}
