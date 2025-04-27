package Models;

import Enums.EstadoCivil;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public abstract class Empleado implements IEmpleado{

   protected String nombre;

   protected String direccion;

   protected LocalDate fechaDeNacimiento;

   protected EstadoCivil estado;

   protected Set<ReciboHaber> recibos;

   protected Double sueldoBasico;


   public Empleado(String nombre, String direccion, LocalDate fechaDeNacimiento, EstadoCivil estado, Double sueldoBasico) {
      this.nombre = nombre;
      this.direccion = direccion;
      this.fechaDeNacimiento = fechaDeNacimiento;
      this.estado = estado;
      this.sueldoBasico = sueldoBasico;
      this.recibos = new HashSet<>();
   }

   public Double sueldoNeto(){
      return this.sueldoBruto() - this.retenciones();
   }

   public abstract Double sueldoBruto();


   public abstract Double retenciones();

   public void addHaber(ReciboHaber haber){
      recibos.add(haber);
   };

   public int edad(){
      return LocalDate.now().getYear() - fechaDeNacimiento.getYear();
   }

   @Override
   public Set<ReciboHaber> getRecibos() {
      return recibos;
   }

   public String getNombre() {
      return nombre;
   }

   public String getDireccion() {
      return direccion;
   }
}
