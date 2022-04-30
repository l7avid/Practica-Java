package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Ejercicio10 {

    public String askPhrase(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String givenPhrase = scanner.nextLine();
        return givenPhrase;
    }

    public String withoutCharSpacing(@NotNull String givenPhrase){
        String finalPhrase = givenPhrase.replace(" ", "");
        return finalPhrase;
    }

    public static void main(String[] args) {
        Ejercicio10 ejercicio10 = new Ejercicio10();
        String givenPhrase = ejercicio10.askPhrase();
        String finalPhrase = ejercicio10.withoutCharSpacing(givenPhrase);
        System.out.println(finalPhrase);

    }
}
