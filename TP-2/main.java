import Enums.EstadoCivil;
import Models.*;
import Service.IServiceLiquidacion;
import Service.IServiceRecibo;
import Service.impls.ServiceLiquidacion;
import Service.impls.ServiceRecibo;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class main {

    public static void main(String[] args) {

        EmpleadoPermanente jorgito = new EmpleadoPermanente("Jorgito", "2321", LocalDate.of(2000, 10, 15), EstadoCivil.CASADO, 3000.00, 2, 12);
        EmpleadoTemporal pepitoTemporal = new EmpleadoTemporal(
                "Pepito",
                "Calle Falsa 123",
                LocalDate.of(1995, 5, 20),
                EstadoCivil.SOLTERO,
                2500.00,
                10,
                new Date()
        );

        EmpleadoContratado juanContratado = new EmpleadoContratado(
                "Juancho",
                "Avenida Siempre Viva 742",
                LocalDate.of(1980, 3, 10),
                EstadoCivil.CASADO,
                4000.00,
                12345,
                "Transferencia Bancaria"
        );

        IServiceRecibo serviceRecibo = new ServiceRecibo();
        IServiceLiquidacion serviceLiquidacion = ServiceLiquidacion.getInstance(serviceRecibo);

        Empresa empresa = new Empresa("Marolio", "240213023", serviceLiquidacion);
        empresa.contratarEmpleado(jorgito);
        empresa.contratarEmpleado(juanContratado);
        empresa.contratarEmpleado(pepitoTemporal);
        System.out.println("Liquidacion total: " + empresa.montoTotalSueldosNetos());

        empresa.liquidacionDeSueldos();


        for (IEmpleado empleado : empresa.getEmpleados()) {
            System.out.println("\nEmpleado: " + empleado.getNombre());
            System.out.println("Sueldo Bruto: " + empleado.sueldoBruto());
            System.out.println("Sueldo Neto: " + empleado.sueldoNeto());
            System.out.println("Conceptos:");
            for (ReciboHaber recibo : empleado.getRecibos()) {
                for (Concepto concepto : recibo.getConceptos()) {
                    System.out.println(" - " + concepto.getDescripcion() + ": " + concepto.getMonto());
                }
            }
        }

    }

}
