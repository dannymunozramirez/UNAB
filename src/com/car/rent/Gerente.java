package com.car.rent;

/**
 * <p>
 * Esta clase representa al gerente con sus atributos y métodos
 * </p>
 *
 * @author Grupo 15
 */
public class Gerente extends Usuario {

    private int id;

    /**
     * Método constructor de la clase
     * @param nombre
     * @param id
     */
    public Gerente(String nombre, int id) {
        super(nombre);
        setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Gerente{" + "id=" + id + '}';
    }
}
