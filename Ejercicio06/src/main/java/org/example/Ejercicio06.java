package org.example;

public class Ejercicio06 {

    static final Integer max = 100;
    Integer number;

    public Ejercicio06(Integer number1){
        this.number = number1;
    }

    public Integer reciveNumber(Integer number1){
        Integer reciveNumber = number1 %2;
        return reciveNumber;
    }

    public void evenOrOdd(Integer reciveNumber) {
        if (reciveNumber == 0) {
            System.out.println(this.number + " is an even number");
        } else {
            System.out.println(this.number + " is an odd number");
        }
    }

    public static void main(String[] args){
        Integer number1 = 1;
        Integer i = 0;
        for(i = 1; i < max; i++){
            Ejercicio06 ejercicio06 = new Ejercicio06(number1);
            ejercicio06.evenOrOdd(ejercicio06.reciveNumber(number1));
            number1++;
        }
    }
}