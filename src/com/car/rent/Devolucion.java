package com.car.rent;

import java.util.GregorianCalendar;

/**
 * <p>
 *     Esta clase representa la devolución con sus atributos y métodos
 * </p>
 * @author Grupo 15
 */
public class Devolucion {

    private Arriendo arriendo;
    private GregorianCalendar gregorianCalendar;

    /**
     * <p>
     *     Método constructor de la clase
     * </p>
     * @param arriendo
     * @param gregorianCalendar
     */
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

    /**
     * <p>
     *     Calcula que la fecha no debe ser menor que la fecha del arriendo, una vez que está validado
     *     asignará como nueva condicion 'D' al vehículo asociado al arriendo
     * </p>
     * @param gregorianCalendar
     */
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
