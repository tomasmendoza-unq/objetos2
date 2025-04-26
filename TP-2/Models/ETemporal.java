package Models;

import java.time.LocalDate;
import java.util.Date;
import Enums.EstadoCivil;

public class ETemporal extends Empleado {
    private Date vencimientoContrato;

    private int cantHsExtras;

    public ETemporal(String nombre, String direccion, LocalDate fechaDeNacimiento, EstadoCivil estado, Double sueldoBasico, int cantHsExtras, Date vencimientoContrato) {
        super(nombre, direccion, fechaDeNacimiento, estado, sueldoBasico);
        this.cantHsExtras = cantHsExtras;
        this.vencimientoContrato = vencimientoContrato;
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
