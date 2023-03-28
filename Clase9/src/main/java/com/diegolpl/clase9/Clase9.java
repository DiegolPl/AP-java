

package com.diegolpl.clase9;

import com.diegolpl.clase9.models.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class Clase9 {

    public static void main(String[] args) {
        ArrayList<Persona> lista_personas = new ArrayList<>();
        int opcion = 10000;
        
        while(opcion != 0){
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Por favor, elije que operación desea realizar: ");
            System.out.println("""
                               1. Agregar persona
                               2. Listar personas
                               0. Salir
                               """);
            System.out.println("Opción: ");
            
            
            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                opcion = 1000;
            }
            
            switch (opcion) {
                case 1:
                    Persona nuevaPersona = new Persona();
                    
                    System.out.println("Nombre: ");
                    String nombre = sc.nextLine();
                    nuevaPersona.setNombre(nombre);
                    
                    System.out.println("Apellido: ");
                    String apellido = sc.nextLine();
                    nuevaPersona.setApellido(apellido);
                    
                    System.out.println("Fecha de nacimiento (Ej: 18/02/92): ");
                    String fecha_nacimiento = sc.nextLine();
                    nuevaPersona.setFecha_nacimiento(fecha_nacimiento);
                    
                    lista_personas.add(nuevaPersona);
                    
                    System.out.println("");
                    System.out.println("Persona agregada con éxito!");
                    System.out.println("");
                    
                    break;
                case 2:
                    System.out.println("");
                    
                    for( Persona persona : lista_personas){
                        System.out.println(persona.getNombre() + " " + persona.getApellido() + " - " + persona.getFecha_nacimiento());
                    }
                    
                    if (lista_personas.isEmpty()) {
                        System.out.println("No hay personas cargadas aún!");
                    }
                    
                    System.out.println("");
                    
                    break;
                case 0:
                    break;
                default:
                    System.out.println("");
                    System.out.println("Opción inválida. Vuelve a intentarlo!");
                    System.out.println("");
            }
        }
    }
}
