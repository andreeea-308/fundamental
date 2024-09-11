package com.sda.statics;


import static com.sda.oop.Dog.LIFE_EXPECTENCY;
import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {
        //creati o metoda care sa calculeze aria unui cerc
        // PI * R^2
        double r = 5D;
        System.out.println(aria(r));

        double random = Math.random();
        System.out.println("nr random = " + random);
        System.out.println("nr random * 100 = " + random * 100);

        //interval
        int min = 1;
        int max = 6;
        double zar = (int)(Math.random() * (max - min) + min);
        System.out.println(zar);

        System.out.println(LIFE_EXPECTENCY);

    }

    public static double aria (double r) {
        return PI * Math.pow(r, 2);
    }
}
