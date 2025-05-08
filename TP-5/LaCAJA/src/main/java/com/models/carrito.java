package com.models;

import java.util.ArrayList;
import java.util.List;

public class carrito implements ICarrito{

    private List<IProducto> productoList;

    private double totalAPagar ;

    public carrito() {
        this.productoList = new ArrayList<>();
        this.totalAPagar = 0;
    }

    @Override
    public void agregarProducto(IProducto producto) {
        try {
            producto.descontarStock();
            totalAPagar += producto.getPrecio();
            productoList.add(producto);
        } catch (SinStockException e){
            System.out.println("no se pudo agregar el producto");
        }
    }
}
