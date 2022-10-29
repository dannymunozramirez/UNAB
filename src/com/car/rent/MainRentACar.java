package com.car.rent;

import java.util.GregorianCalendar;

/**
 * @author dannymunoz
 */
public class MainRentACar {

    public static void main(String[] args) {

        // nuevos clientes
        Cliente cliente = new Cliente("7657876-2",true,"Cliente Prueba I");
        Cliente cliente1 = new Cliente("5464645-8", false, "cliente Prueba II");

        // vehiculo nuevo
        Vehiculo vehiculo = new Vehiculo("ADFEG-34","Audi", "Q7", 2017,'D');

        // nuevo gerente
        Gerente gerente = new Gerente("Gerente Prueba", 123);

        cliente.setValido(false, gerente);

        System.out.println(vehiculo);
        vehiculo.setCondicion('A', gerente);
        System.out.println(vehiculo);

        // Crear arriendo
        Arriendo arriendo = new Arriendo(001,new GregorianCalendar(),2,45000, vehiculo, cliente1);

        arriendo.setTotalArriendo();

        Devolucion devolucion = new Devolucion(arriendo, new GregorianCalendar());

        System.out.println(arriendo);
        System.out.println(vehiculo);
        System.out.println("---------- " +new GregorianCalendar().getTimeZone());

//        System.out.println(cliente);
//        System.out.println(cliente1);


    }
}
