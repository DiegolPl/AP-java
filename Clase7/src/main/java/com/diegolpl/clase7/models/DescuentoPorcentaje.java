
package com.diegolpl.clase7.models;

public class DescuentoPorcentaje extends Descuento {

    @Override
    public double valorFinal(double valorInicial) {
        return valorInicial - (valorInicial * this.getValorDesc());
    }
    
}
