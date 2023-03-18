

package com.diegolpl.clase7;

import com.diegolpl.clase7.models.Carrito;
import com.diegolpl.clase7.models.Descuento;
import com.diegolpl.clase7.models.DescuentoFijo;
import com.diegolpl.clase7.models.DescuentoPorcentaje;
import com.diegolpl.clase7.models.DescuentoPorcentajeConTope;
import com.diegolpl.clase7.models.ItemCarrito;
import com.diegolpl.clase7.models.Producto;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class Clase7 {

    public static void main(String[] args) throws Exception {
        String tipoDescuento = "DPCT";
        double valorDescuento = 0.2;
        double topeDescuento = 100;
        Descuento descuento;
        Carrito mi_carrito = new Carrito(tipoDescuento);
        
        if(tipoDescuento.matches("DF")){
            descuento = new DescuentoFijo();
            descuento.setValorDesc(valorDescuento);
            mi_carrito.setDescuento(descuento);
        }else if(tipoDescuento.matches("DP")){
            descuento = new DescuentoPorcentaje();
            descuento.setValorDesc(valorDescuento);
            mi_carrito.setDescuento(descuento);
        }else if(tipoDescuento.matches("DPCT")){
            descuento = new DescuentoPorcentajeConTope();
            descuento.setValorDesc(valorDescuento);
            descuento.setTope(topeDescuento);
            mi_carrito.setDescuento(descuento);
        }else{
            descuento = new DescuentoFijo();
            descuento.setValorDesc(0.0);
            mi_carrito.setDescuento(descuento);
        }
        
        Path archivo = Paths.get("C:\\Users\\d13g0\\OneDrive\\Escritorio\\Carpetas - Estudio\\AP - Intro JAVA - UTN\\AP-java\\Clase7\\src\\main\\java\\com\\diegolpl\\clase7\\lista.txt");
        int count = 0;
        
        for(String linea : Files.readAllLines(archivo)){
            count++;
            String[] datos = linea.split(" ");
            
            if(count != 1){
                ItemCarrito item = new ItemCarrito(Integer.parseInt(datos[0]), new Producto(datos[2],Double.parseDouble(datos[1])));
                mi_carrito.agregar_item_carrito(item);
            }
            
        }    
        
//        Scanner sc = new Scanner(System.in);
//        String respuesta;
        
//        while(true){
//            System.out.println("Hay algun descuento a aplicar? S/N");
//            respuesta = sc.nextLine().toUpperCase();
//            System.out.println(respuesta);
//            
//            if(respuesta.matches("S") || respuesta.matches("N")){
//                break;
//            }else{
//                System.out.println("Opción no válida.");
//            }
//        }
        
//        if(respuesta.matches("S")){
//            while(true){
//                System.out.println("Cuál descuento se va a aplicar? \n - DF (Descuento Fijo) \n - DP (Descuento Porcentaje) \n - DPCT (Descuento Porcentaje Con Tope)");
//                respuesta = sc.nextLine().toUpperCase();
//
//                if(respuesta.matches("DF") || respuesta.matches("DP") || respuesta.matches("DPCT")){
//                    break;
//                }else{
//                    System.out.println("Opción no válida.");
//                }
//            }
//            
//           
//        }
        
        System.out.println("Total de mi carrito: $" + mi_carrito.precio());
    }
}
