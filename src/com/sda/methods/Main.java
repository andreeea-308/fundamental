package com.sda.methods;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//        System.out.println("Hello, Andreea!");
//        System.out.println("Hello, Adrian!");
//        System.out.println("Hello, Sorana!");
//        System.out.println("Hello, Alexandra!");

        //apelu metodei
        afisareMesaj( "Alexandra");
        String nume1 = "Tudor";
        afisareMesaj(nume1);

          int a =10;
          double b = 5.5;
//        double sum = a + b;
//        System.out.println(sum);
          int c = 3;
//        sum = sum + c;
//        System.out.println(sum);

        System.out.println("Suma numerelor a + b: " + sumaNumerelor(a,b));
        System.out.println("Suma numerelor a + b + c: " + sumaNumerelor(c,sumaNumerelor(a,b)));
        System.out.println("Suma numerelor a + b + c: " + sumaNumerelor(a,b,c));
        System.out.println("Suma numerelor a + c: " + sumaNumerelor(a,c));

        double[] numerearray = {1,2,3,4,5};
        System.out.println("Suma numerelor unui array-ului: " + sumaNumerelor(numerearray));
        System.out.println(sumaNumerelor(1,2,3,4));
        System.out.println(sumaNumerelor(1,2,3,4,5,6));
        System.out.println(sumaNumerelor("Suma este = ",10,20,30));
//creati o metoda noua medianumerelor care sa calculeze media numerelor folosinduva de metoda sumaNumerelor
        System.out.println();
        System.out.println("EXERCITIU");
        System.out.println(sumaMediilor(1,2,3,4,5,6,7));


    }
    //declararea unei metode = modificator acces + tip returnat + nume metode + parametri
    //modificatori de acces - public, private, protected, default
    //tip returnat - void(nu se returneaza o valoare);
    //             - tipuri de data(int, float, double, String, arrays, clasa, etc)
    //parametri unei metode - valorile primite de metoda
    static void afisareMesaj (String nume) {
        System.out.println("Hello, " + nume + "!");
    }
    static double sumaNumerelor (int a, double b) {
        //double sum = a + b
        // return sum
        return a + b;
    }

    //suprincarcarea metodei sumaNumerelor - o metoda cu acelasi nume dar cu nr sau tip de parametri diferiti
    static double sumaNumerelor (int x, double y, int z) {
        return x + y + z;
    }
    static int sumaNumerelor (int i, int j) {
        return i + j;
    }
    static double sumaNumerelor (double[]numere) {
        double s = 0;
        for (double numar :
                numere) {
            s += numar;
        }
        return s;
    }

    //varargs
    static double sumaNumerelor (int... args) {
        double s = 0;
        for (double numar :
                args) {
            s += numar;
        }
        return s;
    }

    static String sumaNumerelor (String mesaj, int... args) {
        double s = 0;
        for (double numar :
                args) {
            s += numar;
        }
        return mesaj + " " + s;
    }

   static double sumaMediilor (double... numere){
        return sumaNumerelor(numere)/numere.length;
    }

}
