package com.dgd.EntidadFinanciera.domain.useCase;

import com.dgd.EntidadFinanciera.domain.models.Empleado;

public class GetEmpleadoUseCase {
    private EmpleadoRepository empleadoRepository;

    public GetEmpleadoUseCase(EmpleadoRepository empleadoRepository){
        this.empleadoRepository = empleadoRepository;
    }

    public Empleado execute(Integer empleadoDni){
        return empleadoRepository.getByDni(empleadoDni);
    }
}
