
package com.diegolpl.clase7.models;

public class DescuentoPorcentajeConTope extends Descuento {

    @Override
    public double valorFinal(double valorInicial) {
        if(valorInicial * this.getValorDesc() > this.getTope()){
            return valorInicial - this.getTope();
        }else{
            return valorInicial - (valorInicial * this.getValorDesc());
        }
    }
    
}
