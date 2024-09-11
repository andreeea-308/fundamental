package com.sda.convertions;

public class Main {
    public static void main(String[] args) {

        System.out.println("Conversii implicite: ");
        System.out.println("byte->short");
        byte numarByte1 = 55 ;
        short numarShort1 = numarByte1;
        System.out.println(numarByte1 + " " + numarShort1);

        System.out.println("int->long");
        int numarInt2 = 7110;
        long numarLong2 = numarInt2;
        System.out.println(numarLong2 + " " + numarInt2);

        System.out.println("float->double");
        float float3 = 3.14F;
        double double3 = float3;
        System.out.println(float3 + " " + double3);
        System.out.printf("%.2f %.2f", float3, double3);
        System.out.println();

        System.out.println("char->int");
        char caracter4 = '6';
        int caracter4code =caracter4;
        System.out.println(caracter4 + " " + caracter4code);

        System.out.println("Pierderi:");
        System.out.println("int->float");
        int int5 = 123456789;
        float float5 = int5;
        System.out.println(int5 + " " + float5);
        System.out.printf("%d %.2f \n", int5, float5);

        System.out.println("long->float");
        long long6 = 123456789012345L;
        float float6 = long6;
        System.out.println(long6 + " " + float6);
        System.out.printf("%d %.2f \n", long6, float6);

        System.out.println("long->doube");
        long long7 = 1234567890123456789L;
        double double7 = long7;
        System.out.println(long7 + " " + double7);
        System.out.printf("%d %.2f \n", long7, double7);

        System.out.println("\n");
        System.out.println("Conversii explicite: ");

        System.out.println("long->int");
        long long8 = 123456789L;
        int int8 = (int) long8;
        System.out.println(long8 + " " + int8);

        System.out.println("double->float");
        double double9 = 4567.3216546565378;
        float float9 = (float) double9;
        System.out.println(double9 + " " + float9);

        System.out.println("int->byte");
        int int10 =200;
        byte byte10 = (byte) int10;
        System.out.println(int10 + " " + byte10);

        //byte= -128,127
        //200-128=72
        //72-128=-56


    }
}
