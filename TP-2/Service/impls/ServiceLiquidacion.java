package Service.impls;

import Models.IEmpleado;
import Service.IServiceLiquidacion;
import Service.IServiceRecibo;

import java.util.Set;

public class ServiceLiquidacion implements IServiceLiquidacion {
    private static ServiceLiquidacion instance;
    private final IServiceRecibo serviceRecibo;

    private ServiceLiquidacion (IServiceRecibo serviceRecibo){
        this.serviceRecibo = serviceRecibo;
    }

    public static ServiceLiquidacion getInstance(IServiceRecibo serviceRecibo) {
        if (instance == null) {
            instance = new ServiceLiquidacion(serviceRecibo);
        }
        return instance;
    }

    @Override
    public Double montoTotalRetenciones(Set<IEmpleado> empleados) {
        return empleados.stream().mapToDouble(IEmpleado::sueldoNeto).sum();
    }

    @Override
    public Double montoTotalSueldosBrutos(Set<IEmpleado> empleados) {
        return empleados.stream().mapToDouble(IEmpleado::sueldoBruto).sum();
    }

    @Override
    public Double montoTotalSueldosNetos(Set<IEmpleado> empleados) {
        return empleados.stream().mapToDouble(IEmpleado::sueldoNeto).sum();
    }

    @Override
    public void liquidarSueldos(Set<IEmpleado> empleados) {
        for (IEmpleado empleado : empleados ){
            this.liquidarSueldo(empleado);
        }
    }

    private void liquidarSueldo(IEmpleado empleado) {
        empleado.addHaber(serviceRecibo.createHaber(empleado));
    }


}
