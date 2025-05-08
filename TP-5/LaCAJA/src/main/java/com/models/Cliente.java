package com.models;

public class Cliente {

    private ICarrito carrito;

    public void agregarProducto(IProducto producto){
        carrito.agregarProducto(producto);
    }
}
