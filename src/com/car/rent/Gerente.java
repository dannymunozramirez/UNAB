package com.car.rent;

/**
 * @author dannymunoz
 */
public class Gerente extends Usuario {

    private int id;

    public Gerente(String nombre, int id) {
        super(nombre);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "id=" + id +
                '}';
    }
}
