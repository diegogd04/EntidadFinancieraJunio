package com.dgd.EntidadFinanciera.domain.useCase;

import com.dgd.EntidadFinanciera.domain.models.BankAccount;

public class GetBankAccountUseCase {
    private BankAccountRepository bankAccountRepository;

    public GetBankAccountUseCase(BankAccountRepository bankAccountRepository){
        this.bankAccountRepository = bankAccountRepository;
    }

    public BankAccount getByNumeroCuenta(String numeroCuenta){
        return bankAccountRepository.getByNumeroCuenta(numeroCuenta);
    }
}
