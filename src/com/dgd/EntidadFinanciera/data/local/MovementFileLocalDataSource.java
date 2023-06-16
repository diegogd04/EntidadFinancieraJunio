package com.dgd.EntidadFinanciera.data.local;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.dgd.EntidadFinanciera.domain.models.Movement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class MovementFileLocalDataSource {

    private String nameFile = "movements.txt";

    private Gson gson = new Gson();

    private final Type typeMovementsList = new TypeToken<ArrayList<Movement>>() {
    }.getType();

    public void save(Movement movement) {
        List<Movement> movements = findAll();
        movements.add(movement);
        saveToFile(movements);
    }

    public void saveList(List<Movement> movements) {
        saveToFile(movements);
    }

    private void saveToFile(List<Movement> movements) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(movements));
            myWriter.close();
            System.out.println("Movimientos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }


    public Movement findByCodigo(Integer movementCodigo) {
        List<Movement> movements = findAll();
        for (Movement movement : movements) {
            if (Objects.equals(movement.getCodigo(), movementCodigo)) {
                return movement;
            }
        }
        return null;
    }

    public List<Movement> findAll() {
        try {
            File myObj = new File(nameFile);
            if (!myObj.exists()) {
                myObj.createNewFile();
            }
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, typeMovementsList);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error al obtener el listado.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al crear el fichero.");
            throw new RuntimeException(e);
        }
        return new ArrayList<>();
    }

    public void delete(Integer movementCodigo) {
        List<Movement> newList = new ArrayList<>();
        List<Movement> movements = findAll();
        for (Movement movement : movements) {
            if (movement.getCodigo() != movementCodigo) {
                newList.add(movement);
            }
        }
        saveList(newList);
    }
}
