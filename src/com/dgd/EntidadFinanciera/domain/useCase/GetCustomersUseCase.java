package com.dgd.EntidadFinanciera.domain.useCase;

import com.dgd.EntidadFinanciera.domain.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class GetCustomersUseCase {
    private CustomerRepository customerRepository;

    public GetCustomersUseCase(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAll(){
        return new ArrayList();
    }
}
