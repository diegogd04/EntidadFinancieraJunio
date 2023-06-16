package com.dgd.EntidadFinanciera.domain.useCase;

import com.dgd.EntidadFinanciera.domain.models.Movement;

import java.util.List;

public interface MovementRepository {
    public void save(Movement movement);

    public Movement getByCodigo(Integer movementCodigo);

    public List<Movement> getAll();

    List<Movement> getAllWithremote();
}
