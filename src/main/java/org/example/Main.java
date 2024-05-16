package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Terrestre t1 = new Terrestre("4386KBX", "Gti", 4);
        Coche c1 = new Coche("1234", "Gti", 4, true);
        Moto m1 = new Moto("4321", "cross", 2, "rojo");
        Acuatico a1 = new Acuatico("777", "agua", 20);
        Barco b1 = new Barco("5555", "avenger", 12, true);
        Submarino s1 = new Submarino("6666", "KTF", 15, 4000);
        Aereo aa1 = new Aereo("888", "jefe", 200);
        Helicoptero h1 = new Helicoptero("999", "Mortal", 6, 8);
        Avion aaa1 = new Avion("9129", "boeing 330", 400, 12);

        ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
        listaVehiculos.add(t1);
        listaVehiculos.add(a1);
        listaVehiculos.add(aa1);
        listaVehiculos.add(c1);
        listaVehiculos.add(m1);
        listaVehiculos.add(b1);
        listaVehiculos.add(s1);
        listaVehiculos.add(aaa1);
        listaVehiculos.add(h1);
        for (int i = 0; i < listaVehiculos.size(); i++) {
            Vehiculo v = listaVehiculos.get(i);
            v.imprimir();
        }
    }
}