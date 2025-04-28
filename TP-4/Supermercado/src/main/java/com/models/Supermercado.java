package com.models;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

    private String nombre;

    private String direccion;

    private List<IProducto> productos;

    public Supermercado(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.productos = new ArrayList<>();
    }


    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public int getCantidadDeProductos() {
        return productos.size();
    }

    public Double getPrecioTotal() {
        return productos.stream().mapToDouble(IProducto::getPrecio).sum();
    }
}
