package org.example;

public class Test {

    static Character[] allVowels = {'a', 'e','i','o','u'};
    static Integer[] counter = {0,0,0,0,0};

    public static void main(String[] args) {
        System.out.println(allVowels[0].getClass());
        counter[0] = counter[0] + 1;
        System.out.println(counter[0]);
    }
}
