package org.example;


public class Lavadora extends Electrodomestico {

    public Integer carga;

    public Lavadora(){
        this.carga = 5;
        this.color =  "Gris";
        this.peso = 100.0;
        this.consumoEnergetico = 'C';
        this.precioBase = 150.0;
    }

    public Lavadora(Double precioBase, Double peso){
        this.precioBase = precioBase;
        this.carga = 5;
        this.peso = peso;
        this.color =  "Gris";
        this.consumoEnergetico = 'C';
    }

    public Lavadora( Double precioBase,  String color,  Character consumoEnergetico, Double peso, Integer carga){
        super(precioBase,color,consumoEnergetico,peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return this.carga;
    }

    @Override
    public Double precioFinal(Character consumoEnergetico, Double peso){
        super.precioFinal(Character.toUpperCase(consumoEnergetico),peso);
        System.out.println("Lavadora");
        this.consumoEnergetico = Character.toUpperCase(consumoEnergetico);
        this.peso = peso;
        if(this.carga > 30){
            this.precioFinal += this.precioBase + 50.0;
        }
        return this.precioFinal;
    }
}
