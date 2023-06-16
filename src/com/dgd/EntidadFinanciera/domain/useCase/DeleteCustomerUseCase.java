package com.dgd.EntidadFinanciera.domain.useCase;

import com.dgd.EntidadFinanciera.domain.models.Customer;

public class DeleteCustomerUseCase {
    private CustomerRepository customerRepository;

    public DeleteCustomerUseCase(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public void execute(Customer customer){
        customerRepository.delete(customer);
    }
}
