package com.modules;

public interface IBanco {
    void agregarCliente(ICliente cliente);

    double solicitudDeCreditoPersonal(ICliente cliente, double montoSolicitado, int plazoMes);

    double solicitudDeCreditoHipotecario(ICliente cliente, double montoSolicitado, int plazoMes, IPropiedad propiedad);

    boolean tieneSolicitud(ISolicitudDeCredito solicitudDeCredito);


}
