package ar.edu.unq.poo2.tp3;

import java.time.LocalDate;

public class Persona {
    private String nombre;

    private LocalDate fechaNacimiento;

    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int edad(){
        return LocalDate.now().getYear() - fechaNacimiento.getYear();
    }

    public Boolean menorQue(Persona p1, Persona p2){
        return p1.edad()<p2.edad();
    }

}
