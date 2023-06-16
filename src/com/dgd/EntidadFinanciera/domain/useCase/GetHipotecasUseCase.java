package com.dgd.EntidadFinanciera.domain.useCase;

import com.dgd.EntidadFinanciera.domain.models.Hipoteca;

import java.util.List;

public class GetHipotecasUseCase {
    private HipotecaRepository hipotecaRepository;

    public GetHipotecasUseCase(HipotecaRepository hipotecaRepository){
        this.hipotecaRepository = hipotecaRepository;
    }

    public List<Hipoteca> getAll(){
        return hipotecaRepository.getAll();
    }
}
