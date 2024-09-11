package com.sda.oop;

public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog();
        System.out.println(rex);

        Dog max = new Dog("Max", "ciobanesc german", "maro si cream", 3, 50.5, true);
        System.out.println(max);
        Dog mia = new Dog("Mia");
        System.out.println(mia);

        //accesarea membrilor
//        rex.name = "Rex";
//        System.out.println(rex.name);
        rex.bark();
        mia.bark();

        rex.setName("Rex");
        rex.setAge(-5);
        rex.setSize(-30);
        System.out.println(rex.getName() + "; " + rex.getAge() + "; " + rex.getSize());

        //acesarea campului static -> folosind numele clasei
        //nu avem nevoie de o instanta a clasei pt a aplema campurile clasei
        System.out.println("Numarul de catei = " + Dog.numberOfDogs);

        Dog.printNumberOfDogs();

        //2 variabile care refere aceiasi zona de memorie
        Dog charlie = max;
        System.out.println(charlie);
        charlie.setName("Charlie");
        System.out.println("Charlie: " + charlie);
        System.out.println("Max: " + max);
        //ambele variabile refera acelasi obiect

        //variabile constante
        final double freezingTemp = 0;
        //freezingTemp = -1;
        System.out.println(freezingTemp);

    }
}
