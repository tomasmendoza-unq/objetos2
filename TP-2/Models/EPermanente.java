package Models;

import Enums.EstadoCivil;

import java.time.LocalDate;
import java.util.Set;

public class EPermanente extends EmpleadoAportador{

    private int cantHijos;

    private int antiguedad;

    public EPermanente(String nombre, String direccion, LocalDate fechaDeNacimiento, EstadoCivil estado, Double sueldoBasico, int cantHijos, int antiguedad) {
        super(nombre, direccion, fechaDeNacimiento, estado, sueldoBasico);
        this.cantHijos = cantHijos;
        this.antiguedad = antiguedad;
    }

    @Override
    public Double sueldoBruto() {
        return this.sueldoBasico + this.adicionales();
    }

    @Override
    public Set<Concepto> conceptos() {
        return Set.of();
    }

    @Override
    protected Double adicionales() {
        return this.adicionalXHijo() + this.estado.getBeneficioAdicional() + this.adicionalXAntiguedad();
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
