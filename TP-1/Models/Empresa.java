package Models;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Empresa {
    private String nombre;

    private String cuit;

    private Set<Empleado> empleados;

    public Empresa(String nombre, String cuit, Set<Empleado> empleados){
        this.nombre = nombre;
        this.cuit = cuit;
        this.empleados = empleados;
    };

    public Empresa(String nombre, String cuit){
        this.nombre = nombre;
        this.cuit = cuit;
        this.empleados = new HashSet<>();
    }

    public Double montoTotalSueldosNetos(){
        return empleados.stream().mapToDouble(Empleado::sueldoNeto).sum();
    }

    public Double montoTotalSueldosBrutos(){
        return empleados.stream().mapToDouble(Empleado::sueldoBruto).sum();
    }

    public Double montoTotalRetenciones(){
        return empleados.stream().mapToDouble(Empleado::retenciones).sum();
    }

    public void liquidacionDeSueldos(){
        empleados.forEach(empleado -> {
            Concepto adicionalBruto = new Concepto("Adicional", empleado.adicionales());
            Concepto retencionJubilacion = new Concepto("Retencion Jubilacion", empleado.retencionJubilacion());
            Concepto retencionObraSocial = new Concepto("Retencion obra social", empleado.retencionObraSocial());
            Concepto retencionAdicional = new Concepto("Retencion adicional", empleado.retencionAdicional());

            Set<Concepto> conceptos = new HashSet<>();

            conceptos.add(adicionalBruto);
            conceptos.add(retencionJubilacion);
            conceptos.add(retencionObraSocial);
            conceptos.add(retencionAdicional);

            ReciboHaberes reciboHaberes = new ReciboHaberes(empleado.getNombre(), empleado.getDireccion(), conceptos, LocalDate.now() ,  empleado.sueldoNeto(), empleado.sueldoBruto());
        });
    }
}
