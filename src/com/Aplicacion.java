package com;

import com.clases.*;

public class Aplicacion {
    public static void main(String[] args) {

        TiendaElectronica tienda = new TiendaElectronica();

        Televisor tv = new Televisor("Televisor Samsung", 500.99, 10, 55, "4K");
        ComputadoraPortatil laptop = new ComputadoraPortatil("Laptop Dell", 899.99, 5, "Dell", 16, "SN12345");
        ProductoElectrodomestico microondas = new ProductoElectrodomestico("Microondas LG", 150.75, 7);

        tienda.agregarProducto(tv);
        tienda.agregarProducto(laptop);
        tienda.agregarProducto(microondas);

        System.out.println("Productos en inventario:");
        tienda.mostrarProductos();

        System.out.println("Realizando venta de Televisor Samsung:");
        tienda.realizarVenta("Televisor Samsung");

        System.out.println("Realizando venta de Laptop Dell:");
        tienda.realizarVenta("Laptop Dell");

        System.out.println("Productos después de las ventas:");
        tienda.mostrarProductos();
    }
}
