package org.example;

public class Helicoptero extends Aereo{
    private int helices;

    public int getHelices() {
        return helices;
    }

    public Helicoptero(String matricula,String modelo,int asientos,int helices) {
        super(matricula,modelo,asientos);
        this.helices = helices;
    }

    @Override
    public String toString() {
        return "Helicoptero{" + "\n"
                + "Matricula: " + getMatricula() +"\n"
                + "Modelo: " + getModelo()+ "\n"
                + "Asientos: " + getAsientos()+ "\n"
                + "Nº Helices: " + getHelices() +
                "\n" + "_________________________";
    }
}
