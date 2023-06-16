package com.dgd.EntidadFinanciera.data.local;

import com.dgd.EntidadFinanciera.domain.models.Movement;

import java.util.List;

public interface MovementLocalDataSource {
    public void save(Movement movement);

    public Movement getByCodigo(Integer movementCodigo);

    public List<Movement> getAll();

    List<Movement> getAllWithremote();
}
