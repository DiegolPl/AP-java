
package com.diegolpl.clase5.models;

public abstract class Descuento {
    private float valor;
    
    public float getValorDesc(){
        return this.valor;
    }
    
    public void setValorDesc(float valor){
        this.valor = valor;
    }

    public Descuento() {
    }
    
    public abstract float valorFinal(float valorInicial);    
    
}
