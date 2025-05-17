package com.modules;

public interface ICliente {
    public double getSueldoNetoAnual();

    void solicitarCreditoPersonal(double montoSolicitado, int plazoMes);

    void solicitarCreditoHipotecario(double montoSolicitado, int plazoMes, int nroPropiedad);

    void agregarPropiedad(IPropiedad propiedad);

    double getSueldoNetoMensual();

    int getEdad();
}
