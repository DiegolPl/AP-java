
package com.diegolpl.clase5.models;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Producto {
    private String nombre;
    private Double precio;
    private int cantidad_maxima = 3;

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
}
