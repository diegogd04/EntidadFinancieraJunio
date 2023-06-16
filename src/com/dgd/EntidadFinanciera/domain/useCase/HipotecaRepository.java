package com.dgd.EntidadFinanciera.domain.useCase;

import com.dgd.EntidadFinanciera.domain.models.Hipoteca;

import java.util.List;

public interface HipotecaRepository {
    public void save(Hipoteca hipoteca);

    public void delete(Hipoteca hipoteca);

    public Hipoteca getByCodigo(Integer codigo);

    public List<Hipoteca> getAll();

    List<Hipoteca> getAllWithRemote();
}
