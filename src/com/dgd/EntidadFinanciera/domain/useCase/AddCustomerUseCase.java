package com.dgd.EntidadFinanciera.domain.useCase;

import com.dgd.EntidadFinanciera.domain.models.Customer;

public class AddCustomerUseCase {
    private CustomerRepository customerRepository;

    public AddCustomerUseCase(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public void execute(Customer customer){
        customerRepository.save(customer);
    }
}
