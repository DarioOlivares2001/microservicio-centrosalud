package com.centrosalud.centrosalud;

import java.util.List;

public class Paciente {
    private int id;
    private String rut;
    private String nombre;
    private String apepaterno;
    private String apematerno;
    private String fono;
    private int edad;
    private List<HistorialMedico> listahistorial;

    

    public Paciente(int id, String rut, String nombre, String apepaterno, String apematerno, String fono, int edad,List<HistorialMedico> listahistorial) {
        this.id = id;
        this.rut = rut;
        this.nombre = nombre;
        this.apepaterno = apepaterno;
        this.apematerno = apematerno;
        this.fono = fono;
        this.edad = edad;
        this.listahistorial = listahistorial;
    }
    public int getId() {
        return id;
    }
    public String getRut() {
        return rut;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApepaterno() {
        return apepaterno;
    }
    public String getApematerno() {
        return apematerno;
    }
    public String getFono() {
        return fono;
    }
    public int getEdad() {
        return edad;
    }
    public List<HistorialMedico> getListahistorial() {
        return listahistorial;
    }

    
}
