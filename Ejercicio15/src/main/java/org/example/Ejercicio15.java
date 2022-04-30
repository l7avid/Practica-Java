package org.example;

import java.security.interfaces.ECKey;
import java.util.Scanner;

public class Ejercicio15 {

    public void renderMenu() {

        while (true) {
            System.out.println("****** GESTION CINEMATOGRAFICA ********\n" +
                    "1-NUEVO ACTOR\n" +
                    "2-BUSCAR ACTOR\n" +
                    "3-ELIMINAR ACTOR\n" +
                    "4-MODIFICAR ACTOR\n" +
                    "5-VER TODOS LOS ACTORES\n" +
                    "6-VER PELICULAS DE LOS ACTORES\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8-SALIR\n");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an option: ");
            Integer givenOption = scanner.nextInt();

            switch (givenOption) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    renderMenu();
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Invalid option\n");
            }
        }
    }

    public static void main(String[] args) {
        Ejercicio15 ejercicio15 = new Ejercicio15();
        ejercicio15.renderMenu();

    }
}
