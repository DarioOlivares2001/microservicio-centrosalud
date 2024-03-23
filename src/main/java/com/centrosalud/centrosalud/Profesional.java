package com.centrosalud.centrosalud;

public class Profesional {
    private String rutprof;
    private String nombreprof;
    private String especialidad;

    public Profesional(String rut, String nom, String especial){
        this.rutprof = rut;
        this.nombreprof = nom;
        this.especialidad = especial;
    }

    public String getRutprof() {
        return rutprof;
    }

    public String getNombreprof() {
        return nombreprof;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String toString()
    {
        return rutprof + ", " + nombreprof + ", " + especialidad;

    }

    
    

    
}
