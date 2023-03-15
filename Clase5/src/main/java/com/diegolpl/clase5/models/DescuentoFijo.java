
package com.diegolpl.clase5.models;

public class DescuentoFijo extends Descuento {

    @Override
    public float valorFinal(float valorInicial) {
        return valorInicial - this.getValorDesc();
    }
    
}
