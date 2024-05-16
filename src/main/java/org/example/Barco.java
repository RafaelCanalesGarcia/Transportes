package org.example;

public class Barco extends Acuatico{
    private boolean motor;

    public boolean isMotor() {
        return motor;
    }

    public Barco(String matricula ,String modelo,int eslora, boolean motor) {
        super(matricula,modelo,eslora);
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Barco{" + "\n"
                + "Matricula: " + getMatricula() +"\n"
                + "Modelo: " + getModelo()+ "\n"
                + "Eslora: " + getEslora()+ "\n"
                + "Motor: " + isMotor()+
                "\n" + "_________________________";
    }

}
