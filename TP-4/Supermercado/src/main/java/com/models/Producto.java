package com.models;

public class Producto implements IProducto {

    private String nombre;

    private double precio;

    private boolean precioCuidado;

    public Producto(String nombre, double precio, boolean precioCuidado) {
        this.nombre = nombre;
        this.precio = precio;
        this.precioCuidado = precioCuidado;
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.precioCuidado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esPrecioCuidado() {
        return precioCuidado;
    }

    public void aumentarPrecio(double aumento){
        this.precio += aumento;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
