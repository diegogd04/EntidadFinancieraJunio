package com.dgd.EntidadFinanciera.domain.useCase;

import com.dgd.EntidadFinanciera.domain.models.Movement;

public class AddMovementUseCase {
    private MovementRepository movementRepository;

    public AddMovementUseCase(MovementRepository movementRepository){
        this.movementRepository = movementRepository;
    }

    public void execute(Movement movement){
        movementRepository.save(movement);
    }
}
