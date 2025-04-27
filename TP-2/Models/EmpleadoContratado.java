package Models;

import Enums.EstadoCivil;
import Service.impls.ConceptoFactory;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class EmpleadoContratado extends Empleado{

    private int numeroDeContrato;

    private String medioDePago;

    public EmpleadoContratado(String nombre, String direccion, LocalDate fechaDeNacimiento, EstadoCivil estado, Double sueldoBasico, int numeroDeContrato, String medioDePago) {
        super(nombre, direccion, fechaDeNacimiento, estado, sueldoBasico);
        this.numeroDeContrato = numeroDeContrato;
        this.medioDePago = medioDePago;
    }

    @Override
    public Double sueldoBruto() {
        return sueldoBasico;
    }

    @Override
    public Double retenciones() {
        return 50.0;
    }

    @Override
    public Set<Concepto> conceptos(ConceptoFactory conceptoFactory) {
        Set<Concepto> conceptos = new HashSet<>();

        conceptos.add(conceptoFactory.createConcepto("Gastos Administrativos Contractuales", this.retenciones()));


        return conceptos;
    }


}
