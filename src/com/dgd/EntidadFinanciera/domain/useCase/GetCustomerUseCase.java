package com.dgd.EntidadFinanciera.domain.useCase;

import com.dgd.EntidadFinanciera.domain.models.Customer;

public class GetCustomerUseCase {
    private CustomerRepository customerRepository;

    public GetCustomerUseCase(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public Customer getByDni(Integer customerDni){
        return customerRepository.getByDni(customerDni);
    }
}
