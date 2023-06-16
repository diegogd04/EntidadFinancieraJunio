package com.dgd.EntidadFinanciera.domain.useCase;

import com.dgd.EntidadFinanciera.domain.models.Hipoteca;

public class AddHipotecaUseCase {
    private HipotecaRepository hipotecaRepository;

    public AddHipotecaUseCase(HipotecaRepository hipotecaRepository){
        this.hipotecaRepository = hipotecaRepository;
    }

    public void execute(Hipoteca hipoteca){
        hipotecaRepository.save(hipoteca);
    }
}
