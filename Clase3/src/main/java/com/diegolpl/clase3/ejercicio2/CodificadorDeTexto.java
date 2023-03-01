package com.diegolpl.clase3.ejercicio2;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author d13g0
 */

@Getter @Setter
public class CodificadorDeTexto {
    private String abecedario = "abcdefghijklmnñopqrstuvwxyz ";
    private String texto;
    private int cantidadDesplazamiento;

    public CodificadorDeTexto(String texto, int cantidadDesplazamiento) {
        this.texto = texto;
        this.cantidadDesplazamiento = cantidadDesplazamiento;
    }
    
    public String codificarTexto(){
        char[] arrayTexto = getTexto().toCharArray();
        String nuevoTexto = "";
        
        for(char letra : arrayTexto){
            int indiceLetra = getAbecedario().indexOf(letra);
            int cantidadCaracteresAbecedario = getAbecedario().toCharArray().length;
            int indiceNuevaLetra = indiceLetra + getCantidadDesplazamiento();
            
            while(indiceNuevaLetra >= cantidadCaracteresAbecedario){
                indiceNuevaLetra -= cantidadCaracteresAbecedario;
            }
            
//            if(indiceNuevaLetra >= cantidadCaracteresAbecedario){
//                
//            }
            
            nuevoTexto += getAbecedario().toCharArray()[indiceNuevaLetra];
        }
        
        return nuevoTexto;
    }
    
}
