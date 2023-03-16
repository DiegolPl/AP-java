

package com.diegolpl.clase6;


public class Clase6 {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        boolean test1 = calc.multiplicar(80, 3) == 240.0;
        boolean test2 = calc.dividir(calc.sumar(150,180), 3) == 110.0;
        boolean test3 = calc.multiplicar(calc.restar(90,50), 15) != 605.0;
        boolean test4 = calc.multiplicar(calc.sumar(70,40), 25) != 2700.0;
        
        System.out.println("Test 1: " + test1);
        System.out.println("Test 2: " + test2);
        System.out.println("Test 3: " + test3);
        System.out.println("Test 4: " + test4);
    }
}
