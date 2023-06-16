package com.dgd.EntidadFinanciera.domain.models;

public class PlazoFijo extends Product{
    private Integer mesesPlazo;
    private Integer interes;

    public Integer getMesesPlazo() {
        return mesesPlazo;
    }

    public void setMesesPlazo(Integer mesesPlazo) {
        this.mesesPlazo = mesesPlazo;
    }

    public Integer getInteres() {
        return interes;
    }

    public void setInteres(Integer interes) {
        this.interes = interes;
    }
}
