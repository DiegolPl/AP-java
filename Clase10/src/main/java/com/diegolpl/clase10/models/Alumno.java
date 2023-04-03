
package com.diegolpl.clase10.models;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Alumno {
    private String nombre;
    private String legajo;
    private Materia[] materiasAprobadas;

    public Alumno(String nombre, String legajo, Materia[] materiasAprobadas) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasAprobadas = materiasAprobadas;
    }
}
