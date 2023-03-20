
package com.diegolpl.clase8;

public class Testeos {
    private String tipoDescuento;
    private double valorDescuento;
    private double topeDescuento;
    private String rutaArchivo;

    public Testeos(String tipoDescuento, double valorDescuento, double topeDescuento, String rutaArchivo) {
        this.tipoDescuento = tipoDescuento;
        this.valorDescuento = valorDescuento;
        this.topeDescuento = topeDescuento;
        this.rutaArchivo = rutaArchivo;
    }

    public String getTipoDescuento() {
        return tipoDescuento;
    }

    public double getValorDescuento() {
        return valorDescuento;
    }

    public double getTopeDescuento() {
        return topeDescuento;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setTipoDescuento(String tipoDescuento) {
        this.tipoDescuento = tipoDescuento;
    }

    public void setValorDescuento(double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    public void setTopeDescuento(double topeDescuento) {
        this.topeDescuento = topeDescuento;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }
    
    
}
