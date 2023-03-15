
package com.diegolpl.clase5.models;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<ItemCarrito> mi_carrito; 

    public Carrito() {
        this.mi_carrito = new ArrayList<ItemCarrito>();
    }

    public ArrayList<ItemCarrito> getMi_carrito() {
        return mi_carrito;
    }

    public void setMi_carrito(ArrayList<ItemCarrito> mi_carrito) {
        this.mi_carrito = mi_carrito;
    }
    
    public void agregar_item_carrito(ItemCarrito producto){
        this.getMi_carrito().add(producto);
    }
    
    public int precio(){
        int total = 0;
        
        for(ItemCarrito item : this.getMi_carrito()){
            total += item.getCantidad() * item.getProducto().getPrecio();
        }
        
        return total;
    }
}
