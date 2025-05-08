package com.models;

public class ProductoTradicional extends Producto{
    public ProductoTradicional(int cantidad, double precio) {
        super(cantidad, precio);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio()*0.1;
    }
}
