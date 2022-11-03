package com.car.rent;
import java.io.*;
import java.util.GregorianCalendar;

/**
 * @author dannymunoz
 */
public class MainRentACar {

    public static void main(String[] args) {

        // nuevos clientes
        Cliente cliente = new Cliente("7657876-2", true, "Cliente Prueba I");
        Cliente cliente1 = new Cliente("5464645-8", true, "cliente Prueba II");

        // vehiculo nuevo
        Vehiculo vehiculo = new Vehiculo("ADFEG-34", "Audi", "Q7", 2000, 'D');

        // nuevo gerente
        Gerente gerente = new Gerente("Gerente Prueba", 123);

        cliente.setValido(false, gerente);

//        System.out.println(vehiculo);
        vehiculo.setCondicion('A', gerente);
//        System.out.println(vehiculo);

        // Crear arriendo
        Arriendo arriendo = new Arriendo(001, new GregorianCalendar(2022, 10, 01), 2, 45000, vehiculo, cliente1);

        arriendo.setTotalArriendo();

        String guion = "-";
        Devolucion devolucion = new Devolucion(arriendo, new GregorianCalendar(2022, 11, 01));

        System.out.printf(guion.repeat(70));

    }
}
