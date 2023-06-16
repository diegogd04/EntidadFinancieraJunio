package com.dgd.EntidadFinanciera.presentation;

import com.dgd.EntidadFinanciera.domain.models.*;

public class TeamView {
    public void init(){
        Customer customer = new Customer();
        customer.setDni("12534678L");
        customer.setNombre("Pepe");
        customer.setApellidos("García López");
        customer.setDireccion("Hornos Caleros Nº2 3ºB");
        customer.setPoblacion("Ávila");
        customer.setCodigoPostal("05003");

        Hipoteca hipoteca = new Hipoteca();
        hipoteca.setCodigo(1);
        hipoteca.setNombre("Hipoteca1");
        hipoteca.setFechaInicioPrestamo("12/02/2022");
        hipoteca.setFechaFinPrestamo("12/02/2023");
        hipoteca.setImporte(100000);
        hipoteca.setInteres(20);
        hipoteca.setDescripcion("Hipoteca de la casa");

        Movement cobro = new Movement();
        cobro.setCodigo(1);
        cobro.setDescripcion("Nómina");
        cobro.setImporte(1200);

        Movement pago = new Movement();
        pago.setCodigo(2);
        pago.setDescripcion("Luz");
        pago.setImporte(200);

        BankAccount bankAccount = new BankAccount();
        bankAccount.setNumeroCuenta("ES123456789");
        bankAccount.setTitularCuenta(customer);
        bankAccount.setProductos(hipoteca);
        bankAccount.setSaldo(20000);
        bankAccount.setTransacciones(cobro);
        bankAccount.setTransacciones(pago);

        System.out.println("Cliente: " + customer + " Cuenta: " + bankAccount + " Cobro: " + cobro + " Pago: " + pago + "Producto: " + hipoteca);
    }
}
