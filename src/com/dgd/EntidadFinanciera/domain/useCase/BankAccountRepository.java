package com.dgd.EntidadFinanciera.domain.useCase;

import com.dgd.EntidadFinanciera.domain.models.BankAccount;

public interface BankAccountRepository {
    public void save(BankAccount bankAccount);

    public void getByNumeroCuenta(String numeroCuenta);
}
