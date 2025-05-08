package com.models;

public class Producto implements IProducto{

    private double precio;

    private int cantidad;

    public Producto(int cantidad, double precio) {
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void descontarStock() {
        this.validarSiPuedeDescontar();
        this.cantidad--;

    }

    private void validarSiPuedeDescontar() {
        if(this.cantidad <=0) throw new SinStockException("no hay stock");
    }


}
