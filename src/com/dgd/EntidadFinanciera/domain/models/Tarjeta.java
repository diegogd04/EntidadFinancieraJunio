package com.dgd.EntidadFinanciera.domain.models;

public class Tarjeta extends Product{
    private String fehaCaducidad;
    private String numeroTarjeta;

    public String getFehaCaducidad() {
        return fehaCaducidad;
    }

    public void setFehaCaducidad(String fehaCaducidad) {
        this.fehaCaducidad = fehaCaducidad;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
}
