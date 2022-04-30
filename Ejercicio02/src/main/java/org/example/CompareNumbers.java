package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompareNumbers {

    float number1;
    float number2;
    boolean num1isgreater;
    boolean numbersequal;

    public CompareNumbers(){
        number1 = 0;
        number2 = 0;
        num1isgreater = true;
        numbersequal = false;
    }

    public void askANumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        number1 = scanner.nextFloat();
        System.out.println("Enter number 2: ");
        number2 = scanner.nextFloat();
    }

    public boolean isNum1Greater(){
        if (number1 > number2){
            num1isgreater = true;
            System.out.println("Number 1 is greater than number 2");
    }
        return num1isgreater;
    }

    public boolean isNum2Greater(){
        if (number2 > number1){
            num1isgreater = false;
            System.out.println("Number 2 is greater than number 1");
        }
        return num1isgreater;
    }

    public boolean areEqual(){
        if (number2 == number1){
            System.out.println("Numbers are equal");
            numbersequal = true;
        }
        return numbersequal;
    }

    public static void main(String[] args) {

        /*CompareNumbers compareNumbers = new CompareNumbers();
        compareNumbers.askANumber();
        compareNumbers.isNum1Greater();
        compareNumbers.isNum2Greater();
        compareNumbers.areEqual(); */
        try{
            CompareNumbers compareNumbers = new CompareNumbers();
            compareNumbers.askANumber();
            compareNumbers.isNum1Greater();
            compareNumbers.isNum2Greater();
            compareNumbers.areEqual();
        }catch (Exception e){
            System.out.println("Por favor ingrese un número válido");
        }

    }
}
