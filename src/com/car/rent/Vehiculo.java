package com.car.rent;

/**
 * <p>
 * Esta clase representa la vehículo con sus atributos y métodos
 * </p>
 *
 * @author Grupo 15
 */
public class Vehiculo {

    private String patente;
    private String marca;
    private String modelo;
    private int anho;
    private Character condicion;

    /**
     * <p>
     * Método constructor de la clase
     * </p>
     *
     * @param patente
     * @param marca
     * @param modelo
     * @param anho
     * @param condicion
     */
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

    /**
     * <p>
     * Validación de la patente debe tener un largo de 8 dígitos
     * </p>
     *
     * @param patente
     */
    public void setPatente(String patente) {

        if (patente.replaceAll("\\s", "").toUpperCase().length() == 8) {
            this.patente = patente.replaceAll("\\s", "").toUpperCase();
        } else {
            System.out.println("PATENTE NO VÁLIDA");
        }
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

    /**
     * <p>
     * Validacion de año, este no debe ser menor a 2000
     * </p>
     * @param anho
     */
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


    /**
     * <p>
     *     Cambiar la condición del vehículo a 'M' según lo determine un gerente
     * </p>
     * @param condicion
     * @param gerente
     */
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
