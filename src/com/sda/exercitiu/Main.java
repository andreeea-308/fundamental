package com.sda.exercitiu;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Creati o clasa pentru gestionarea studentilor dintr-o universitate.
        //Campurile:
        //- Nume
        //- Data nasterii
        //- Cod student (sa nu mai poata fi modificat dupa crearea studentului)
        //- Array cu notele obtinute in primul semestru
        //- Numarul total de studenti
        //Metodele:
        //- O metoda care sa ne intoarca numarul total de studenti
        //- O metoda care sa ne returneze media notelor pe primul semestru pentru fiecare student in parte
        //- O metoda care sa ne intoarca varsta studentului

        LocalDate ziuaDeliei = LocalDate.of(2000, 8, 03);
        LocalDate ziuaLuiAlex = LocalDate.of(2001, 9, 22);
        Studenti delia = new Studenti("Delia", ziuaDeliei, "85467", new double[]{5, 8, 6, 9, 4, 10});
        Studenti alex = new Studenti("Alex", ziuaLuiAlex, "54816", new double[]{5.5, 4, 8, 10});


        System.out.println("Numarul de studenti din clasa: " + Studenti.getNumberTotal());
        System.out.println("Media pe semestru I: " + delia.medieNotePrimuSemestru());
        System.out.println("Media pe semestru I: " + alex.medieNotePrimuSemestru());
        System.out.println("Varsta studentului: " + delia.varstaStudentului());
        System.out.println("Varsta studentului: " + alex.varstaStudentului());








    }
    static double sumaNotelor(double[]noteStudent) {
        double s = 0;
        for (double note :
        noteStudent) {
            s += note;
        }
        return s;

    }




}
