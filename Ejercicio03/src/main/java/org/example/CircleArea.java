package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class CircleArea {

    static double radius;

    public double getRadius(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter circle's radius: ");
        radius = scanner.nextDouble();
        return radius;
    }

    public double calculateArea(){
        double circlearea = PI*pow(radius,2);
        System.out.println("Circle's area is: " + circlearea);
        return circlearea;
    }

    public static void main(String[] args) {

        /*CircleArea circleArea = new CircleArea();
        circleArea.getRadius();
        circleArea.calculateArea();*/
        try {
            CircleArea circleArea = new CircleArea();
            circleArea.getRadius();
            circleArea.calculateArea();
        }catch (InputMismatchException e) {
            System.out.println("Enter a valid number");
        }
    }
}
