/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diegolpl.clase3.ejercicio1;

import java.util.Arrays;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author d13g0
 */

@Getter @Setter
public class OrdenarNumeros {
    private int num1;
    private int num2;
    private int num3;
    private String orden;

    public OrdenarNumeros(int num1, int num2, int num3, String orden) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.orden = orden;
    }
    
    public int[] ordenarLosNumeros(){
        if(getOrden().toLowerCase() == "ascendente"){
            int[] vector = {getNum1(),getNum2(),getNum3()};
            
            boolean swapped = true;
            int temporal = 0;
            
            while(swapped){
                if(swapped){
                    swapped = false;
                }
                
                for(int i = 0; i < vector.length - 1; i++){
                    if(vector[i] > vector[i+1]){
                        temporal = vector[i+1];
                        vector[i+1]= vector[i];
                        vector[i] = temporal;
                        
                        swapped = true;
                    }
                }
            }
            return vector;
        }else if(getOrden().toLowerCase() == "descendente"){
            int[] vector = {getNum1(),getNum2(),getNum3()};
            
            boolean swapped = true;
            int temporal = 0;
            
            while(swapped){
                if(swapped){
                    swapped = false;
                }
                
                for(int i = 0; i < vector.length - 1; i++){
                    if(vector[i] < vector[i+1]){
                        temporal = vector[i+1];
                        vector[i+1]= vector[i];
                        vector[i] = temporal;
                        
                        swapped = true;
                    }
                }
            }
            return vector;
        }else{
            System.out.println("Tipo de orden incorrecto");
            return new int[0];
        }
    }
    
}
