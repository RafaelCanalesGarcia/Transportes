package org.example;

public class Submarino extends Acuatico{
    private int profundidad;

    public int getProfundidad() {
        return profundidad;
    }

    public Submarino(String matricula,String modelo,int eslora, int profundidad) {
        super(matricula,modelo,eslora);
        this.profundidad = profundidad;
    }

    @Override
    public String toString() {
        return "Submarino{" + "\n"
                + "Matricula: " + getMatricula() +"\n"
                + "Modelo: " + getModelo()+ "\n"
                + "Eslora: " + getEslora()+ "\n"
                + "Profundidad máxima: " + getProfundidad()+
                "\n" + "_________________________";
    }
}
