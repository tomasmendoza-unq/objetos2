package com.modules.impls;

import com.modules.ICliente;
import com.modules.IPropiedad;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito{
    IPropiedad propiedad;

    public SolicitudDeCreditoHipotecario(ICliente cliente, double montoSolicitado, int plazoAPagar, IPropiedad propiedad) {
        super(cliente, montoSolicitado, plazoAPagar);
        this.propiedad = propiedad;
        this.seAcepto = this.puedeSerAceptada();

    }

    @Override
    public boolean puedeSerAceptada() {
        double ingresoMensual = cliente.getSueldoNetoAnual() / 12;
        int edadAlFinal = cliente.getEdad() + plazoAPagar / 12;

        return cliente.getSueldoNetoMensual() <= ingresoMensual * 0.5 &&
                montoSolicitado <= propiedad.getValorFiscal() * 0.7 &&
                edadAlFinal <= 65;
    }

}
