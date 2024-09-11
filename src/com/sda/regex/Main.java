package com.sda.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        //1.sa extragem toate numerele din cadru unui text
        String text1 = "Astazi este 14 ianuarie (01), anu 2024, iar temperatura este de 2 grade celsius";
        // \d+
        String regex1 = "\\d+";

        Pattern pattern1 = Pattern.compile(regex1);//transformam Stringul in regex
        Matcher matcher1 = pattern1.matcher(text1);//cream obiectul matcher pe baza lui pattern 1 si a textului ce va fi verificat

        while (matcher1.find()) {//cat timp gasestee in text 1 secv de caract care se prtrivesc paternul
            System.out.println(matcher1.group());
        }

    }
}
