package com.modules.impls;

import com.modules.IBanco;
import com.modules.ICliente;
import com.modules.IPropiedad;

import java.util.ArrayList;
import java.util.List;

public class Cliente implements ICliente {

    private String nombre;
    private String apellido;
    private String direccion;
    private int edad;
    private IBanco banco;
    private double sueldoNetoM;
    private List<IPropiedad> propiedades;


    public Cliente(String nombre, String apellido, String direccion, int edad, IBanco banco, double sueldoNetoM) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
        this.banco = banco;
        this.sueldoNetoM = sueldoNetoM;
        this.propiedades = new ArrayList<>();
    }

    @Override
    public double getSueldoNetoAnual() {
        return this.sueldoNetoM*12;
    }

    @Override
    public void solicitarCreditoPersonal(double montoSolicitado, int plazoMes) {
        this.banco.solicitudDeCreditoPersonal(this, montoSolicitado, plazoMes);
    }

    @Override
    public void solicitarCreditoHipotecario(double montoSolicitado, int plazoMes, int nroPropiedad) {
        this.banco.solicitudDeCreditoHipotecario(this, montoSolicitado, plazoMes, propiedades.get(nroPropiedad));
    }

    @Override
    public void agregarPropiedad(IPropiedad propiedad) {
        propiedades.add(propiedad);
    }

    @Override
    public double getSueldoNetoMensual() {
        return sueldoNetoM;
    }

    @Override
    public int getEdad() {
        return edad;
    }
}
