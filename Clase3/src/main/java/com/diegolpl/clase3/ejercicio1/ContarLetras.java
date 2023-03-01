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
public class ContarLetras {
    private String palabra;
    private char caracter;

    public ContarLetras(String palabra, char caracter) {
        this.palabra = palabra;
        this.caracter = caracter;
    }
    
    public int cantidadDeLetras(){
        int count = 0;
        char[] arrayPalabra = this.palabra.toLowerCase().toCharArray();
        for(char letra : arrayPalabra){
            if(letra == getCaracter()){
                count++;
            }
        }
        return count;
    }
    
}
