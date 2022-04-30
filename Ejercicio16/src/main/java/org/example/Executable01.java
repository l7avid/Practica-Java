package org.example;

import java.util.Scanner;

public class Executable01 {

    public String askName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String givenName = scanner.nextLine();
        return  givenName;
    }

    public Integer askAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        Integer givenAge = scanner.nextInt();
        return givenAge;
    }

    public Character askGender(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your gender: ");
        Character givenGender = scanner.next().charAt(0);
        return  givenGender;
    }

    public Double askHeight(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your height: ");
        Double givenHeight = scanner.nextDouble();
        return  givenHeight;
    }

    public Double askWeight(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        Double givenWeight = scanner.nextDouble();
        return  givenWeight;
    }

    public static void main(String[] args) {
        Executable01 requestedData = new Executable01();

        String name = requestedData.askName();
        Integer age = requestedData.askAge();
        Character gender = requestedData.askGender();
        Double height = requestedData.askHeight();
        Double weight = requestedData.askWeight();


        Person firstPerson = new Person(name,age,gender,weight,height);
        Person secondPerson = new Person(name,age,gender);
        Person thirdPerson = new Person();

        firstPerson.genderValidation(gender);
        secondPerson.genderValidation(gender);

        secondPerson.setHeigth(1.60);
        secondPerson.setWeigth(90.0);

        thirdPerson.genderValidation('J'); //Set a wrong gender in order to probe genderValidation method
        thirdPerson.setWeigth(59.0);
        thirdPerson.setHeigth(1.90);

        System.out.println("----- Weight validation -----\n");
        System.out.println("First Person: ");
        firstPerson.calculateIMC(weight,height);
        System.out.println("Second Person: ");
        secondPerson.calculateIMC(secondPerson.getWeight(),secondPerson.getHeight());
        System.out.println("Third Person: ");
        thirdPerson.calculateIMC(thirdPerson.getWeight(),thirdPerson.getHeight());
        System.out.println("\n");

        System.out.println("¿Is the first person an adult? " + firstPerson.isAnAdult(age));
        System.out.println("¿Is the second person an adult? " + secondPerson.isAnAdult(age));
        System.out.println("¿Is the third person an adult? " + thirdPerson.isAnAdult(thirdPerson.getAge()) + "\n");

        System.out.println("---- Personal data ----\n");
        System.out.println(firstPerson.toString());
        System.out.println(secondPerson.toString());
        System.out.println(thirdPerson.toString() + "\n");
    }
}
