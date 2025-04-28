package com.models;

public class ProductoPrimeraNecesidad extends Producto{

    private double descuento;

    public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado, double descuento) {
        super(nombre, precio, precioCuidado);
        this.descuento = descuento;
    }

    @Override
    public double getPrecio() {
        return super.getPrecio()*descuento;
    }
}
