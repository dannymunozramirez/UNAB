package com.car.rent;

/**
 * @author grupo 15
 */
public class Vehiculo {

    private String patente;
    private String marca;
    private String modelo;
    private int anho;
    private Character condicion;

    public Vehiculo(String patente, String marca, String modelo, int anho, Character condicion) {

        setPatente(patente);
        setMarca(marca);
        setModelo(modelo);
        setAnho(anho);
        setCondicion(condicion);
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {


        if (patente.replaceAll("\\s", "").toUpperCase().length() == 8) {
            this.patente = patente.replaceAll("\\s", "").toUpperCase();
        } else {
            System.out.println("PATENTE NO VÁLIDA");
        }
        // Validar


    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        System.out.println(anho);
        if (anho >= 2000) {
            this.anho = anho;
        } else {
            System.out.println("Año no válido");
        }

    }

    public Character getCondicion() {
        return condicion;
    }


    public void setCondicion(Character condicion, Gerente gerente) {

        if (gerente.getId() != 0 && !condicion.equals('A')) {
            this.condicion = condicion;
        }
    }

    public void setCondicion(Character condicion) {
        this.condicion = condicion;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente='" + patente + '\'' + ", marca='" + marca + '\'' + ", modelo='" + modelo + '\'' + ", anho=" + anho + ", condicion=" + condicion + '}';
    }
}
