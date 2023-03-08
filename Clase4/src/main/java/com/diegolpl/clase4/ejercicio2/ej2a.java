/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.diegolpl.clase4.ejercicio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author d13g0
 */
public class ej2a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa la ruta del archivo con la lista de numeros: ");
        String ruta = sc.nextLine();
        Path archivo = Paths.get(ruta);
        
        System.out.println("Ingresa la operacion a realizar: 's' para suma o 'm' para multiplicar. ");
        char operacion = sc.next().toCharArray()[0];
        
        String lista[] = {};
        int total = 0;
        boolean flag = true;
        
        for (String linea : Files.readAllLines(archivo)) {
            if(operacion != 's' && operacion != 'm'){
                break;
            }
            
            lista = linea.split(",");
            for (String numero : lista) {
                if(operacion == 's'){
                    total += Integer.parseInt(numero);
                }
                if(operacion == 'm'){
                    if(flag){
                        total = 1;
                        flag = false;
                    }
                    total *= Integer.parseInt(numero);
                }
            }   
        }
        
        if(operacion == 's'){
            System.out.println("La suma de todos los numeros de la lista es igual a: " + total);
        }else if(operacion == 'm'){
            System.out.println("La multiplicacion de todos los numeros de la lista es igual a: " + total);
        }else{
            System.out.println("No es una operacion valida");
        }
        
        
    }
    
}
