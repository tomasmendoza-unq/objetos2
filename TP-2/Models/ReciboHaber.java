package Models;

import java.time.LocalDate;
import java.util.Set;

public class ReciboHaber {

    private String nombreEmpleado;

    private String direccion;

    private Set<Concepto> conceptos;

    private LocalDate emision;

    private Double sueldoBruto;

    private Double sueldoNeto;

    public ReciboHaber(String nombreEmpleado, String direccion, Set<Concepto> conceptos, LocalDate emision, Double sueldoBruto, Double sueldoNeto) {
        this.nombreEmpleado = nombreEmpleado;
        this.direccion = direccion;
        this.conceptos = conceptos;
        this.emision = emision;
        this.sueldoBruto = sueldoBruto;
        this.sueldoNeto = sueldoNeto;
    }

    public Set<Concepto> getConceptos() {
        return conceptos;
    }
}
