package com.dgd.EntidadFinanciera.domain.models;

public class BankAccount {
    private String numeroCuenta;
    private Customer titularCuenta;
    private Movement transacciones;
    private Product productos;
    private Integer saldo;

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Customer getTitularCuenta() {
        return titularCuenta;
    }

    public void setTitularCuenta(Customer titularCuenta) {
        this.titularCuenta = titularCuenta;
    }

    public Movement getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(Movement transacciones) {
        this.transacciones = transacciones;
    }

    public Product getProductos() {
        return productos;
    }

    public void setProductos(Product productos) {
        this.productos = productos;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }
}
