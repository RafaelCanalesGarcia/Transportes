package org.example;

public class Aereo extends Vehiculo{

    // variables
    private final int asientos;
    // getter y setter

    public int getAsientos() {
        return asientos;
    }

    // constructor

    public Aereo(String matricula, String modelo, int asientos) {
        super(matricula,modelo);
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return "Aereo{" + "\n"
                + "Matricula: " + getMatricula() +"\n"
                + "Modelo: " + getModelo()+ "\n"
                + "Asientos: " + getAsientos()+
                "\n" + "_________________________";
    }

    @Override
    public void imprimir() {
        System.out.println(this);
    }
}
