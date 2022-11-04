package com.car.rent;

import java.text.DateFormat;
import java.util.Calendar;

/**
 * <p>
 * Esta clase representa el cliente con atributos y métodos
 * </p>
 *
 * @author grupo 15
 */
public class Ticket {
    public void recibo(Arriendo arriendo) {
        DateFormat Date = DateFormat.getDateInstance();
        String fmt1 = "%1$4s %2$10s";
        String fmt2 = "%1$5s %2$18s %3$18s %4$12s";
        String fmt3 = "%1$5s %2$18s %3$14s %4$10s";

        System.out.println("-".repeat(70));
        System.out.printf("|" + " ".repeat(68) + "|\n");
        System.out.println("|     TICKET ARRIENDO DE VEHICULO   |");
        System.out.printf("|" + " ".repeat(68) + "|\n");
        System.out.println("|" + " ".repeat(18) + String.format(fmt1, "NUMERO DE ARRIENDO:", arriendo.getnArriendo()) + " ".repeat(23) + "|");
        System.out.println("|" + " ".repeat(18) + String.format(fmt1, "VEHICULO          :", arriendo.getVehiculo().getModelo()) + " ".repeat(8) + "|");
        System.out.println("|" + " ".repeat(18) + String.format(fmt1, "PRECIO DIARIO     :", arriendo.getPrecio()) + " ".repeat(23) + "|");
        System.out.printf("|" + " ".repeat(68) + "|\n");
        System.out.println("|" + " ".repeat(5) + String.format(fmt2, "FECHA", "CLIENTE", "DIAS", "A PAGAR") + "       |");
        System.out.println("|" + " ".repeat(5) + "-".repeat(58) + " ".repeat(5) + "|");
        System.out.printf("|" + " ".repeat(68) + "|\n");
        System.out.println("|" + " ".repeat(5) +
                String.format
                        (fmt3, (arriendo.getFecha().get(Calendar.YEAR) + "-" + arriendo.getFecha().get(Calendar.MONTH) + "-" + arriendo.getFecha().get(Calendar.DATE)), arriendo.getCliente().getCedula(), arriendo.getnDias() + " dias", arriendo.getTotalArriendo(), " ".repeat(7) + "|"));

        System.out.println("|" + " ".repeat(5) + "-".repeat(58) + " ".repeat(5) + "|");
        System.out.printf("|" + " ".repeat(68) + "|\n");
        System.out.printf("|" + " ".repeat(68) + "|\n");
        System.out.printf("|" + " ".repeat(50) + "_".repeat(13) + " ".repeat(5) + "|\n");
        System.out.printf("|" + " ".repeat(50) + "FIRMA CLIENTE" + " ".repeat(5) + "|\n");
        System.out.println("-".repeat(70));
    }
}
