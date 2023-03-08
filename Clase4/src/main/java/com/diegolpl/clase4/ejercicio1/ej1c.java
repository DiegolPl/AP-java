/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.diegolpl.clase4.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author d13g0
 */
public class ej1c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1 = 26;
        int num2 = 0;
        int num3 = 3;
        char letra = ' ';
        
        Scanner sc = new Scanner(System.in);
        
        if(num1 == 0){
            System.out.println("Ingresa el 1er valor para ordenarlos luego: ");
            num1 = sc.nextInt();
        }else{
            System.out.println("Primer valor: " + num1);
        }
        
        if(num2 == 0){
            System.out.println("Ingresa el 2do valor para ordenarlos luego: ");
            num2 = sc.nextInt();
        }else{
            System.out.println("Segundo valor: " + num2);
        }
        
        if(num3 == 0){
            System.out.println("Ingresa el 3er valor para ordenarlos luego: ");
            num3 = sc.nextInt();
        }else{
            System.out.println("Tercer valor: " + num3);
        }
        
        if(letra == ' '){        
            System.out.println("Ahora ingresa la letra 'a' para ordenarlo de forma ascendente o 'd' para hacerlo de forma descendente: ");
            letra = sc.next().toCharArray()[0];
        }
        
        
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
