package com.car.rent;

/**
 * <p>
 * Esta clase representa el cliente con atributos y métodos
 * </p>
 *
 * @author grupo 15
 */
public class Cliente extends Usuario {

    private String cedula;
    private Boolean valido;

    /**
     * <p>
     * Constructor de la clase
     * </p>
     *
     * @param cedula
     * @param valido
     * @param nombre
     */
    public Cliente(String cedula, Boolean valido, String nombre) {
        super(nombre);
        setCedula(cedula);
        this.valido = true;
    }

    public String getCedula() {
        return cedula;
    }

    /**
     * <p>
     * Un cliente se caracteriza por su cédula (largo 10 con penúltimo dígito un guion y último dígito
     * valor entre 0 al 9 o una k), nombre y si está vigente o no (true: es vigente, false: no vigente).
     * Cuando un nuevo cliente se ingresa al sistema, su vigencia inicial es true.
     * </p>
     *
     * @param cedula
     */
    public void setCedula(String cedula) {

        if (cedula.length() <= 10 && cedula.charAt(cedula.length() - 2) == '-') {

            try {
                String digitK = String.valueOf(cedula.charAt(cedula.length() - 1));
                int digit = cedula.charAt(cedula.length() - 1);
                String s = String.valueOf(cedula.charAt(cedula.length() - 1));

                if (digitK.equalsIgnoreCase("k")) {
                    this.cedula = cedula;
                } else if (Integer.valueOf(s) >= 0 && Integer.valueOf(s) <= 9) {
                    this.cedula = cedula;
                } else {
                    System.out.println("RUT NO Válido");
                }
                this.cedula = cedula;
            } catch (Exception e) {
                System.exit(1);
//                System.out.println(e);
//                System.out.println(" El valor del ultimo dígito no es válido: " + String.valueOf(cedula.charAt(cedula.length() - 1)));
            }


        } else {
            System.exit(1);
        }

    }

    public Boolean getValido() {
        return valido;
    }

    /**
     * <p>
     *     Deshabilitar cliente: Esta operación la ejecuta el gerente del local
     *     cuando el estime conveniente y lo único que debe hacer es dejar no vigente
     *     al cliente para que no pueda arrendar.
     * </p>
     * @param valido
     * @param gerente
     */
    public void setValido(Boolean valido, Gerente gerente) {

        if (gerente.getId() != 0) {
            this.valido = valido;
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "cedula='" + cedula + '\'' + ", valido=" + valido + '}';
    }
}
