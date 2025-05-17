package Factory.impls;

import Factory.IFactoryCredito;
import com.modules.ICliente;
import com.modules.IPropiedad;
import com.modules.ISolicitudDeCredito;
import com.modules.impls.SolicitudDeCreditoHipotecario;
import com.modules.impls.SolicitudDeCreditoPersonal;

public class FactoryCredito implements IFactoryCredito {

    @Override
    public ISolicitudDeCredito crearSolicitudDeCredito(ICliente cliente, double montoSolicitado, int plazoMes) {
        return new SolicitudDeCreditoPersonal(cliente, montoSolicitado, plazoMes);
    }

    @Override
    public ISolicitudDeCredito crearSolicitudDeCredito(ICliente cliente, double montoSolicitado, int plazoMes, IPropiedad propiedad) {
        return new SolicitudDeCreditoHipotecario(cliente, montoSolicitado,plazoMes,propiedad);
    }
}
