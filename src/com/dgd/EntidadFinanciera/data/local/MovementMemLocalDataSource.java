package com.dgd.EntidadFinanciera.data.local;

import com.dgd.EntidadFinanciera.domain.models.Movement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MovementMemLocalDataSource {
    private MovementMemLocalDataSource instance = null;

    private Map<Integer, Movement> storage = new TreeMap<>();

    private MovementMemLocalDataSource(){

    }

    public void save(Movement movement){
        storage.put(movement.getCodigo(), movement);
    }

    public Movement getByCodigo(Integer movementCodigo){
        return storage.get(movementCodigo);
    }

    public List<Movement> getAll(){
        return new ArrayList<>(storage.values());
    }

    public List<Movement> getAllEWithremote(){
        return new ArrayList<>(storage.values());
    }
}
