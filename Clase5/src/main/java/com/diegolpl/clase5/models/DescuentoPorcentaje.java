
package com.diegolpl.clase5.models;

public class DescuentoPorcentaje extends Descuento {

    @Override
    public float valorFinal(float valorInicial) {
        return valorInicial - (valorInicial * this.getValorDesc());
    }
    
}
