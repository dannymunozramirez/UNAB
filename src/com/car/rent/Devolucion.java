package com.car.rent;

import java.util.GregorianCalendar;

/**
 * @author dannymunoz
 */
public class Devolucion {

    private Arriendo arriendo;
    private GregorianCalendar gregorianCalendar;

    public Devolucion(Arriendo arriendo, GregorianCalendar gregorianCalendar) {
        setArriendo(arriendo);
        setGregorianCalendar(gregorianCalendar);

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


        if(gregorianCalendar.after(arriendo.getFecha())){
            this.gregorianCalendar = gregorianCalendar;
            arriendo.getVehiculo().setCondicion('D');
        } else {
            System.out.println("FECHA DEBE SER MAYOR A LA FECHA DE ARRIENDO");
            System.exit(1);
        }

    }


    @Override
    public String toString() {
        return "Devolucion{" +
                "arriendo=" + arriendo +
                ", gregorianCalendar=" + gregorianCalendar +
                '}';
    }
}
