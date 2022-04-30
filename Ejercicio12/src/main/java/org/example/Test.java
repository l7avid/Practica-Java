package org.example;

import java.util.*;

public class Test {

    static Stack<Character> charecters = new Stack<>();
    static Map<Integer, StringBuilder> processedData = new HashMap<Integer, StringBuilder>();
    static StringBuilder name1 = new StringBuilder("David");



    public static void main(String[] args) {

        processedData.put(1, name1);
        System.out.println(processedData);
        System.out.println(processedData.get(1));
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        StringBuilder name = new StringBuilder(scanner.nextLine());
        System.out.println(name);*/


        /*
        charecters.push('a');
        charecters.push('e');
        charecters.push('i');
        charecters.push('o');
        charecters.push('u');

        System.out.println(charecters);

        */

        /* StringBuilder word = new StringBuilder("Hola");
        word.setLength(5);
        System.out.println(word);
        System.out.println(word.charAt(4));

         */



    }
}
