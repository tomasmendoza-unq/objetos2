package com.models;

public class IngresoHSExtras extends Ingreso{
    private int cantHs;

    public IngresoHSExtras(String mes, double monto, String concepto, int cantHs) {
        super(mes, monto, concepto);
        this.cantHs = cantHs;
    }

    @Override
    public double getImponible() {
        return 0;
    }
}
