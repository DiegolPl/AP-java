/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diegolpl.clase3.ejercicio1;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author d13g0
 */

@Getter @Setter
public class SumarVector {
    private int[] numeros;
    private int valorMinimo;

    public SumarVector(int[] numeros, int Minimo) {
        this.numeros = numeros;
        this.valorMinimo = Minimo;
    }
    
    public int sumarValores(){
        int resultado = 0;
        for(int nro : getNumeros()){
            if(nro > getValorMinimo()){
                resultado += nro;
            }
        }
        
        return resultado;
    }
}
