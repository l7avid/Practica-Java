package org.example;

public class OddEvenNumbers {

    static final int max = 100;
    int number;

    public OddEvenNumbers(int number1){
        this.number = number1;
    }

    public void EvenNumbers(){
        if (this.number %2 == 0){
            System.out.println(this.number + " is an even number");
        }
    }

    public void OddNumbers(){
        if (this.number %2 != 0){
            System.out.println(this.number + " is an odds number");
        }
    }

    public static void main(String[] args){
        int number1 = 1;
        while(number1<=max){
            OddEvenNumbers oddEvenNumbers = new OddEvenNumbers(number1);
            oddEvenNumbers.EvenNumbers();
            oddEvenNumbers.OddNumbers();
            number1++;
        }
    }
}
