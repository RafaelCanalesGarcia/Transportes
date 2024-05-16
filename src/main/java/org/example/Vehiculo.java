package org.example;

public abstract class Vehiculo {
    // Variables
    private final String matricula;
    private  final String modelo;
    // getter y setter


    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public abstract void imprimir();

    public Vehiculo(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }
}
