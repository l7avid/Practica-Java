package org.example;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio14 {

    public Integer askNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Integer givenNumber = scanner.nextInt();
        return givenNumber;
    }

    public void renderNumbers(Integer askNumber){
        Integer i = 0;
        for(i = askNumber; i <= 1000; i=i+2){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Ejercicio14 ejercicio14 = new Ejercicio14();
        Integer givenNumber = ejercicio14.askNumber();
        ejercicio14.renderNumbers(givenNumber);
    }
}
