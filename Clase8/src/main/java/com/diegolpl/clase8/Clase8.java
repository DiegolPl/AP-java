
package com.diegolpl.clase8;

import com.diegolpl.clase8.excepciones.DescuentoException;
import com.diegolpl.clase8.models.Carrito;
import com.diegolpl.clase8.models.Descuento;
import com.diegolpl.clase8.models.DescuentoFijo;
import com.diegolpl.clase8.models.DescuentoPorcentaje;
import com.diegolpl.clase8.models.DescuentoPorcentajeConTope;
import com.diegolpl.clase8.models.ItemCarrito;
import com.diegolpl.clase8.models.Producto;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Clase8 {

    public static void main(String[] args) throws IOException, Exception {
        ArrayList<Testeos> testeos = new ArrayList<Testeos>();
        testeos.add(new Testeos("DF", -100.0, 0.0,"C:\\Users\\d13g0\\OneDrive\\Escritorio\\Carpetas - Estudio\\AP - Intro JAVA - UTN\\AP-java\\Clase8\\src\\main\\java\\com\\diegolpl\\clase8\\lista.txt"));
        testeos.add(new Testeos("DPCT", 0.5, 100.0,"C:\\Users\\d13g0\\OneDrive\\Escritorio\\Carpetas - Estudio\\AP - Intro JAVA - UTN\\AP-java\\Clase8\\src\\main\\java\\com\\diegolpl\\clase8\\lista.txt"));
        testeos.add(new Testeos("DPCT", 0.2, 100.0,"C:\\Users\\d13g0\\OneDrive\\Escritorio\\Carpetas - Estudio\\AP - Intro JAVA - UTN\\AP-java\\Clase8\\src\\main\\java\\com\\diegolpl\\clase8\\lista-precio-0.txt"));
        testeos.add(new Testeos("DP", 0.1, 0.0,"C:\\Users\\d13g0\\OneDrive\\Escritorio\\Carpetas - Estudio\\AP - Intro JAVA - UTN\\AP-java\\Clase8\\src\\main\\java\\com\\diegolpl\\clase8\\lista.txt"));
        
        int cantidadTests = 0;
        
        for(Testeos test : testeos){
            
            cantidadTests++;
            System.out.println("#################### TEST " + cantidadTests + " ####################");
            
            Descuento descuento;
            Carrito mi_carrito = new Carrito(test.getTipoDescuento());
            
            Path archivo = Paths.get(test.getRutaArchivo());
            int count = 0;

            for(String linea : Files.readAllLines(archivo)){
                count++;
                String[] datos = linea.split(" ");

                if(count != 1){
                    ItemCarrito item = new ItemCarrito(Integer.parseInt(datos[0]), new Producto(datos[2],Double.parseDouble(datos[1])));
                    mi_carrito.agregar_item_carrito(item);
                }

            }  
            
//            System.out.println("Precio total: $" + mi_carrito.precio());
            
            try {
                if(mi_carrito.precio() == 0.0){
                    throw new DescuentoException("No se puede aplicar un descuento cuando el precio es $0. Test finalizado.");
                }else{
                    if(test.getTipoDescuento().matches("DF")){
                        descuento = new DescuentoFijo();
                        descuento.setValorDesc(test.getValorDescuento());
                        mi_carrito.setDescuento(descuento);
                        
                        if(descuento.valorDescuento(mi_carrito.getTotal()) < 0){
                            throw new DescuentoException("No se puede aplicar un descuento negativo. Test finalizado.");
                        }
                        
                    }else if(test.getTipoDescuento().matches("DP")){
                        descuento = new DescuentoPorcentaje();
                        descuento.setValorDesc(test.getValorDescuento());
                        mi_carrito.setDescuento(descuento);
                        
                        if(descuento.valorDescuento(mi_carrito.getTotal()) < 0){
                            throw new DescuentoException("No se puede aplicar un descuento negativo. Test finalizado.");
                        }
                        
                    }else if(test.getTipoDescuento().matches("DPCT")){
                        descuento = new DescuentoPorcentajeConTope();
                        descuento.setValorDesc(test.getValorDescuento());
                        descuento.setTope(test.getTopeDescuento());
                        mi_carrito.setDescuento(descuento);
                        
                        if(descuento.valorDescuento(mi_carrito.getTotal()) < 0){
                            throw new DescuentoException("No se puede aplicar un descuento negativo. Test finalizado.");
                        }
                        
                    }else{
                        descuento = new DescuentoFijo();
                        descuento.setValorDesc(0.0);
                        mi_carrito.setDescuento(descuento);
                    }

                    System.out.println("Tipo de descuento: " + test.getTipoDescuento());
                    System.out.println("Total de mi carrito: $" + mi_carrito.agregarDescuentoAlPrecio());
                }
            } catch (DescuentoException e) {
                System.out.println(e);
            }

            
        }
        
    }
}
