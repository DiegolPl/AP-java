
package com.diegolpl.clase7.models;

public class Producto {
    private String nombre;
    private Double precio;
    private int cantidad_maxima = 3;

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public int getCantidad_maxima() {
        return cantidad_maxima;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setCantidad_maxima(int cantidad_maxima) {
        this.cantidad_maxima = cantidad_maxima;
    }
    
    
    
}
