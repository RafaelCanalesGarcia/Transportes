package org.example;

public class Moto extends Terrestre{
    // variables
    private String color;

    //getter y setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    // constructor

    public Moto(String matricula,String modelo,int ruedas, String color) {
        super(matricula,modelo,ruedas);
        this.color = color;
    }
    // methods override
    @Override
    public String toString() {
        return "Terrestre{" + "\n"
                + "Moto: " + "\n"
                + "Matricula: " + getMatricula() +"\n"
                + "Modelo: " + getModelo()+ "\n" +
                "Ruedas: " + getRuedas() + "\n" +
                "Color: " + getColor() +
                "\n" + "_________________________";
    }
}
