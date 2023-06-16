package com.dgd.EntidadFinanciera.domain.useCase;

import com.dgd.EntidadFinanciera.domain.models.Empleado;

import java.util.List;

public class GetEmpleadosRemoteUseCase {
    private EmpleadoRepository empleadoRepository;

    public GetEmpleadosRemoteUseCase(EmpleadoRepository empleadoRepository){
        this.empleadoRepository = empleadoRepository;
    }

    public List<Empleado> execute(){
        return empleadoRepository.getAllWithRemote();
    }
}
