package com.car.rent;

/**
 * @author dannymunoz
 */
public class Cliente extends Usuario {

    private String cedula;
    private Boolean valido;

    public Cliente(String cedula, Boolean valido, String nombre) {
        super(nombre);
        this.cedula = cedula;
        this.valido = valido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Boolean getValido() {
        return valido;
    }

    public void setValido(Boolean valido, Gerente gerente) {

        if(gerente.getId() != 0){
            this.valido = valido;
        }

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cedula='" + cedula + '\'' +
                ", valido=" + valido +
                '}';
    }
}
