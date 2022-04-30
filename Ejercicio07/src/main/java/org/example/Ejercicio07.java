package org.example;

import java.util.Scanner;

public class Ejercicio07 {

    public Float askNumber(){
        System.out.println("Por favor ingrese un número: ");
        Scanner scanner = new Scanner(System.in);
        Float givenNumber = scanner.nextFloat();
        return givenNumber;
    }

    public Boolean isPositive(Float givenNumber){
        Boolean flagNumber = false;
        if(givenNumber >= 0){
            flagNumber = true;
        }
        return flagNumber;
    }

    public static void main(String[] args) {
        Ejercicio07 ejercicio07 = new Ejercicio07();
        do {
            ejercicio07.askNumber();
        }while(ejercicio07.isPositive(ejercicio07.askNumber()));
    }
}
