
package com.diegolpl.clase5;

import com.diegolpl.clase5.models.Carrito;
import com.diegolpl.clase5.models.ItemCarrito;
import com.diegolpl.clase5.models.Producto;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Clase5 {

    public static void main(String[] args) throws Exception {
        Carrito mi_carrito = new Carrito();
        
        Path archivo = Paths.get("C:\\Users\\d13g0\\OneDrive\\Escritorio\\Carpetas - Estudio\\AP - Intro JAVA - UTN\\AP-java\\Clase5\\src\\main\\java\\com\\diegolpl\\clase5\\lista.txt");
        int count = 0;
        
        for(String linea : Files.readAllLines(archivo)){
            count++;
            String[] datos = linea.split(" ");
            
            if(count != 1){
                ItemCarrito item = new ItemCarrito(Integer.parseInt(datos[0]), new Producto(datos[2],Double.parseDouble(datos[1])));
                mi_carrito.agregar_item_carrito(item);
            }
            
        }    
        System.out.println("Total de mi carrito: $" + mi_carrito.precio());
    }
}
