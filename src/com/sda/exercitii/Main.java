package com.sda.exercitii;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //EXERCITIUL 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        int numar = scanner.nextInt();
        int numar1 = scanner.nextInt();
        int numar2 = scanner.nextInt();
        int celsius = scanner.nextInt();
        int fahrenheit = scanner.nextInt();
        int[] array = new int[numar1];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        LocalTime localTime = LocalTime.of(numar1, numar2);
        String timeFormater = localTime.format(DateTimeFormatter.ofPattern("HH:m"));

        System.out.println(verificareaNumarului(numar));

        //EXERCITIUL 2
        System.out.println(verificareaParitate(numar));

        //EXERCITIUL 3
        System.out.println("Suma numerelor este: " + sumaNumerelor(numar, numar1, numar2));

        //EXERCITIUL 4
        System.out.println(timeOfDay(timeFormater));

        //EXERCITIUL 5
        Temperatura azi = new Temperatura(celsius, fahrenheit);
        System.out.println("Temperatura din Fahrenheit in Celsius este: " + celsius + " si " + azi.temperaturaCelsius());
        System.out.println("Temperatura din Celsius in Fahrenheit este: " + fahrenheit + " si " +  azi.temperaturaFahrenheit());

        //EXERCITIUL 6

        //EXERCITIUL 7
        System.out.println(factorial(numar2));

        //EXERCITIUL 8
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
        System.out.println("Numarul minim este: " + min);
        System.out.println("Numarul maxim este: " + max);

        //EXERCITIUL 9


        //EXERCITIUL 10
        Cerc a = new Cerc(5.4);
        System.out.println("Aria cercului: " + a.arieCerc());
        System.out.println("Petrimetrul cercului: " + a.petrimetruCerc());

        //EXERCITIUL 11
        Masina toyota = new Masina("Toyota", "C-HR", 2021, 120);
        Masina audi = new Masina("Audi", "A8", 2018, 98);
        System.out.println(toyota);
        System.out.println(audi);
        System.out.println(Masina.numberOfCars);
        System.out.println("Accelerem masina cu 50: " + toyota.accelerare(50));
        System.out.println("Reducem viteza cu 32: " + audi.decelerare(32));


    }

    static double verificareaNumarului (double a) {
        if (a<0) {
            System.out.println("Numarul "+ a +" este negativ.");
        } else if (a>0) {
            System.out.println("Numarul "+ a +" este pozitiv.");
        } else {
            System.out.println("Numarul "+ a +" este zero.");
        }
        return a;
    }

    static double verificareaParitate (double a) {
        if (a % 2 == 0) {
            System.out.println("Numarul " + a + " este par.");
        } else {
            System.out.println("Numarul " + a + " este impar.");
        }
        return a;
    }

    static int sumaNumerelor (int a, int b, int c) {
        return a+b+c;
    }

    static String timeOfDay (String time) {
        int time1 = 0;
        if ((5 <= time1) && (time1 < 12)) {
            System.out.println("Dimineata");
        } else if ((12 <= time1) && (time1 < 20)) {
            System.out.println("Zi");
        }else {
            System.out.println("Noapte");
        }
        return time = String.valueOf(time1);
    }

    static int factorial (int numar) {
        int sum = 1;
        for (int i = 1; i <= numar; i++) {
            sum = i * sum;
        }
        return sum;
    }


}
