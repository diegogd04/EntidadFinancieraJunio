package com.dgd.EntidadFinanciera.domain.useCase;

import com.dgd.EntidadFinanciera.domain.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class GetCustomersRemoteUseCase {
    private CustomerRepository customerRepository;

    public  GetCustomersRemoteUseCase(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public List<Customer> execute(){
        return customerRepository.getAllWithRemote();
    }
}
