package org.example;

public class Terrestre extends Vehiculo{
    // variables
    private final int ruedas;
    // getter y setter

    public int getRuedas() {
        return ruedas;
    }

    // constructor

    public Terrestre(String matricula, String modelo, int ruedas) {
        super(matricula,modelo);
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Terrestre{" + "\n"
                + "Matricula: " + getMatricula() +"\n"
                + "Modelo: " + getModelo()+ "\n" +
                "Ruedas: " + getRuedas() +
                "\n" + "_________________________";
    }

    @Override
    public void imprimir() {
        System.out.println(this);
    }
}
