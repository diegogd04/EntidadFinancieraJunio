package com.dgd.EntidadFinanciera.domain.useCase;

import com.dgd.EntidadFinanciera.domain.models.Customer;

import java.util.List;

public interface CustomerRepository {
    public void save(Customer customer);

    public void delete(Customer customer);

    public Customer getByDni(Integer customerDni);

    public List<Customer> getAll();

    List<Customer> getAllWithRemote();
}
