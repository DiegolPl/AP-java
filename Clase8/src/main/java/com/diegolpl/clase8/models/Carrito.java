
package com.diegolpl.clase8.models;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<ItemCarrito> mi_carrito; 
    private double total;
    private String tipoDescuento;
    private Descuento descuento;

    public Carrito(String tipoDescuento) {
        this.mi_carrito = new ArrayList<ItemCarrito>();
        this.total = 0;
        this.tipoDescuento = tipoDescuento;
    }

    public ArrayList<ItemCarrito> getMi_carrito() {
        return mi_carrito;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setMi_carrito(ArrayList<ItemCarrito> mi_carrito) {
        this.mi_carrito = mi_carrito;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    public String getTipoDescuento() {
        return tipoDescuento;
    }

    public void setTipoDescuento(String tipoDescuento) {
        this.tipoDescuento = tipoDescuento;
    }
    
    public void agregar_item_carrito(ItemCarrito producto){
        this.getMi_carrito().add(producto);
    }
    
    public double agregarDescuentoAlPrecio(){
        if(this.getTipoDescuento().matches("DF") || this.getTipoDescuento().matches("DP") || this.getTipoDescuento().matches("DPCT")){
            return this.getDescuento().valorFinal(this.total);
        }else{
            return this.total;
        }
    }
    
    public double precio(){
        for(ItemCarrito item : this.getMi_carrito()){
            this.total += item.getCantidad() * item.getProducto().getPrecio();
        }
        return this.total;
    }
    
//    public double aplicarDescuentoFijo(double valorDescuento){
//        return this.total - valorDescuento;
//    }
//    
//    public double aplicarDescuentoPorcentual(double valorDescuento){
//        return this.total - ((this.total * valorDescuento) / 100);
//    }
//    
//    public double aplicarDescuentoPorcentualConTope(double valorDescuento, double tope){
//        double valorADescontar = (this.total * valorDescuento) / 100;
//        if(valorADescontar > tope){
//            return this.total - tope;
//        }else{
//            return this.total - ((this.total * valorDescuento) / 100);
//        }
//    }
}
