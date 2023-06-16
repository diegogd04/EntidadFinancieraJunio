package com.dgd.EntidadFinanciera.domain.useCase;

import com.dgd.EntidadFinanciera.domain.models.Empleado;

import java.util.ArrayList;
import java.util.List;

public class GetEmpleadosUseCase {
    private EmpleadoRepository empleadoRepository;

    public GetEmpleadosUseCase(EmpleadoRepository empleadoRepository){
        this.empleadoRepository = empleadoRepository;
    }

    public List<Empleado> getAll(){
        return empleadoRepository.getAll();
    }
}
