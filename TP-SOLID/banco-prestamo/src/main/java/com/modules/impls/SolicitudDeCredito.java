package com.modules.impls;

import com.modules.ICliente;
import com.modules.ISolicitudDeCredito;

public abstract class SolicitudDeCredito implements ISolicitudDeCredito {
    protected ICliente cliente;
    protected double montoSolicitado;
    protected int plazoAPagar;
    protected boolean seAcepto;

    public SolicitudDeCredito(ICliente cliente, double montoSolicitado, int plazoAPagar) {
        this.cliente = cliente;
        this.montoSolicitado = montoSolicitado;
        this.plazoAPagar = plazoAPagar;

    }

    @Override
    public boolean seAcepto() {
        return seAcepto;
    }
}
