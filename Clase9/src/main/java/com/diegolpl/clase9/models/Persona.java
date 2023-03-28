
package com.diegolpl.clase9.models;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Persona {
    private String nombre;
    private String apellido;
    private String fecha_nacimiento;

    public Persona() {
    }
}