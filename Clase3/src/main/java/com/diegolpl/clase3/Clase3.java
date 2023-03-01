package com.diegolpl.clase3;

import com.diegolpl.clase3.ejercicio1.ContarLetras;
import com.diegolpl.clase3.ejercicio1.OrdenarNumeros;
import java.util.Arrays;

/**
 *
 * @author d13g0
 */
public class Clase3 {

    public static void main(String[] args) {
        
    /*  1) Utilizando solo tipos primitivos, String (solo usar método length), vectores, iteraciones simples y 
        condicionales, genere una clase por ejercicio que posea los siguientes métodos:
        
        a. Dado un String y una letra, que cuente la cantidad de apariciones de la letra en el String
        b. Dados 3 números y un orden (ascendente o decreciente) que ordene los mismos y los retorne en 
           un vector de 3
        c. Dado un vector de números, y un número X, que sume todos los números > X y retorne el resultado
    */        

        // 1.a
        ContarLetras contadorDeLetras = new ContarLetras("Hola rolando, como estas? espero que bien", 'o');
        System.out.println("Cantidad de letras: " + contadorDeLetras.cantidadDeLetras());
        
        //1.b
        OrdenarNumeros ordenadorDeNumeros = new OrdenarNumeros(5,1,3,"ascendente");
        System.out.println(Arrays.toString(ordenadorDeNumeros.ordenarLosNumeros())); 
        
        //1.c
        
    }
}
