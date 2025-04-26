package Models;

import Enums.EstadoCivil;

import java.time.LocalDate;
import java.util.Set;

public abstract class Empleado {

   protected String nombre;

   protected String direccion;

   protected LocalDate fechaDeNacimiento;

   protected EstadoCivil estado;

   protected Set<ReciboHaberes> recibos;

   protected Double sueldoBasico;


   public Empleado(String nombre, String direccion, LocalDate fechaDeNacimiento, EstadoCivil estado, Double sueldoBasico) {
      this.nombre = nombre;
      this.direccion = direccion;
      this.fechaDeNacimiento = fechaDeNacimiento;
      this.estado = estado;
      this.sueldoBasico = sueldoBasico;
   }

   public Double sueldoBruto(){
      return sueldoBasico + this.adicionales();
   }

   protected abstract Double adicionales();

   protected Double retenciones(){
      return this.retencionObraSocial() + this.retencionJubilacion();
   }

   public abstract Double retencionJubilacion();

   protected Double retencionObraSocial() {
      return this.calcularPorcentajeSueldoBruto(10.0) + this.retencionAdicional();
   }

   public abstract Double retencionAdicional();


   public Double sueldoNeto(){
      return this.sueldoBruto() - this.retenciones();
   }

   public int edad(){
      return LocalDate.now().getYear() - fechaDeNacimiento.getYear();
   }

   protected Double calcularPorcentajeSueldoBruto(Double porcentaje){
      return (this.sueldoBruto() * porcentaje) / 100;
   }

   public String getNombre() {
      return nombre;
   }

   public String getDireccion() {
      return direccion;
   }
}
