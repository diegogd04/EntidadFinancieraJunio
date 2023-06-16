package com.dgd.EntidadFinanciera.domain.models;

public class Empleado extends Person{
    private String numeroSeguridadSocial;

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }
}
