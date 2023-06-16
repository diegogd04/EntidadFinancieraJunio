package com.dgd.EntidadFinanciera.domain.useCase;

import com.dgd.EntidadFinanciera.domain.models.Empleado;

import java.util.List;

public interface EmpleadoRepository {
    public void save(Empleado empleado);

    public void delete(Empleado empleado);

    public Empleado getByDni(Integer empleadoDni);

    public List<Empleado> getAll();

    List<Empleado> getAllWithRemote();
}
