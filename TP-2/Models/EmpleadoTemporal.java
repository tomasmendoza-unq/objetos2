package Models;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import Enums.EstadoCivil;
import Service.impls.ConceptoFactory;

public class EmpleadoTemporal extends EmpleadoAportador {
    private Date vencimientoContrato;

    private int cantHsExtras;

    public EmpleadoTemporal(String nombre, String direccion, LocalDate fechaDeNacimiento, EstadoCivil estado, Double sueldoBasico, int cantHsExtras, Date vencimientoContrato) {
        super(nombre, direccion, fechaDeNacimiento, estado, sueldoBasico);
        this.cantHsExtras = cantHsExtras;
        this.vencimientoContrato = vencimientoContrato;
    }

    @Override
    public Double sueldoBruto() {
        return this.sueldoBasico + adicionales();
    }


    @Override
    protected Double adicionales() {
        return this.adicionalXHs(40D);
    }

    @Override
    public Set<Concepto> conceptos(ConceptoFactory conceptoFactory) {
        Set<Concepto> conceptos = new HashSet<>();

        conceptos.add(conceptoFactory.createConcepto("Retencion jubilatoria", -this.retencionJubilacion()));
        conceptos.add(conceptoFactory.createConcepto("Retencion adicional", -this.retencionAdicional()));
        conceptos.add(conceptoFactory.createConcepto("Retencion obra social", -this.retencionObraSocial()));
        conceptos.add(conceptoFactory.createConcepto("AdicionalXHs", this.adicionales()));

        return conceptos;
    }


    private Double adicionalXHs(double valorHora) {
        return valorHora*cantHsExtras;
    }

    @Override
    public Double retencionJubilacion() {
        return this.calcularPorcentajeSueldoBruto(10D) + this.adicionalXHs(5D);
    }

    @Override
    public Double retencionAdicional() {
        return this.edad()>50 ? 25D : 0D;
    }


}
