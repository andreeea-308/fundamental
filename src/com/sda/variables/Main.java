package com.sda.variables;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String firstName;
        firstName = "Andreea";
        System.out.println(firstName);

        String javaIsCool = "Java is cool";
        System.out.println(javaIsCool);

        System.out.println(firstName + " considera ca " + javaIsCool);


        byte numarByte = 10;
        System.out.println(numarByte);

        short numarShort = 100;
        System.out.println(numarShort);

        int numarInt = -100;
        System.out.println(numarInt);

        long numarLong = 1234567890;
        long numarLong2 = 12345678901L;
        long numarLong3 = 124_567_445_532_123_9071L;
        System.out.println(numarLong);
        System.out.println(numarLong2);
        System.out.println(numarLong3);

        float numarFloat = 3.14F;
        System.out.println(numarFloat);

        double numarDouble = 3.14;
        System.out.println(numarDouble);

        boolean isColdOutside = false;
        System.out.println(isColdOutside);
        //de completat cum afisam "E frig afara"
        String temp = (isColdOutside) ? "E frig afara" : "E cald afara" ;
        System.out.println(temp);

        char a = 'a';
        char b = 98; //codu ASCII sau codu unicod
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+""+b);

        char symbol = '\u0000';
        System.out.println("Temperratura este de -1" + symbol + "C");

        double temperatura = 25.7;
        System.out.printf("%.3f \n", temperatura);

        System.out.printf("Temperatura este de %.1f%c C\n", temperatura, symbol);


        Scanner scanner = new Scanner(System.in);

        System.out.printf("Introduceti un numar intreg: ");
        int numarCitit1 = scanner .nextInt();
        System.out.println("Numaru citit este " + numarCitit1);

        System.out.printf("Introduceti un numar real: ");
        int numarCitit2 = scanner .nextInt();
        System.out.println("Numaru citit este " + numarCitit2);

        System.out.printf("Introduceti un text: ");
        int text = scanner .nextInt();
        System.out.println("Textul citit este " + text);

        scanner.close();



    }
}
