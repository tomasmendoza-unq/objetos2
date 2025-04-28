package com.models;

import java.util.ArrayList;
import java.util.List;

public class Trabajador implements ITrabajador{
    private List<Iingreso> ingresos;

    public Trabajador() {
        this.ingresos = new ArrayList<>();
    }

    public void registrarIngreso(Iingreso iingreso){
        ingresos.add(iingreso);
    }

    @Override
    public double getTotalPercibido() {
        return ingresos.stream().mapToDouble(Iingreso::getMonto).sum();
    }

    @Override
    public double getMontoImponible() {
        return ingresos.stream().mapToDouble(Iingreso::getImponible).sum();
    }

    @Override
    public double getImpuestoAPagar() {
        return this.getMontoImponible()*0.2;
    }
}
