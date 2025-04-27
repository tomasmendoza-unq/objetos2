package Models;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

import Enums.EstadoCivil;

public class ETemporal extends EmpleadoAportador {
    private Date vencimientoContrato;

    private int cantHsExtras;

    public ETemporal(String nombre, String direccion, LocalDate fechaDeNacimiento, EstadoCivil estado, Double sueldoBasico, int cantHsExtras, Date vencimientoContrato) {
        super(nombre, direccion, fechaDeNacimiento, estado, sueldoBasico);
        this.cantHsExtras = cantHsExtras;
        this.vencimientoContrato = vencimientoContrato;
    }

    @Override
    public Double sueldoBruto() {
        return this.sueldoBasico + adicionales();
    }

    @Override
    public Set<Concepto> conceptos() {
        return Set.of();
    }

    @Override
    protected Double adicionales() {
        return this.adicionalXHs(40D);
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
