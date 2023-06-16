package com.dgd.EntidadFinanciera.domain.useCase;

import com.dgd.EntidadFinanciera.domain.models.Movement;

public class GetMovementUseCase {
    private MovementRepository movementRepository;

    public GetMovementUseCase(MovementRepository movementRepository){
        this.movementRepository = movementRepository;
    }

    public Movement getByCodigo(Integer movementCodigo){
        return movementRepository.getByCodigo(movementCodigo);
    }
}
