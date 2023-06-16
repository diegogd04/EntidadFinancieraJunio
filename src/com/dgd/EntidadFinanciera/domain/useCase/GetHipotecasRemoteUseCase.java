package com.dgd.EntidadFinanciera.domain.useCase;

import com.dgd.EntidadFinanciera.domain.models.Hipoteca;

import java.util.List;

public class GetHipotecasRemoteUseCase {
    private HipotecaRepository hipotecaRepository;

    public GetHipotecasRemoteUseCase(HipotecaRepository hipotecaRepository){
        this.hipotecaRepository = hipotecaRepository;
    }

    public List<Hipoteca> getAllWithRemote(){
        return hipotecaRepository.getAllWithRemote();
    }
}
