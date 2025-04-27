package Service;

import Models.IEmpleado;

import java.util.Set;

public interface IServiceLiquidacion {
    public Double montoTotalRetenciones(Set<IEmpleado> empleados);

    public Double montoTotalSueldosBrutos(Set<IEmpleado> empleados);

    public Double montoTotalSueldosNetos(Set<IEmpleado> empleados);

    public void liquidarSueldos(Set<IEmpleado> empleados);
}
