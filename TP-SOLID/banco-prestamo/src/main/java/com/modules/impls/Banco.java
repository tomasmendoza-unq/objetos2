package com.modules.impls;

import Factory.IFactoryCredito;
import com.modules.IBanco;
import com.modules.ICliente;
import com.modules.IPropiedad;
import com.modules.ISolicitudDeCredito;

import java.util.ArrayList;
import java.util.List;

public class Banco implements IBanco {

    private IFactoryCredito factoryCredito;
    private List<ISolicitudDeCredito> solicitudDeCreditoList;
    private List<ICliente> clientes;

    public Banco(IFactoryCredito factoryCredito) {
        this.factoryCredito = factoryCredito;
        this.solicitudDeCreditoList = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    @Override
    public void agregarCliente(ICliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public double solicitudDeCreditoPersonal(ICliente cliente, double montoSolicitado, int plazoMes) {
        ISolicitudDeCredito solicitudDeCredito = factoryCredito.crearSolicitudDeCredito(cliente, montoSolicitado, plazoMes);
        return this.procesarSolicitud(solicitudDeCredito,montoSolicitado);
    }

    private double procesarSolicitud(ISolicitudDeCredito solicitud, double montoSolicitado) {
        this.agregarSolicitud(solicitud);
        return solicitud.seAcepto() ? montoSolicitado : 0;
    }

    private void agregarSolicitud(ISolicitudDeCredito solicitudDeCredito) {
        solicitudDeCreditoList.add(solicitudDeCredito);
    }

    @Override
    public double solicitudDeCreditoHipotecario(ICliente cliente, double montoSolicitado, int plazoMes, IPropiedad propiedad) {
        ISolicitudDeCredito solicitudDeCredito = factoryCredito.crearSolicitudDeCredito(cliente,montoSolicitado,plazoMes,propiedad);
        return this.procesarSolicitud(solicitudDeCredito,montoSolicitado);
    }

    @Override
    public boolean tieneSolicitud(ISolicitudDeCredito solicitudDeCredito) {
        return solicitudDeCreditoList.contains(solicitudDeCredito);
    }
}
