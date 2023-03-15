
package com.diegolpl.clase5.models;


public class ItemCarrito {
    private int cantidad;
    private Producto producto;

    public ItemCarrito(int cantidad, Producto producto) throws Exception {
        
        if(cantidad > producto.getCantidad_maxima()){
            throw new Exception("Cantidad ingresada superior a cantidad maxima por producto");
        }else{
            this.cantidad = cantidad;
            this.producto = producto;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
}
