/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.diegolpl.clase4.ejercicio1;

/**
 *
 * @author d13g0
 */
public class ej1a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1 = 42;
        int num2 = 21;
        int num3 = 37;
        char letra = 'd';
        
        if(letra == 'a'){
            int[] vector = {num1,num2,num3};
            
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
            
            for(int i : vector){
                System.out.println(i);
            }    
        }else if(letra == 'd'){
            int[] vector = {num1,num2,num3};
            
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
            
            for(int i : vector){
                System.out.println(i);
            } 
        }else{
            System.out.println("Tipo de orden incorrecto");
        }
    }
    
}
