package Models;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

public class ReciboHaberes {

    private String nombreEmpleado;

    private String direccion;

    private Set<Concepto> conceptos;

    private LocalDate emision;

    private Double sueldoBruto;

    private Double sueldoNeto;

    public ReciboHaberes(String nombreEmpleado, String direccion, Set<Concepto> conceptos, LocalDate emision, Double sueldoBruto, Double sueldoNeto) {
        this.nombreEmpleado = nombreEmpleado;
        this.direccion = direccion;
        this.conceptos = conceptos;
        this.emision = emision;
        this.sueldoBruto = sueldoBruto;
        this.sueldoNeto = sueldoNeto;
    }
}
