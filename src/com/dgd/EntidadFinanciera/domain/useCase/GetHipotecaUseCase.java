package com.dgd.EntidadFinanciera.domain.useCase;

import com.dgd.EntidadFinanciera.domain.models.Hipoteca;

public class GetHipotecaUseCase {
    private HipotecaRepository hipotecaRepository;

    public GetHipotecaUseCase(HipotecaRepository hipotecaRepository){
        this.hipotecaRepository = hipotecaRepository;
    }

    public Hipoteca getByCodigo(Integer hipotecaCodigo){
        return hipotecaRepository.getByCodigo(hipotecaCodigo);
    }
}
