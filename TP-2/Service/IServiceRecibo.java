package Service;

import Models.IEmpleado;
import Models.ReciboHaber;

public interface IServiceRecibo {
    public ReciboHaber createHaber(IEmpleado empleado);
}
