
package com.diegolpl.clase10;

import com.diegolpl.clase10.models.Materia;

public class Clase10 {

    public static void main(String[] args) {
        Materia programacion1 = new Materia("Programacion I", new Materia[0]);
        Materia programacion2 = new Materia("Programacion II", new Materia[]{programacion1});
        Materia programacion3 = new Materia("Programacion III", new Materia[]{programacion1,programacion2});
        Materia baseDatos1 = new Materia("Base de Datos I", new Materia[0]);
        Materia baseDatos2 = new Materia("Base de Datos II", new Materia[]{baseDatos1});
    }
}
