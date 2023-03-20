
package com.diegolpl.clase8.models;

public class DescuentoPorcentajeConTope extends Descuento {

    @Override
    public double valorFinal(double valorInicial) {
        if(valorInicial * this.getValorDesc() > this.getTope()){
            return valorInicial - this.getTope();
        }else{
            return valorInicial - (valorInicial * this.getValorDesc());
        }
    }
    
    @Override
    public double valorDescuento(double valorInicial) {
        if(valorInicial * this.getValorDesc() > this.getTope()){
            return this.getTope();
        }else{
            return valorInicial * this.getValorDesc();
        }
    }
    
}
