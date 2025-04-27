package Models;

import Enums.EstadoCivil;

import java.time.LocalDate;
import java.util.Set;

public abstract class EmpleadoAportador extends Empleado{
    public EmpleadoAportador(String nombre, String direccion, LocalDate fechaDeNacimiento, EstadoCivil estado, Double sueldoBasico) {
        super(nombre, direccion, fechaDeNacimiento, estado, sueldoBasico);
    }
    protected Double retencionObraSocial() {
        return this.calcularPorcentajeSueldoBruto(10.0) + this.retencionAdicional();
    }

    protected Double calcularPorcentajeSueldoBruto(Double porcentaje){
        return (this.sueldoBruto() * porcentaje) / 100;
    }

    @Override
    public Double retenciones() {
        return retencionObraSocial()+retencionAdicional()+retencionJubilacion();
    }

    public abstract Double retencionJubilacion();
    public abstract Double retencionAdicional();
    protected abstract Double adicionales();
    public abstract Set<Concepto> conceptos();
}
