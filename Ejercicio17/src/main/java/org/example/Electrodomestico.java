package org.example;

public class Electrodomestico {

    public Double precioBase;
    public String color;
    public Character consumoEnergetico;
    public Double peso;
    public final String[] coloresDisponibles = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};
    public final Character[] consumoDisponible = {'A', 'B', 'C', 'D', 'E', 'F'};
    public Double precioFinal = 0.0;

    public Electrodomestico() {
        this.precioBase = 100.0;
        this.color = "Blanco";
        this.consumoEnergetico = 'F';
        this.peso = 5.0;
        comprobarColor(this.color);
        comprobarConsumoEnergetico(this.consumoEnergetico);
        comprobarPeso(this.peso);
    }

    public Electrodomestico(Double precioBase, Double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = "Blanco";
        this.consumoEnergetico = 'F';
        comprobarColor(this.color);
        comprobarConsumoEnergetico(this.consumoEnergetico);
        comprobarPeso(this.peso);
    }

    public Electrodomestico(Double precioBase, String color, Character consumoEnergetico, Double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        comprobarColor(this.color);
        comprobarConsumoEnergetico(this.consumoEnergetico);
        comprobarPeso(this.peso);
    }

    public Double getPrecioBase() {
        return this.precioBase;
    }

    public String getColor() {
        return this.color;
    }

    public Character getConsumoEnergetico() {
        return this.consumoEnergetico;
    }

    public Double getPeso() {
        return this.peso;
    }

    private void comprobarConsumoEnergetico(Character consumoEnergetico) {
        for (Character consumos : consumoDisponible) {
            if (consumos.equals(Character.toUpperCase(consumoEnergetico))) {
                this.consumoEnergetico = consumoEnergetico;
            } else {
                this.consumoEnergetico = 'F';
            }
        }
    }

    private void comprobarColor(String color) {
        for (String colores : coloresDisponibles) {
            if (colores.equalsIgnoreCase(color)) {
                this.color = color;
            } else {
                this.color = "Blanco";
            }
        }
    }

    private void comprobarPeso(Double peso) {
        if (peso <= 0) {
            this.peso = 5.0;
        } else {
            this.peso = peso;
        }

    }

    public Double precioFinal(Character consumoEnergetico, Double peso) {
        //System.out.println("Holaaa");
        this.consumoEnergetico = Character.toUpperCase(consumoEnergetico);
        this.peso = Math.floor(peso);
        switch (this.consumoEnergetico) {
            case 'A':
                this.precioFinal += this.precioBase + 100.0;
                break;
            case 'B':
                this.precioFinal += this.precioBase + 80.0;
                System.out.println(this.precioFinal);
                break;
            case 'C':
                this.precioFinal += this.precioBase + 60.0;
                break;
            case 'D':
                this.precioFinal += this.precioBase + 50.0;
                break;
            case 'E':
                this.precioFinal += this.precioBase + 30.0;
                break;
            case 'F':
                this.precioFinal += this.precioBase + 10.0;
                break;
        }

        if(this.peso < 20.0){
            this.precioFinal += this.precioBase + 10.0;
        } else if (this.peso >= 20.0 && this.peso < 50.0) {
            this.precioFinal += this.precioBase + 50.0;
        } else if (this.peso >= 50.0 && this.peso < 80.0) {
            this.precioFinal += this.precioBase + 80.0;
        }else if(this.peso >= 80.0) {
            this.precioFinal += this.precioBase + 100.0;
        }
        return this.precioFinal;
    }
}

