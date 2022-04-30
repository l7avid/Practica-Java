package org.example;

public class Ejercicio01 {

    public float num1 = 1;
    public float num2 = 2;

    public void compareNumbers(){
        if (num1 == num2){
            System.out.println("Los números son iguales");
        }
        else if(num1 > num2){
            System.out.println("El número 1 es mayor que el número 2");
        }
        else{
            System.out.println("El número 2 es mayor que el número 1");
        }
    }
}

