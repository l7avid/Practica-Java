package org.example;

import java.util.Scanner;

public class Ejercicio09 {

    static final String defaultPhrase = "La sonrisa sera la mejor arma contra la tristeza";

    public String askPhrase(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phrase to concatenate to default one: ");
        String givenPhrase = scanner.nextLine();
        return givenPhrase;
    }

    public String refactoredDefaultPhrase(){
        String refactoredDefaultPhrase = defaultPhrase.replace("a","e");
        return refactoredDefaultPhrase;
    }

    public String concatenatePhrases(String refactoredDefaultPhrase, String givenPhrase){
        String finalPhrase = refactoredDefaultPhrase + " " + givenPhrase;
        return finalPhrase;
    }

    public static void main(String[] args) {
        Ejercicio09 ejercicio09 = new Ejercicio09();
        String refactoredDefaultPhrase = ejercicio09.refactoredDefaultPhrase();
        String givenPhrase = ejercicio09.askPhrase();
        String finalPhrase = ejercicio09.concatenatePhrases(refactoredDefaultPhrase, givenPhrase);
        System.out.println(finalPhrase);
    }
}
