package org.example;

public class Coche extends Terrestre{
    // variables
    private boolean aireAcondicionado;

    // getter y setter

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    // constructor

    public Coche(String matricula, String modelo, int ruedas, boolean aireAcondicionado) {
        super(matricula,modelo,ruedas);
        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    public String toString() {
        return "Terrestre{" + "\n"
                + "Coche:"+ "\n"
                + "Matricula: " + getMatricula() +"\n"
                + "Modelo: " + getModelo()+ "\n" +
                "Ruedas: " + getRuedas() + "\n" +
                "Aire Acondicionado: " + isAireAcondicionado()+
                "\n" + "_________________________";
    }

}
