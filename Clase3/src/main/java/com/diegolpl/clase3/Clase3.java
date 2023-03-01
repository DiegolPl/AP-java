package com.diegolpl.clase3;

import com.diegolpl.clase3.ejercicio1.ContarLetras;
import com.diegolpl.clase3.ejercicio1.OrdenarNumeros;
import com.diegolpl.clase3.ejercicio1.SumarVector;
import com.diegolpl.clase3.ejercicio2.CodificadorDeTexto;
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
        int[] vector = {4,5,2,6,1};
        SumarVector sumadorDeVector = new SumarVector(vector,4);
        System.out.println(sumadorDeVector.sumarValores());
        
    /*  2) Genere una clase que tenga los métodos para realizar la codificación y decodificación de un string, 
        dado un número de desplazamiento.
        
        Por ejemplo, con desplazo de 1: "hola que tal” -> “ipmbarvfaubm” siendo que h -> i
        Por ejemplo, con desplazo de 2: "hola que tal” -> “jqncbswgbvcn” siendo que h -> j
        
        En el ejemplo estoy usando este abecedario: "abcdefghijklmnñopqrstuvwxyz "
        
        Para este ejercicio puede usar todos los métodos de String, tanto de instancia (por ejemplo length) 
        como de clase, por ejemplo String.valueOf(arr) # donde arr es un char[]. 
        Tenga a mano los javadocs del mismo

    */
    
        CodificadorDeTexto codificador = new CodificadorDeTexto("hola que tal", 1);
        System.out.println(codificador.codificarTexto());
    }
}
