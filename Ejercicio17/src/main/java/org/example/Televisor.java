package org.example;

public class Televisor extends Electrodomestico{

    public Integer resolucion;
    public Boolean sintonizadorTDT;

    public Televisor(){
        this.resolucion = 41;
        this.sintonizadorTDT = false;
        this.color = "Azul";
        this.peso = 15.0;
        this.consumoEnergetico = 'D';
        this.precioBase = 80.5;
    }

    public Televisor(Double precioBase, Double peso){
        this.resolucion = 20;
        this.sintonizadorTDT = false;
        this.color = "Azul";
        this.consumoEnergetico = 'D';
    }

    public Televisor(Double precioBase, String color, Character consumoEnergetico, Double peso, Integer resolucion,
                     Boolean sintonizadorTDT){
        super(precioBase,color,consumoEnergetico,peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Integer getResolucion() {
        return this.resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return this.sintonizadorTDT;
    }

    @Override
    public Double precioFinal(Character consumoEnergetico, Double peso){
        super.precioFinal(Character.toUpperCase(consumoEnergetico),peso);
        System.out.println("Televisor");
        this.consumoEnergetico = Character.toUpperCase(consumoEnergetico);
        this.peso = peso;
        if(this.resolucion > 40){
            this.precioFinal += this.precioBase*0.3;
        }
        if(getSintonizadorTDT()){
            this.precioFinal += 50.0;
        }
        return this.precioFinal;
    }
}
