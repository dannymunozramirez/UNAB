package com.car.rent;

import java.util.GregorianCalendar;

/**
 * @author dannymunoz
 */
public class Devolucion {

    private Arriendo arriendo;
    private GregorianCalendar gregorianCalendar;

    public Devolucion(Arriendo arriendo, GregorianCalendar gregorianCalendar) {
        this.arriendo = arriendo;
        this.gregorianCalendar = gregorianCalendar;

        cambiarCondicion(arriendo);
    }

    public void cambiarCondicion(Arriendo arriendo){
        arriendo.getVehiculo().setCondicion('D');

    }

    public Arriendo getArriendo() {
        return arriendo;
    }

    public void setArriendo(Arriendo arriendo) {
        this.arriendo = arriendo;
    }

    public GregorianCalendar getGregorianCalendar() {
        return gregorianCalendar;
    }

    public void setGregorianCalendar(GregorianCalendar gregorianCalendar) {
        this.gregorianCalendar = gregorianCalendar;
    }


    @Override
    public String toString() {
        return "Devolucion{" +
                "arriendo=" + arriendo +
                ", gregorianCalendar=" + gregorianCalendar +
                '}';
    }
}
