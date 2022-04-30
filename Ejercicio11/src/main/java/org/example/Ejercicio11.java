package org.example;

import java.lang.reflect.Array;
import java.util.*;

public class Ejercicio11 {

    public String askPhrase(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String givenPhrase = scanner.nextLine();
        return givenPhrase;
    }

    public String phraseToUpperCase(String givenPhrase){
        String phraseToUpperCase = givenPhrase.toUpperCase();
        return phraseToUpperCase;
    }

    public Integer givenPhraseLength(String givenPhrase){
        Integer givenPhraseLength = givenPhrase.length();
        return givenPhraseLength;
    }

    public Map containingVowels(String phraseToUpperCase) {
        Character[] allVowels = {'A', 'E', 'I', 'O', 'U'};

        Integer[] counter = {0,0,0,0,0};
        Map<Character, Integer> vowelMap = new HashMap<Character, Integer>();

        for (Integer i = 0; i < phraseToUpperCase.length(); i++) {
            switch (phraseToUpperCase.charAt(i)) {
                case 'A': {
                    counter[0]++;
                    vowelMap.put(allVowels[0], counter[0]);
                    break;
                }
                case 'E': {
                    counter[1]++;
                    vowelMap.put(allVowels[1], counter[1]);
                    break;
                }
                case 'I': {
                    counter[2]++;
                    vowelMap.put(allVowels[2], counter[2]);
                    break;
                }
                case 'O': {
                    counter[3]++;
                    vowelMap.put(allVowels[3], counter[3]);
                    break;
                }
                case 'U': {
                    counter[4]++;
                    vowelMap.put(allVowels[4], counter[4]);
                    break;
                }
            }
        }
        return vowelMap;
    }

    public static void main(String[] args) {
        Ejercicio11 ejercicio11 = new Ejercicio11();
        String givenPhrase = ejercicio11.askPhrase();
        String phraseToUpperCase = ejercicio11.phraseToUpperCase(givenPhrase);
        Integer givenPhraseLength = ejercicio11.givenPhraseLength(givenPhrase);
        System.out.println(givenPhraseLength);
        Map vowelMap = ejercicio11.containingVowels(phraseToUpperCase);
        System.out.println("Mapa de vocales: " + vowelMap);
    }
}
