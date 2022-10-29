package com.car.rent;

import java.util.GregorianCalendar;

/**
 * @author dannymunoz
 */
public class Arriendo {

    private int nArriendo;
    private GregorianCalendar fecha;
    private int nDias;
    private int precio;
    private int totalArriendo;
    private Vehiculo vehiculo;
    private Cliente cliente;

    public Arriendo(int nArriendo, GregorianCalendar fecha, int nDias, int precio, Vehiculo vehiculo, Cliente cliente) {
        this.nArriendo = nArriendo;
        this.fecha = fecha;
        this.nDias = nDias;
        this.precio = precio;
        this.vehiculo = vehiculo;
        setCliente(cliente, vehiculo);

        cambiarCondicion(vehiculo);
    }

    public int getnArriendo() {
        return nArriendo;
    }

    public void setnArriendo(int nArriendo) {
        this.nArriendo = nArriendo;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public int getnDias() {
        return nDias;
    }

    public void setnDias(int nDias) {
        this.nDias = nDias;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {

        this.precio = precio;
    }

    public int getTotalArriendo() {

        return totalArriendo;
    }

    public void setTotalArriendo() {
        this.totalArriendo = nDias * precio;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente, Vehiculo vehiculo) {

        if (cliente.getValido() && vehiculo.getCondicion().equals('D')) {
            this.cliente = cliente;
        } else {
            System.out.println("Cliente no válido!");
            System.exit(1);
        }

    }

    public void cambiarCondicion(Vehiculo vehiculo){
        if(vehiculo.getCondicion().equals('D')){
            vehiculo.setCondicion('A');
        }
    }

    @Override
    public String toString() {
        return "Arriendo{" + "nArriendo=" + nArriendo + ", nDias=" + nDias + ", precio=" + precio + ", totalArriendo=" + totalArriendo + ", vehiculo=" + vehiculo + ", cliente=" + cliente + '}';
    }
}
