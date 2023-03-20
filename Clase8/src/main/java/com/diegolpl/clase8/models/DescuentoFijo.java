
package com.diegolpl.clase8.models;

public class DescuentoFijo extends Descuento {

    @Override
    public double valorFinal(double valorInicial) {
        return valorInicial - this.getValorDesc();
    }
    
    @Override
    public double valorDescuento(double valorInicial) {
        return this.getValorDesc();
    }

    
}
