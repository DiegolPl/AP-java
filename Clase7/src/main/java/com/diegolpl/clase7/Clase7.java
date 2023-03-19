

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
import java.util.ArrayList;


public class Clase7 {

    public static void main(String[] args) throws Exception {
        
        ArrayList<Testeos> testeos = new ArrayList<Testeos>();
        testeos.add(new Testeos("DF", 100.0, 0.0));
        testeos.add(new Testeos("DPCT", 0.5, 100.0));
        testeos.add(new Testeos("DPCT", 0.2, 100.0));
        testeos.add(new Testeos("DP", 0.1, 0.0));
        
        for(Testeos test : testeos){
            Descuento descuento;
            Carrito mi_carrito = new Carrito(test.getTipoDescuento());

            if(test.getTipoDescuento().matches("DF")){
                descuento = new DescuentoFijo();
                descuento.setValorDesc(test.getValorDescuento());
                mi_carrito.setDescuento(descuento);
            }else if(test.getTipoDescuento().matches("DP")){
                descuento = new DescuentoPorcentaje();
                descuento.setValorDesc(test.getValorDescuento());
                mi_carrito.setDescuento(descuento);
            }else if(test.getTipoDescuento().matches("DPCT")){
                descuento = new DescuentoPorcentajeConTope();
                descuento.setValorDesc(test.getValorDescuento());
                descuento.setTope(test.getTopeDescuento());
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
            
            System.out.println("Tipo de descuento: " + test.getTipoDescuento());
            System.out.println("Total de mi carrito: $" + mi_carrito.precio());
        }
        
        
    }
}
