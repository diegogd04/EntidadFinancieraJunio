package com.dgd.EntidadFinanciera.domain.useCase;

import com.dgd.EntidadFinanciera.domain.models.Movement;

import java.util.List;

public class GetMovementsUseCase {
    private MovementRepository movementRepository;

    public GetMovementsUseCase(MovementRepository movementRepository){
        this.movementRepository = movementRepository;
    }

    public List<Movement> getAll(){
        return movementRepository.getAll();
    }
}
