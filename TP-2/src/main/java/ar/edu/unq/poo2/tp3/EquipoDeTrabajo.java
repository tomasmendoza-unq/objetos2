package ar.edu.unq.poo2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {

    private String nombre;

    private ArrayList<Persona> integrantes;

    public EquipoDeTrabajo(String nombre, ArrayList<Persona> integrantes) {
        this.nombre = nombre;
        this.integrantes = integrantes;
    }

    public String getNombre() {
        return nombre;
    }

    public double edadPromedio(){
        return integrantes.stream().mapToInt(Persona::edad).average().orElse(0);
    }
}
