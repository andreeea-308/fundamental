package com.sda.dateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class Main2 {
    public static void main(String[] args) {
        LocalDate andreea = LocalDate.of(2024, 8, 3);
        LocalDate teo = LocalDate.of(2024, 8, 30);
        LocalDate iulia = LocalDate.of(2024, 7, 11);
        LocalDate miruna = LocalDate.of(2024, 7, 9);
        LocalDate laura = LocalDate.of(2024, 9, 22);
        LocalDate valentina = LocalDate.of(2024, 6, 10);
        LocalDate alina = LocalDate.of(2024, 12, 18);
        LocalDate irina = LocalDate.of(2024, 6, 22);
        LocalDate geo = LocalDate.of(2024, 5, 16);
        Period period = Period.between(LocalDate.now(), andreea);
        Period period2 = Period.between(LocalDate.now(), teo);
        Period period3 = Period.between(LocalDate.now(), iulia);
        Period period4 = Period.between(LocalDate.now(), miruna);
        Period period5 = Period.between(LocalDate.now(), laura);
        Period period6 = Period.between(LocalDate.now(), valentina);
        Period period7 = Period.between(LocalDate.now(), alina);
        Period period8 = Period.between(LocalDate.now(), irina);
        Period period9 = Period.between(LocalDate.now(), geo);
        System.out.println("Atat a mai ramas pana la ziua Andreei: " + period);
        System.out.println("Atat a mai ramas pana la ziua Teodorei: " + period2);
        System.out.println("Atat a mai ramas pana la ziua Iuliei: " + period3);
        System.out.println("Atat a mai ramas pana la ziua Mirunei: " + period4);
        System.out.println("Atat a mai ramas pana la ziua Laurei: " + period5);
        System.out.println("Atat a mai ramas pana la ziua Valentina: " + period6);
        System.out.println("Atat a mai ramas pana la ziua Alinei: " + period7);
        System.out.println("Atat a mai ramas pana la ziua Irinei: " + period8);
        System.out.println("Atat a mai ramas pana la ziua Georgianei: " + period9);
    }
}
