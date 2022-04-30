package org.example;

import java.util.Locale;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Ejercicio08 {

    private String dayWeek;

    public Ejercicio08(){
    }

    public String askDay(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un día de la semana: ");
        String dayWeek = scanner.nextLine();
        return dayWeek;
    }

    public String formattedDayWeek(String dayWeek){
        String formattedDayWeek = dayWeek.toUpperCase();
        return formattedDayWeek;
    }

    public void compareDayWeek(String formattedDayWeek){

        String LABORAL_DAY = "Laboral day";
        String NOT_LABORAL_DAY = "Laboral day";

        switch (formattedDayWeek){
            case "MONDAY":
                System.out.println(LABORAL_DAY);
                break;
            case "TUESDAY":
                System.out.println(LABORAL_DAY);
                break;
            case "WEDNESDAY":
                System.out.println(LABORAL_DAY);
                break;
            case "THURSDAY":
                System.out.println(LABORAL_DAY);
                break;
            case "FRIDAY":
                System.out.println(LABORAL_DAY);
                break;
            case "SATURDAY":
                System.out.println(NOT_LABORAL_DAY);
                break;
            case "SUNDAY":
                System.out.println(NOT_LABORAL_DAY);
                break;
        }
    }

    public static void main(String[] args) {
        Ejercicio08 ejercicio08 = new Ejercicio08();
        String askDay = ejercicio08.askDay();
        String formattedDayWeek = ejercicio08.formattedDayWeek(askDay);
        ejercicio08.compareDayWeek(formattedDayWeek);
    }
}
