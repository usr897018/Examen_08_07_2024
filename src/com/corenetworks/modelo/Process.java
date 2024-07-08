package com.corenetworks.modelo;

import java.time.LocalTime;

public class Process {
    private int id;
    private String name;
    private LocalTime duracionProceso;

    @Override
    public String toString() {
        return "Process{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duracionProceso=" + duracionProceso +
                '}';
    }

    public Process() {
    }

    public Process(int id, String name, LocalTime duracionProceso) {
        this.id = id;
        this.name = name;
        this.duracionProceso = duracionProceso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getDuracionProceso() {
        return duracionProceso;
    }

    public void setDuracionProceso(LocalTime duracionProceso) {
        this.duracionProceso = duracionProceso;
    }
}
