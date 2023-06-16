package com.dgd.EntidadFinanciera.domain.useCase;

import com.dgd.EntidadFinanciera.domain.models.BankAccount;

public class AddBankAccountUseCase {
    private BankAccountRepository bankAccountRepository;

    public AddBankAccountUseCase(BankAccountRepository bankAccountRepository){
        this.bankAccountRepository = bankAccountRepository;
    }

    public void execute(BankAccount bankAccount){
        bankAccountRepository.save(bankAccount);
    }
}
