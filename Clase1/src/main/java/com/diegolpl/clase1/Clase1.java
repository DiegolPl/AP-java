/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.diegolpl.clase1;

import java.util.Scanner;

/**
 *
 * @author d13g0
 */
public class Clase1 {

    public static void main(String[] args) {
        /*
        1. Vamos a practicar operaciones básicas con números
            a. Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
               y “b”. Su código puede arrancar (por ejemplo):
                 int numeroInicio = 5;
                 int numeroFin = 14;
                 // Se deberían mostrar los números:
                 5,6,7,8,9,10,11,12,13,14
            b. A lo anterior, solo muestre los números pares
            c. A lo anterior, con una variable extra, elija si se deben mostrar los números
               pares o impares
            d. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden
        */

        // Soluciones
        // 1.a

        System.out.println();
        System.out.println("Solucion 1.a");
        System.out.println();

        int numeroInicio = 2;
        int numeroFin = 10;
        int count = numeroInicio;

        while(count <= numeroFin){
            System.out.println(count);
            count++;
        }
        // 1.b

        System.out.println();
        System.out.println("Solucion 1.b");
        System.out.println();

        count = numeroInicio;

        while(count <= numeroFin){
            if (count % 2 == 0) {
                System.out.println(count);
            }
            count++;
        }
        // 1.c

        System.out.println();
        System.out.println("Solucion 1.c");
        System.out.println();

        count = numeroInicio;
        String tipo_valor = "impar";

        while (count <= numeroFin) {
            switch (tipo_valor){
                case "impar":
                    if (count % 2 != 0) {
                        System.out.println(count);
                    }
                    break;
                case "par":
                    if (count % 2 == 0) {
                        System.out.println(count);
                    }
                    break;
                default:
                    System.out.println("El tipo de valor ingresado es incorrecto!");
            }
            count++;
        }
        // 1.d

        System.out.println();
        System.out.println("Solucion 1.d");
        System.out.println();

        for (count = numeroFin; count >= numeroInicio; count--){
            if (count % 2 == 0) {
                System.out.println(count);
            }
        }
        
        // Ejercicio 2.d

        int ingresos_mensuales_requeridos = 489083;
        int cant_vehiculos_minimo_requeridos = 3;
        int cant_inmuebles_minimo_requeridos = 3;
        int cant_activos_lujo_minimo_requeridos = 1;

        System.out.println("Ingresa el ingreso mensual total de la familia: ");
        Scanner sc = new Scanner(System.in);
        int ingresos_mensuales_familia = sc.nextInt();

        System.out.println("Ingresa la cantidad total de vehículos de menos de 5 años de antiguedad de la familia: ");
        sc = new Scanner(System.in);
        int cant_vehiculos_familia = sc.nextInt();

        System.out.println("Ingresa la cantidad total de inmuebles de la familia: ");
        sc = new Scanner(System.in);
        int cant_inmuebles_familia = sc.nextInt();

        System.out.println("Ingresa la cantidad total de bienes de lujo de la familia: ");
        sc = new Scanner(System.in);
        int cant_activos_lujo_familia = sc.nextInt();

        System.out.printf("""
                Ingresos mensuales: $%s
                Cantidad de Vehículos con menos de 5 años de antiguedad: %d
                Cantidad de Inmuebles: %d
                Cantidad de Bienes de Lujo: %d
                %n""",ingresos_mensuales_familia,cant_vehiculos_familia,cant_inmuebles_familia,cant_activos_lujo_familia);

        if (ingresos_mensuales_familia >= ingresos_mensuales_requeridos &&
                cant_vehiculos_familia >= cant_vehiculos_minimo_requeridos &&
                cant_inmuebles_familia >= cant_inmuebles_minimo_requeridos &&
                cant_activos_lujo_familia >= cant_activos_lujo_minimo_requeridos) {
            System.out.println("Su familia pertenece a la categoría de Ingresos Altos");
        } else {
            System.out.println("No pertenece a la categoría de Ingresos Altos");
        }
    }
}
