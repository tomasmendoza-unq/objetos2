package com.modules.impls;

import com.modules.ICliente;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito {
    public SolicitudDeCreditoPersonal(ICliente cliente, double montoSolicitado, int plazoAPagar) {
        super(cliente, montoSolicitado, plazoAPagar);
        this.seAcepto = this.puedeSerAceptada();
    }

    @Override
    public boolean puedeSerAceptada() {
        double ingresoMensual = cliente.getSueldoNetoAnual() / 12;
        return cliente.getSueldoNetoAnual() >= 15000 &&
                cliente.getSueldoNetoMensual() <= ingresoMensual * 0.7;
    }


}
