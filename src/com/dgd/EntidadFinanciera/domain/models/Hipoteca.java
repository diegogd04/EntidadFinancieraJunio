package com.dgd.EntidadFinanciera.domain.models;

public class Hipoteca extends Product{
    private String fechaInicioPrestamo;
    private Integer interes;
    private String fechaFinPrestamo;
    private Integer importe;

    public String getFechaInicioPrestamo() {
        return fechaInicioPrestamo;
    }

    public void setFechaInicioPrestamo(String fechaInicioPrestamo) {
        this.fechaInicioPrestamo = fechaInicioPrestamo;
    }

    public Integer getInteres() {
        return interes;
    }

    public void setInteres(Integer interes) {
        this.interes = interes;
    }

    public String getFechaFinPrestamo() {
        return fechaFinPrestamo;
    }

    public void setFechaFinPrestamo(String fechaFinPrestamo) {
        this.fechaFinPrestamo = fechaFinPrestamo;
    }

    public Integer getImporte() {
        return importe;
    }

    public void setImporte(Integer importe) {
        this.importe = importe;
    }
}
