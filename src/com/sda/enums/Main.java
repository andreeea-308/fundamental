package com.sda.enums;

public class Main {
    public static void main(String[] args) {
        ZiSaptamana zi = ZiSaptamana.DUMINICA;
        System.out.println(zi);

        String mesaj = switch (zi) {
            case LUNI -> "Astazi este luni";
            case MARTI -> "Astazi este marti";
            case MIERCURI -> "Astazi este miercuri";
            case JOI -> "Astazi este joi";
            case VINERI -> "Astazi este vineri";
            case SAMBATA -> "Astazi este sambata";
            case DUMINICA -> "Astazi este duminica";
        };

        System.out.println(mesaj);
    }
}
