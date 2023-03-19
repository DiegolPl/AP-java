
package com.diegolpl.clase7;

public class Testeos {
    private String tipoDescuento;
    private double valorDescuento;
    private double topeDescuento;

    public Testeos(String tipoDescuento, double valorDescuento, double topeDescuento) {
        this.tipoDescuento = tipoDescuento;
        this.valorDescuento = valorDescuento;
        this.topeDescuento = topeDescuento;
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

    public void setTipoDescuento(String tipoDescuento) {
        this.tipoDescuento = tipoDescuento;
    }

    public void setValorDescuento(double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    public void setTopeDescuento(double topeDescuento) {
        this.topeDescuento = topeDescuento;
    }
    
    
}
