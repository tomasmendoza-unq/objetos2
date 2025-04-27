package Models;

import Enums.EstadoCivil;
import Service.impls.ConceptoFactory;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class EmpleadoPermanente extends EmpleadoAportador{

    private int cantHijos;

    private int antiguedad;

    public EmpleadoPermanente(String nombre, String direccion, LocalDate fechaDeNacimiento, EstadoCivil estado, Double sueldoBasico, int cantHijos, int antiguedad) {
        super(nombre, direccion, fechaDeNacimiento, estado, sueldoBasico);
        this.cantHijos = cantHijos;
        this.antiguedad = antiguedad;
    }

    @Override
    public Double sueldoBruto() {
        return this.sueldoBasico + this.adicionales();
    }


    @Override
    protected Double adicionales() {
        return this.adicionalXHijo() + this.estado.getBeneficioAdicional() + this.adicionalXAntiguedad();
    }

    @Override
    public Set<Concepto> conceptos(ConceptoFactory conceptoFactory) {
        Set<Concepto> conceptos = new HashSet<>();

        conceptos.add(conceptoFactory.createConcepto("Retencion jubilatoria", -this.retencionJubilacion()));
        conceptos.add(conceptoFactory.createConcepto("Retencion obra social", -this.retencionObraSocial()));
        conceptos.add(conceptoFactory.createConcepto("AdicionalXHijo", this.adicionalXHijo()));
        conceptos.add(conceptoFactory.createConcepto("Beneficio por estado", this.estado.getBeneficioAdicional()));
        conceptos.add(conceptoFactory.createConcepto("Antiguedad", this.adicionalXAntiguedad()));

        return conceptos;
    }

    private Double adicionalXHijo() {
        return calculoXHijo(150D) ;
    }

    private Double adicionalXAntiguedad() {
        return 50D * antiguedad;
    }

    @Override
    public Double retencionJubilacion() {
        return calcularPorcentajeSueldoBruto(15D);
    }

    @Override
    public Double retencionAdicional() {
        return calculoXHijo(20D);
    }


    private Double calculoXHijo(Double monto){
        return monto * cantHijos;
    }



}
