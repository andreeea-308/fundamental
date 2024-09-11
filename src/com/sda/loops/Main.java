package com.sda.loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //FOR
        System.out.println("FOR:");
        for (int i = 1; i <=5; i++) {
            System.out.println(i);
        }

        //WHILE
        System.out.println("WHILE");
        int y = 1;
        while (y <=5) {
            System.out.println(y);
            y++;
        }

        //DO-WHILE
        System.out.println("DO-WHILE");
        y = 0;
        do {
            System.out.println(y);
            y++;
        } while (y <= 5);

        //EXERCITIU
        //sa se afiseze toate numerele pana la un nr citit de tastatura
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce numar: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println("FOR");
        System.out.println("Crescator");
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
        System.out.println("Descrescator");
        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("Din 2 in 2");
        for (int i = 0; i <= num; i+=2) {
            System.out.println(i);
        }

        System.out.println("WHILE");
        int i = 0;
        while (i <= num) {
            System.out.println(i);
            i++;
        }
        //afisam de 5 ori *
        System.out.println("Numar necunoscut de pasi");
        boolean afisam = true;
        int nrafisari = 0;
        while (afisam) {
            System.out.println("*");
            nrafisari++;
            if (nrafisari >= 5) {
                afisam = false;
            }

        }
        System.out.println("DO-WHILE");
        i=0;
        do {
            System.out.println(i);
            i++;
        } while (i <= num);

        //sa extrajem primu nr divizibil cu 3 dintr-un interval [7, 25]
        System.out.println("BREAK");
        int minnr = 7, maxnr = 25, nrextras = 0;
        for (int j = minnr; j <= maxnr; j++) {
            if (j% 3 == 0) {
                nrextras = j;
                break;
            }
        }
        System.out.println("Primu nr divizibil cu 3: " + nrextras);

        int j = minnr;
        while (j <= maxnr) {
            if (j% 3 == 0) {
                nrextras = j;
                break;
            }
            j++;
        }
        System.out.println("Primu nr divizibil cu 3: " + nrextras);

        System.out.println("CONTINUE");
        // sa extragem toate nr div cu 5
        for (int k = minnr; k <= maxnr; k++) {
            if (k %5 != 0) {
                continue; //sare peste iteratia curenta
            }
            System.out.println(k);
        }
        System.out.println("Exercitiu");
        int k = minnr - 1;
        while (k <= maxnr) {
            k++;
            if (k% 5 != 0) {
                continue;
            }
            System.out.println(k);
        }

    }
}
