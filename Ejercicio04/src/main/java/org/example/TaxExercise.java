package org.example;

import java.util.Scanner;

public class TaxExercise {

    static double price;
    Scanner scanner = new Scanner(System.in);

    public TaxExercise(){
        price = 0;
    }

    public double enterPrice(){
        System.out.println("Enter the price you want to calculate : ");
        price = scanner.nextDouble();
        return price;
    }

    public double taxesPrice(){
        double taxesprice = price * 0.21;
        return taxesprice;
    }

    public double finalPrice(){
        double finalprice = price + taxesPrice();
        System.out.println("Final price is: " + finalprice);
        return finalprice;
    }

    public static void main(String[] args) {

        try{
            TaxExercise taxExercise = new TaxExercise();
            taxExercise.enterPrice();
            taxExercise.taxesPrice();
            taxExercise.finalPrice();
        }catch (Exception e){
            System.out.println("Not a valid number");
        }

    }
}
