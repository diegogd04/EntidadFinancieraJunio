package com.dgd.EntidadFinanciera.domain.useCase;

import com.dgd.EntidadFinanciera.domain.models.Hipoteca;

public class DeleteHipotecaUseCase {
    private HipotecaRepository hipotecaRepository;

    public DeleteHipotecaUseCase(HipotecaRepository hipotecaRepository){
        this.hipotecaRepository = hipotecaRepository;
    }

    public void execute(Hipoteca hipoteca){
        hipotecaRepository.delete(hipoteca);
    }
}
