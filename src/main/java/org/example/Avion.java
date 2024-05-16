package org.example;

public class Avion extends Aereo{
    private int maxHorasVuelo;

    public int getMaxHorasVuelo() {
        return maxHorasVuelo;
    }

    public Avion(String matricula,String modelo,int asientos,int maxHorasVuelo) {
        super(matricula,modelo,asientos);
        this.maxHorasVuelo = maxHorasVuelo;
    }

    @Override
    public String toString() {
        return "Avion{" + "\n"
                + "Matricula: " + getMatricula() +"\n"
                + "Modelo: " + getModelo()+ "\n"
                + "Asientos: " + getAsientos()+ "\n"
                + "Maximo hora vuelo: " + getMaxHorasVuelo() +
                "\n" + "_________________________";
    }
}
