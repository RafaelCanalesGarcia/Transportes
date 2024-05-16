package org.example;

public class Acuatico extends Vehiculo{
    // variables
    private final int eslora;

    // getter y setter

    public int getEslora() {
        return eslora;
    }

    // constructor

    public Acuatico(String matricula,String modelo, int eslora) {
        super(matricula,modelo);
        this.eslora = eslora;
    }

    @Override
    public String toString() {
        return "Acuatico{" + "\n"
                + "Matricula: " + getMatricula() +"\n"
                + "Modelo: " + getModelo()+ "\n"
                + "Eslora: " + getEslora()+ "\n"
                + "_________________________";
    }

    @Override
    public void imprimir() {
        System.out.println(this);
    }
}
