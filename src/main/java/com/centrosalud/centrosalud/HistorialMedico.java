package com.centrosalud.centrosalud;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;


public class HistorialMedico {
    private int idhis;
    private Profesional doctor;
    private List<Dolencia> dolencias;
    private Map<String, List<String>> medicamentoxdolencia;
    private LocalDateTime fechahora;
    
    

    public LocalDateTime getFechahora() {
        return fechahora;
    }
    public HistorialMedico(int idhis, Profesional doctor, List<Dolencia> dolencias, Map<String, List<String>> medicamentoxdolencia, LocalDateTime f) {
        this.idhis = idhis;
        this.doctor = doctor;
        this.dolencias = dolencias;
        this.medicamentoxdolencia = medicamentoxdolencia;
        this.fechahora = f;
    }
    public int getIdhis() {
        return idhis;
    }
   
    public Profesional getDoctor() {
        return doctor;
    }
    public List<Dolencia> getDolencias() {
        return dolencias;
    }
    public Map<String, List<String>> getMedicamentoxdolencia() {
        return medicamentoxdolencia;
    }
    
    

    


    
    
}
