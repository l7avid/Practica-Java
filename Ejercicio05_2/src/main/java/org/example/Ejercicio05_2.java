package org.example;

public class Ejercicio05_2 {

    static final Integer max = 100;
    Integer number;

    public Ejercicio05_2(Integer number1){
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
        while(number1<=max){
            Ejercicio05_2 ejercicio05_2 = new Ejercicio05_2(number1);
            ejercicio05_2.evenOrOdd(ejercicio05_2.reciveNumber(number1));
            number1++;
        }
    }
}