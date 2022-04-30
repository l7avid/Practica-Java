package org.example;

import java.util.Scanner;
import java.util.Stack;

public class Ejercicio12 {

    static Stack<Character> stackDiferences = new Stack<>();

    public StringBuilder askFirstWord(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word: ");
        StringBuilder firstGivenWord = new StringBuilder(scanner.nextLine());
        return firstGivenWord;
    }

    public StringBuilder askSecondWord(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter second word: ");
        StringBuilder secondGivenWord = new StringBuilder(scanner.nextLine());
        return secondGivenWord;
    }

    public Integer greatLength(StringBuilder firstGivenWord, StringBuilder secondGivenWord){
        Integer lengthDifference = firstGivenWord.length() - secondGivenWord.length();
        return lengthDifference;
    }

    public Stack<Character> pushDifferences(Character charPhrase){
        stackDiferences.push(charPhrase);
        return stackDiferences;
    }

    public StringBuilder getGreaterLength(StringBuilder firstGivenWord, StringBuilder secondGivenWord,
                                             Integer lengthDifference){

        StringBuilder greaterWord = new StringBuilder();


        if(lengthDifference > 0) {
            greaterWord = firstGivenWord;

        }else if(lengthDifference < 0){
            greaterWord = secondGivenWord;

        }else{
            greaterWord = firstGivenWord;

        }

        return greaterWord;
    }

    public void setLengths(StringBuilder firstGivenWord, StringBuilder secondGivenWord, Integer greaterLength){
        firstGivenWord.setLength(greaterLength);
        secondGivenWord.setLength(greaterLength);
    }

    public void getDifferences(StringBuilder firstGivenWord, StringBuilder secondGivenWord, StringBuilder greaterWord){

        setLengths(firstGivenWord, secondGivenWord,greaterWord.length());

        for (Integer i = 0; i < greaterWord.length(); i++) {

            if ((firstGivenWord.charAt(i) != secondGivenWord.charAt(i))) {
                pushDifferences(greaterWord.charAt(i));
            }
        }

    }

    public static void main(String[] args) {

        Ejercicio12 ejercicio12 = new Ejercicio12();
        StringBuilder firstGivenWord = ejercicio12.askFirstWord();
        StringBuilder secondGivenWord = ejercicio12.askSecondWord();
        Integer greatLength = ejercicio12.greatLength(firstGivenWord, secondGivenWord);
        StringBuilder greaterWord = ejercicio12.getGreaterLength(firstGivenWord, secondGivenWord, greatLength);
        ejercicio12.getDifferences(firstGivenWord, secondGivenWord, greaterWord);
        System.out.println(stackDiferences);
    }
}
