package com.centrosalud.centrosalud;


public class Dolencia {

    private String coddiag;
    private String nombrediag;

    public Dolencia(String cod, String nombrediag) {
        this.coddiag = cod;
        this.nombrediag = nombrediag;
    }       

    public String getNombrediag() {
        return nombrediag;
    }

    public String getCoddiag() {
        return coddiag;
    }

    @Override
    public String toString() {
        return coddiag + ", " +  nombrediag;
    }

}
