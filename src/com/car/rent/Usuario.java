package com.car.rent;

/**
 * <p>
 *     Esta clase representa la Usuario con sus atributos y métodos
 * </p>
 * @author Grupo 15
 */
public class Usuario {

    private String nombre;

    /**
     * <p>
     *     Método constructor de la clase
     * </p>
     * @param nombre
     */
    public Usuario(String nombre) {
        setNombre(nombre);
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
