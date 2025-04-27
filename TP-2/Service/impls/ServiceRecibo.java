package Service.impls;

import Models.Concepto;
import Models.IEmpleado;
import Models.ReciboHaber;
import Service.IServiceRecibo;


import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class ServiceRecibo implements IServiceRecibo {


    @Override
    public ReciboHaber createHaber(IEmpleado empleado) {
        Set<Concepto> conceptos = empleado.conceptos(new ConceptoFactory());



        return new ReciboHaber(empleado.getNombre(), empleado.getDireccion(), conceptos, LocalDate.now(), empleado.sueldoBruto(), empleado.sueldoNeto());
    }
}
