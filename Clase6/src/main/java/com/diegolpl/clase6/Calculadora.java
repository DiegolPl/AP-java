
package com.diegolpl.clase6;


public class Calculadora {
     private double resultado;

    public Calculadora() {
    }
     
    public double sumar(double unNumero, double otroNumero){
        this.resultado = unNumero + otroNumero;
        return this.resultado;
    }
     
    public double restar(double unNumero, double otroNumero){
        this.resultado = unNumero - otroNumero;
        return this.resultado;
    }
     
    public double multiplicar(double unNumero, double otroNumero){
        this.resultado = unNumero * otroNumero;
        return this.resultado;
    }
     
    public double dividir(double unNumero, double otroNumero){
        this.resultado = unNumero / otroNumero;
        return this.resultado;
    }
}
