package com.sda.arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declarare + initializare
        int[] numere;
        numere = new int[3];

        System.out.println(numere[0] + " " + numere[1] + " " + numere[2]);

        long[] num2 = new long[4];
        boolean[] arrb = new boolean[5];

        System.out.println(arrb[0]);

        int[] num3 = {10,20,30,40,50};
        float[] num4 = new float[]{1f,2f,3f};

        System.out.println(num3[2]);
        System.out.println(num4[1]);

        //modificare element
        numere[1] = 7;
        System.out.println(numere[0] + " " + numere[1] + " " + numere[2]);

        //parcurgeri
        System.out.println("Parcurgere cu FOR:");
        for (int i = 0; i < num4.length; i++) {
            System.out.print(num4[i] + " ");
        }
        System.out.println();

        System.out.println("Parcurgere FOREACH;");
        for (boolean elem :
                arrb) {
            System.out.print(elem + " ");
        }
        System.out.println();

        //array String
        String[] numePersoane =new String[4];
        numePersoane[0] = "Giovani";
        numePersoane[1] = "Adrian";
        numePersoane[2] = "Cristi";
        numePersoane[3] = "Tudor";

        String[] names = {"Sorana", "Andreea", "Bianca", "Elena", "Adina", "Izabela"};

        for (String name :
                numePersoane) {
            System.out.println(name);
        }
        System.out.println("Lungimea arrayului names " + names.length);

        System.out.println(names[0] + " " + names[1] + " " + names[2] + " " + names[3] + " " + names[4] + " " + names[5]);

        //1. ne creeam un obiect Scanner
        //2. introducem + citim dimensiunea array-ului
        //3. ne creeam un array de dim citita
        //4. parcurgerea array-ului si citirea elem in parte
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti dimensiunea: ");
        int n = scanner.nextInt();

        char[] array = new char[n];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduceti valoarea elementului de pe pozitia " + i + ": ");
            array[i] = scanner.next().charAt(0);
        }
        scanner.close();

        System.out.println("Array-ul citit este: ");
        for (char element :
                array) {
            System.out.println(element);
        }
        System.out.println("EXERCITIU:");
        //calculati suma elem unui array
        int[] num5 = {5,6,7,5,9,5,1};
        int s = 0;
        for (int i = 0; i < num5.length; i++) {
            s = s + num5[i];
        }
        System.out.println("Suma elementelor este: " + s);

        //Array bidimensionale
        System.out.println("Array bidimensionale");
        //declarare + initializare
        double[][] matrice = new double[2][3];

        int[][] matrice2 = {{1,2},{3,4,5},{6,7,8,9}};

        //accesare si modificari elem pe o pozitie
        matrice[0][1] = 5.5;

        //parcurgere FOR
        System.out.println("Parcurgere FOR");
        for (int i = 0; i < matrice2.length; i++) {
            for (int j = 0; j < matrice2[i].length; j++) {
                System.out.print(matrice2[i][j] + " ");
            }
            System.out.println();
        }
        //parcurgere FOREACH
        System.out.println("Parcurgere FOREACH");
        for (int[] rand :
                matrice2){
            for (int element :
                    rand) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}
