package com.car.rent;
import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * @author dannymunoz
 */
public class MainRentACar {

    public static void main(String[] args) {

        // nuevos clientes
        Cliente cliente = new Cliente("7657876-2", true, "Cliente Prueba I");
        Cliente cliente1 = new Cliente("5464645-k", true, "cliente Prueba II");

        // vehiculo nuevo
        Vehiculo vehiculo = new Vehiculo("ADFEG-34", "Audi", "Q7", 2000, 'D');

        // nuevo gerente
        Gerente gerente = new Gerente("Gerente Prueba", 123);

        cliente.setValido(false, gerente);

//        System.out.println(vehiculo);
        vehiculo.setCondicion('A', gerente);
//        System.out.println(vehiculo);

        // Crear arriendo
        Arriendo arriendo = new Arriendo(001, new GregorianCalendar(2022,10,02), 2, 45000, vehiculo, cliente1);

        Ticket ticket = new Ticket();

        arriendo.setTotalArriendo();

        Devolucion devolucion = new Devolucion(arriendo, new GregorianCalendar(2022, 11, 01));

        ticket.recibo(arriendo);

    }
}
