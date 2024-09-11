package com.sda.oop;

public class Dog {
    //variabile de instanta care rep campurile clasei dog sau starea
    private String name;
    private String bread;
    private String color;
    private int age;
    private double size;
    private boolean happy;
    public static int numberOfDogs = 0;//static = camp
    public static int sumaVarstelor = 0;
    public static double mediaVarstelor =0;
    public static final int LIFE_EXPECTENCY = 17;




    //constructori - metode speciale care nu au un tip de returnare si ne ajuta sa cream obiecte
    //             - numele constructorului corespunde cu numele clasei
    // this - instanta curenta

    public Dog() {
        this.name = "No name";
        this.bread = "maidanez";
        numberOfDogs++;
        sumaVarstelor += age;
    }

    public Dog(String name) {
//        this.name = name;
//        this.bread = "maidanez";
//        this.color = "N/A";
//        this.age = 1;
//        this.size = 30;
//        this.happy = true;

        this(name, "maidanez", "N/A", 1, 30, true);
    }
    // conscructori cu toti parametrii
    public Dog(String name, String bread, String color, int age, double size, boolean happy) {
        this.name = name;
        this.bread = bread;
        this.color = color;
        this.age = age;
        this.size = size;
        this.happy = happy;
        numberOfDogs++;
        sumaVarstelor += age;

    }

    // TEMA: verificari in settari a.i. age si size sa nu ia valori negative
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Introduce valoare pozitiva: ");
        } else {
            sumaVarstelor += age;
            this.age = age;


        }
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if (size > 0) {
            this.size = size;
        } else {
            System.out.println("Marimea nu este valida!");
        }
    }

    public boolean isHappy() {
        return happy;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }

    public void bark() {
        System.out.println(name + " latra: Ham! Ham!");

    }

    //intr-un context static nu putem accesa metode nonstatice sau campuri
    public static void printNumberOfDogs() {
        System.out.println("Numarul total de obiecte ale clasei dog = " + Dog.numberOfDogs);
    }
    public static void printSumaVarstelor() {
        System.out.println("Suma varstelor = " + Dog.sumaVarstelor);
    }
    public static double mediaVarstelor() {
        mediaVarstelor = sumaVarstelor/numberOfDogs;
        return mediaVarstelor;
    }


    //metoda suprascrisa (nu se confunda cu supraincarcare)
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", size=" + size +
                ", happy=" + happy +
                '}';
    }
}
