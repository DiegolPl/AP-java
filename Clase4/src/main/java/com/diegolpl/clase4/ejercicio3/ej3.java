/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.diegolpl.clase4.ejercicio3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author d13g0
 */
public class ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        char operacion = 'c';
        int valor_desplazamiento = 3;
        Path archivo_entrada = Paths.get("C:\\Users\\d13g0\\OneDrive\\Escritorio\\Carpetas - Estudio\\AP - Intro JAVA - UTN\\AP-java\\Clase4\\src\\main\\java\\com\\diegolpl\\clase4\\ejercicio3\\texto_entrada.txt");
        Path archivo_salida = Paths.get("C:\\Users\\d13g0\\OneDrive\\Escritorio\\Carpetas - Estudio\\AP - Intro JAVA - UTN\\AP-java\\Clase4\\src\\main\\java\\com\\diegolpl\\clase4\\ejercicio3\\texto_salida.txt");
        
        if(operacion == 'c'){
            
            for(String linea : Files.readAllLines(archivo_entrada)){
                Files.writeString(archivo_salida, codificarTexto(linea, valor_desplazamiento));
            }
            
            System.out.println("Listo! Texto codificado!");
            
        }else if(operacion == 'd'){
            
            for(String linea : Files.readAllLines(archivo_entrada)){
                Files.writeString(archivo_salida, decodificarTexto(linea, valor_desplazamiento));
            }
            
            System.out.println("Listo! Texto decodificado!");
        }else{
            System.out.println("Operacion incorrecta!");
        }
    }
    
    public static String codificarTexto(String texto, int cantidad_desplazamiento){
        char[] arrayTexto = texto.toLowerCase().toCharArray();
        String nuevoTexto = "";
        String abecedario = "abcdefghijklmnopqrstuvwxyz .!,";
        
        for(char letra : arrayTexto){
            int indiceLetra = abecedario.indexOf(letra);
            int cantidadCaracteresAbecedario = abecedario.toCharArray().length;
            int indiceNuevaLetra = indiceLetra + cantidad_desplazamiento;
            
            while(indiceNuevaLetra >= cantidadCaracteresAbecedario){
                indiceNuevaLetra -= cantidadCaracteresAbecedario;
            }
            
            nuevoTexto += abecedario.toCharArray()[indiceNuevaLetra];
        }
        
        return nuevoTexto;
    }
     
    public static String decodificarTexto(String texto, int cantidad_desplazamiento){
        char[] arrayTexto = texto.toCharArray();
        String nuevoTexto = "";
        String abecedario = "abcdefghijklmnopqrstuvwxyz .!,";
        
        for(char letra : arrayTexto){
            int indiceLetra = abecedario.indexOf(letra);
            int cantidadCaracteresAbecedario = abecedario.toCharArray().length;
            int indiceNuevaLetra = indiceLetra - cantidad_desplazamiento;
            
            while(indiceNuevaLetra < 0){
                indiceNuevaLetra += cantidadCaracteresAbecedario;
            }
            
            nuevoTexto += abecedario.toCharArray()[indiceNuevaLetra];
        }
        
        return nuevoTexto;
    }
}
