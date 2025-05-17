package Factory;

import com.modules.ICliente;
import com.modules.IPropiedad;
import com.modules.ISolicitudDeCredito;

public interface IFactoryCredito {
     ISolicitudDeCredito crearSolicitudDeCredito(ICliente cliente, double montoSolicitado, int plazoMes);

     ISolicitudDeCredito crearSolicitudDeCredito(ICliente cliente, double montoSolicitado, int plazoMes, IPropiedad propiedad);
}
