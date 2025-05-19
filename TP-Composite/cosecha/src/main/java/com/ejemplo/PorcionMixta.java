package com.ejemplo;

import java.util.ArrayList;
import java.util.List;

public class PorcionMixta implements IPorcion{
    List<IPorcion> porciones;

    public PorcionMixta() {
        this.porciones = new ArrayList<>();
    }

    public void addPorciones(IPorcion porcion) {
        this.porciones.add(porcion);
    }

    @Override
    public int ganancia() {
        return porciones.stream().mapToInt(IPorcion::ganancia).sum();
    }
}
