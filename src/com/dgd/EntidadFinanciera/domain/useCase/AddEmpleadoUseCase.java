package com.dgd.EntidadFinanciera.domain.useCase;

import com.dgd.EntidadFinanciera.domain.models.Empleado;

public class AddEmpleadoUseCase {
    private EmpleadoRepository empleadoRepository;

    public AddEmpleadoUseCase(EmpleadoRepository empleadoRepository){
        this.empleadoRepository = empleadoRepository;
    }

    public void execute(Empleado empleado){
        empleadoRepository.save(empleado);
    }
}
