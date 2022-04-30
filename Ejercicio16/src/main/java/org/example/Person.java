package org.example;

import java.util.Locale;
import java.util.Random;

public class Person {

    private String name = "";
    private Integer age = 0;
    private String DNI;
    private Character gender = Character.MIN_VALUE;
    private Double weigth = 0.0;
    private Double heigth = 0.0;

    //Default constructor
    public Person(){
        this.name = "David";
        this.age = 17;
        this.DNI = generateAutoDNI();
    }

    //Name, age and gender constructor
    public Person(String name, Integer age, Character gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.DNI = generateAutoDNI();
    }

    //All parameters-receiving constructor
    public Person(String name, Integer age, Character gender, Double weigth, Double heigth){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this. weigth = weigth;
        this.heigth = heigth;
        this.DNI = generateAutoDNI();
    }

    public void calculateIMC(Double weigth, Double heigth){
        Double imcData = ((weigth)/Math.pow(heigth,2));
        Integer imcResult = 0;
        if (imcData < 20.0){
            imcResult = -1;
            System.out.println("You are underweight");
        }else if(imcData > 25.0){
            imcResult = 1;
            System.out.println("You are overweight");
        }else{
            imcResult = 0;
            System.out.println("You are healthy");
        }
    }

    public Boolean isAnAdult(Integer age){
        Boolean isAnAdult = false;
        if (age >= 18){
            isAnAdult = true;
        }else{
            isAnAdult = false;
        }
        return isAnAdult;
    }

    public Boolean genderValidation(Character gender){
        Boolean genderValidation = true;
        if (gender == 'H' || gender == 'F'){
            genderValidation = true;
        }else{
            this.gender = 'H';
            genderValidation = false;
        }
        return genderValidation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", DNI=" + DNI +
                ", gender=" + gender +
                ", weigth=" + weigth +
                ", heigth=" + heigth +
                '}';
    }

    private String generateAutoDNI(){
        Long randomNumber = Math.round(Math.random() * (100000000));
        Random randomChar = new Random();
        char charChoosen = (char) (randomChar.nextInt(26)+ 'a');
        Character classCharacterChoosen = Character.valueOf(charChoosen);
        String dniNumber = String.valueOf(randomNumber) + classCharacterChoosen;
        dniNumber = dniNumber.toUpperCase();
        return dniNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public void setHeigth(Double heigth) {
        this.heigth = heigth;
    }

    public void setWeigth(Double weigth) {
        this.weigth = weigth;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getDNI() {
        return DNI;
    }

    public Character getGender() {
        return gender;
    }

    public Double getHeight() {
        return heigth;
    }

    public Double getWeight() {
        return weigth;
    }
}
