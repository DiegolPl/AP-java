
package com.diegolpl.clase10.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Inscripcion {
    private Alumno alumno;
    private Materia materia;
    private LocalDate fecha;
//    private LocalDate fecha = LocalDate.of(2022, Month.FEBRUARY, 18);

    public Inscripcion(Alumno alumno, Materia materia, LocalDate fecha) {
        this.alumno = alumno;
        this.materia = materia;
        this.fecha = fecha;
    }
    
    public boolean aprobada(){
        return this.materia.puedeCursar(this.alumno);
    }
}
