package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio13 {

    public Date currentDate(){
        Date currentDate = new Date();
        return currentDate;
    }

    public String formattedDate(Date currentDate){
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String formattedDate = formatDate.format(currentDate);
        return formattedDate;
    }

    public static void main(String[] args) {
        Ejercicio13 ejercicio13 = new Ejercicio13();
        Date currentDate = ejercicio13.currentDate();
        String formattedDate = ejercicio13.formattedDate(currentDate);
        System.out.println(formattedDate);
    }
}
