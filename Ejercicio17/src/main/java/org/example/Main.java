package org.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
        electrodomesticos.add(new Televisor());
        electrodomesticos.add(new Lavadora());
        electrodomesticos.add(new Televisor());
        electrodomesticos.add(new Lavadora());
        electrodomesticos.add(new Televisor());
        electrodomesticos.add(new Lavadora());
        electrodomesticos.add(new Televisor());
        electrodomesticos.add(new Lavadora());
        electrodomesticos.add(new Televisor());
        electrodomesticos.add(new Lavadora());

        for (Electrodomestico electrodomestico: electrodomesticos) {
            System.out.println(electrodomestico.precioFinal('A',70.0));
        }
    }
}
