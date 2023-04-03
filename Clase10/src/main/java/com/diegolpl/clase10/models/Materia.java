
package com.diegolpl.clase10.models;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Materia {
    private String nombre;
    private Materia[] correlativas;

    public Materia(String nombre, Materia[] correlativas) {
        this.nombre = nombre;
        this.correlativas = correlativas;
    }
    
    public boolean puedeCursar(Alumno alumno){
       boolean puedeCursar = false;
       int cantidadCoincidencias = 0;
       
       for(Materia materia : this.correlativas){
           for(Materia materiaAlumno : alumno.getMateriasAprobadas()){
               if(materia.getNombre() == materiaAlumno.getNombre()){
                   cantidadCoincidencias += 1;
               }
           }
       }
       
       if(cantidadCoincidencias == this.correlativas.length){
           puedeCursar = true;
       }
       
       return puedeCursar;
    }
}
