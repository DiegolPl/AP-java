
package com.diegolpl.clase7.models;

public class DescuentoFijo extends Descuento {

    @Override
    public double valorFinal(double valorInicial) {
        return valorInicial - this.getValorDesc();
    }
    
}
