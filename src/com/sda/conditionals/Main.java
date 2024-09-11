package com.sda.conditionals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //if
        System.out.println("IF");

        double temp = 28;
        System.out.println("Temperatura este: " + temp);
        if (temp < 0) {
            System.out.println("Afara este frig");
        } else {
            System.out.println("Afara este potrivit");
        }

        if (temp < 0) {
            //ce se executa daca temp e <0
            System.out.println("Afara este frig");
        } else if (temp <= 15) {
            //ce se executa daca temp e >= 0, dar <= 15 => [0,15]
            System.out.println("Afara este potrivit");
        } else if (temp <= 28) {
            //ce se executa daca temp e > 15, dar <= 28 => (15,28]
            System.out.println("Afara este cald");
        } else {
            //ce se executa daca temp e > 28
            System.out.println("Afara este canicula");
        }

        //EXERCITIU:
        //verificati daca un nr e par sau impar
        //optional cititi de la tastatura numarul ce va fi verificat folosind Scanner
        //%2 - restu impartiri la 2
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Alege un numar: ");
        int a = scanner .nextInt();
        scanner.close();
        if (a%2 == 0) {
            System.out.println("Numarul este par");
        } else {
            System.out.println("Numarul este impar");
        }

        //SWITCH
        System.out.println("SWITCH:");
        int day = 6;

        switch (day) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Invalid day");

        }

        String  day2 = "Saturday";
        int dayNumber = switch (day2) {
            case "Monday" -> 1;
            case "Tuesday" -> 2;
            case "Wednesday" -> 3;
            case "Thursday" -> 4;
            case "Friday" -> 5;
            case "Saturday" -> 6;
            case "Sunday" -> 7;
            default -> 0;
        };
        System.out.println(dayNumber);


    }
}
