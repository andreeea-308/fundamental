package com.sda.oop;

public class Main2 {
    public static void main(String[] args) {
        //exercitiu:
        //creati o metoda care sa ccalcueze varstelor tuturor cateilor -> metoda statica
        //media = suma varstelor / numar catei

        //
        Dog anubis = new Dog("Anubis", "Rottweiler", "Negru", 2, 55.3, true);
        System.out.println(anubis);
        Dog snow = new Dog("Snow", "Bichon", "alb", 7, 20.5, true);
        System.out.println(snow);
        Dog obelix = new Dog("Obelix", "Beagle", "alb, maro, negru si cream", 5, 40, true);
        System.out.println(obelix);

        Dog.printNumberOfDogs();
        Dog.printSumaVarstelor();
        System.out.println(Dog.mediaVarstelor());

        if (Dog.mediaVarstelor()
                > Dog.LIFE_EXPECTENCY) {
            System.out.println("Media varstei > speranta vietii");
        } else {
            System.out.println("Media varstei < speranta vietii");
        }
        System.out.println(Dog.LIFE_EXPECTENCY);


    }
}
