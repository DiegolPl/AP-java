
package com.diegolpl.clase5;

import com.diegolpl.clase5.models.Carrito;
import com.diegolpl.clase5.models.ItemCarrito;
import com.diegolpl.clase5.models.Producto;

public class Clase5 {

    public static void main(String[] args) throws Exception {
        Carrito mi_carrito = new Carrito();
        
        ItemCarrito item1 = new ItemCarrito(1, new Producto("Jabón en polvo",40.0));
        ItemCarrito item2 = new ItemCarrito(3, new Producto("Esponja",10.0));
        ItemCarrito item3 = new ItemCarrito(2, new Producto("Chocolate",100.0));
        
        mi_carrito.agregar_item_carrito(item1);
        mi_carrito.agregar_item_carrito(item2);
        mi_carrito.agregar_item_carrito(item3);
        
        System.out.println(mi_carrito.precio());
    }
}
