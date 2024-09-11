package com.sda.wrappers;

public class Main {
    public static void main(String[] args) {

        //
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Valori int" + minInt + " ; " + maxInt);

        //autoboxing
        float nrFloat1 = 7.19f;
        Float nrFloat2 = nrFloat1;
        Float nrFloat3 = 45.24f;
        System.out.println(nrFloat2);

        //compararere
        int comparare = nrFloat2.compareTo(nrFloat3);
        int comparare1 = nrFloat3.compareTo(nrFloat2);
        int comparare2 = nrFloat2.compareTo(nrFloat2);
        System.out.println(comparare);
        System.out.println(comparare1);
        System.out.println(comparare2);
        // -1 -> primu numar este mai mic
        // 1 -> primu numar este mai mare
        // 0 -> sunt egale

        //conversie explicita
        int nrInt = 29;
        long nrLong1 = nrInt;
        Long nrLong2 = (long)nrInt;
        System.out.println(nrLong2);

        //unboxing
        Double nrDouble =313.5;
        double nrDouble2 = nrDouble;
        long nrLong3 = nrDouble.longValue();
        System.out.println(nrDouble2);
        System.out.println(nrLong3);

        //wrapper -> siruri de caractere
        String nrDoubleStr = nrDouble.toString();
        String nrLongStr = nrLong2.toString();
        System.out.println(nrDoubleStr + " " + nrLongStr);

        //siruri de caractere -> wrapper
        String nrCaract = "123456";
        int nrInt2 = Integer.parseInt(nrCaract);
        System.out.println(nrInt2);


    }
}
