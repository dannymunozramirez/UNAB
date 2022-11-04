package com.car.rent;

import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * <p>
 * Esta clase representa al Arriendo
 * Un arriendo, se caracteriza por un número de arriendo, el vehículo, el cliente que lo arrienda,
 * la fecha de arriendo y el número de días arrendado (mayor que 1 y menor que 10). El monto del
 * arriendo se obtiene a partir del precio que el usuario ingresa en el momento de ingresar el arriendo.
 * </p>
 *
 * @author Grupo 15
 */
public class Arriendo {

    private int nArriendo;
    private GregorianCalendar fecha;
    private int nDias;
    private int precio;
    private int totalArriendo;
    private Vehiculo vehiculo;
    private Cliente cliente;

    /**
     * <p>
     * Constructor de la Clase
     * </p>
     *
     * @param nArriendo
     * @param fecha
     * @param nDias
     * @param precio
     * @param vehiculo
     * @param cliente
     */
    public Arriendo(int nArriendo, GregorianCalendar fecha, int nDias, int precio, Vehiculo vehiculo, Cliente cliente) {
        setnArriendo(nArriendo);
        setFecha(fecha);
        setnDias(nDias);
        setPrecio(precio);
        setVehiculo(vehiculo);
        setCliente(cliente, vehiculo);

        cambiarCondicion(vehiculo);
        System.out.println(fecha + " Fecha dentro de constructor arriendo" );
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
        TimeZone timeZone = TimeZone.getTimeZone("GMT+5:30");

        System.out.println(fecha + " -------------------------");


        this.fecha = fecha;
    }

    public int getnDias() {
        return nDias;
    }

    /**
     * <p>
     * Número de días arrendado (mayor que 1 y menor que 10)
     * </p>
     *
     * @param nDias
     */
    public void setnDias(int nDias) {
        if (nDias >= 1 && nDias <= 10) {
            this.nDias = nDias;
        } else {
            System.out.println("Número de días inválido");
        }

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

    /**
     * <p>
     *     Calcula el total del arriendo
     * </p>
     */
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

    /**
     * <p>
     * El monto del arriendo se obtiene a partir del precio
     * que el usuario ingresa en el momento de ingresar el arriendo
     * </p>
     *
     * @param cliente
     * @param vehiculo
     */
    public void setCliente(Cliente cliente, Vehiculo vehiculo) {

        if (cliente.getValido() && vehiculo.getCondicion().equals('D')) {
            this.cliente = cliente;
        } else {
            System.out.println("Cliente no válido!");
            System.exit(1);
        }

    }

    /**
     * <p>
     * Este Método cambia la condicion del vehículo cuando este es arrendado satisfactoriamente
     * </p>
     *
     * @param vehiculo
     */
    public void cambiarCondicion(Vehiculo vehiculo) {
        if (vehiculo.getCondicion().equals('D')) {
            vehiculo.setCondicion('A');
        }
    }

    @Override
    public String toString() {
        return "Arriendo{" + "nArriendo=" + nArriendo + ", nDias=" + nDias + ", precio=" + precio + ", totalArriendo=" + totalArriendo + ", vehiculo=" + vehiculo + ", cliente=" + cliente + '}';
    }
}
