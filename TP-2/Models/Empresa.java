package Models;

import Service.IServiceLiquidacion;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Empresa {
    private String nombre;

    private String cuit;

    private Set<IEmpleado> empleados;

    private final IServiceLiquidacion serviceLiquidacion;


    public Empresa(String nombre, String cuit, IServiceLiquidacion serviceLiquidacion){
        this.nombre = nombre;
        this.cuit = cuit;
        this.serviceLiquidacion = serviceLiquidacion;
        this.empleados = new HashSet<>();
    }

    public void contratarEmpleado(IEmpleado empleado){
        empleados.add(empleado);
    }

    public Double montoTotalSueldosNetos(){
        return serviceLiquidacion.montoTotalSueldosNetos(empleados);
    }

    public Double montoTotalSueldosBrutos(){
        return serviceLiquidacion.montoTotalSueldosBrutos(empleados);
    }

    public Double montoTotalRetenciones(){
        return serviceLiquidacion.montoTotalRetenciones(empleados);
    }

    public void liquidacionDeSueldos(){
        serviceLiquidacion.liquidarSueldos(empleados);
    }

    public Set<IEmpleado> getEmpleados() {
        return empleados;
    }
}
