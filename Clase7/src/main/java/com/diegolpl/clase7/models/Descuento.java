
package com.diegolpl.clase7.models;

public abstract class Descuento {
    private double valor;
    private double tope;
    
    public double getValorDesc(){
        return this.valor;
    }
    
    public void setValorDesc(double valor){
        this.valor = valor;
    }

    public double getTope() {
        return tope;
    }

    public void setTope(double tope) {
        this.tope = tope;
    }

    public Descuento() {
    }
    
    public abstract double valorFinal(double valorInicial);    
    
}
