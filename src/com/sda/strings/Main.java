package com.sda.strings;

public class Main {
    public static void main(String[] args) {
        //clasa String este imutabila = un obiect nu mai poate fi modificat
        String str1 = "Hello world!";

        char[] chars = {'s', 'a', 'l', 'u', 't', '!'};
        String s1 = new String(chars);
        System.out.println(s1);

        String s2 = new String(chars,0, chars.length -1);
        System.out.println(s2);

        //compara 2 siruri de caractere
        String nume1 = "Alexandra";
        String nume2 = "Gigel";
        System.out.println(nume1.compareTo(nume2));
        System.out.println(nume2.compareTo(nume1));
        //valoare negativa => ordine alfabetica crescatoare
        //valoare pozitiva => ordine alfabetica decrescatoare

        char a = 'A', g = 'G';
        System.out.println((byte)a + " " + (byte)g);
        System.out.println(a - g);
        System.out.println(g - a);

        //verificarea egalitatidintre 2 siruri de caractere
        String str2 = "Hello " +"world!";
        if (str1.equals(str2)) {
            System.out.println("Egale");
        } else {
            System.out.println("Diferite");
        }

        String s4 = "abc";
        String s5 = "abc";
        String s3 = new String("abc");
        System.out.println(s4 == s5);  // true
        System.out.println(s4 == s3);  // false


        //metode ale clasei String
        String exemplu = "Exemplu";

        int lungime = exemplu.length();
        System.out.println("lungime: " + lungime);

        int index = exemplu.indexOf("em");
        System.out.println("index \"em\": " + index);

        char caract = exemplu.charAt(index);
        System.out.println("caracterul de pe pozitia index: " + caract);

        String subsir1 = exemplu.substring(index);
        System.out.println("Subsir1; " + subsir1);

        String subsir2 = exemplu.substring(index, exemplu.length() - 1);
        System.out.println("Sub sir 2: " + subsir2);

        String low = exemplu.toLowerCase();
        System.out.println(low);
        String upper = exemplu.toUpperCase();
        System.out.println(upper);

        String concat = exemplu.concat(" siruri de caractere");
        System.out.println(concat);

        String replace = exemplu.replace('e', 'a');
        System.out.println(replace);

        boolean st = exemplu.startsWith("Ex");
        System.out.println(st ? "Exemplu inepe cu Ex" : "Exemplu nu incepe cu Ex");

        //modificati exemplu anterior sa nu tina cont de litere mari sau mici

        boolean st1 = exemplu.toLowerCase().startsWith("ex");
        System.out.println(st1 ? "Exemplu inepe cu ex" : "Exemplu nu incepe cu ex");

        String[] cuvinte = concat.split(" ");
        for (String cuvant : cuvinte) {
            System.out.println(cuvant);
        }

        //StringBuilder
        //permite modificari ale valorii sirului de caractere
        //eficient atunci cand sirurile de caract sufera modificari frecvente

        StringBuilder propozitie = new StringBuilder("Java este ");
        propozitie.append("un limbaj de programare ");
        propozitie.append("puternic ").append("si simplu ");
        System.out.println(propozitie);

        int index1 = propozitie.indexOf("puternic");
        propozitie.insert(index1, "orientat pe obiecte ");
        System.out.println(propozitie);

        index1 = propozitie.indexOf("puternic");
        propozitie.delete(index1, index1 + "puternic ".length());
        System.out.println(propozitie);



    }
}
