package com.dgd.EntidadFinanciera.domain.useCase;

import com.dgd.EntidadFinanciera.domain.models.Empleado;

public class DeleteEmpleadoUseCase {
    private EmpleadoRepository empleadoRepository;

    public DeleteEmpleadoUseCase(EmpleadoRepository empleadoRepository){
        this.empleadoRepository = empleadoRepository;
    }

    public void execute(Empleado empleado){
        empleadoRepository.delete(empleado);
    }
}
