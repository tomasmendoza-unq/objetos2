package com.models;

public class Ingreso implements Iingreso{
    private String mes;

    private String concepto;

    private double monto;

    public Ingreso(String mes, double monto, String concepto) {
        this.mes = mes;
        this.monto = monto;
        this.concepto = concepto;
    }

    @Override
    public double getImponible() {
        return this.getMonto();
    }

    @Override
    public double getMonto() {
        return monto;
    }
}
