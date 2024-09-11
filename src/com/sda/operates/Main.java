package com.sda.operates;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //a+b =>rep o expresie

        //operatori unaro(are un singur operand)
        //aratam daca este pozitiv sau negativ
        System.out.println("operatori unaro(are un singur operand)");
        System.out.println("aratam daca este pozitiv sau negativ");

        //-a, +a
        System.out.println("-a, +a");
        System.out.println(-5);
        System.out.println(+5);

        //!a
        System.out.println("!a");
        boolean iscold = true;
        System.out.println(!iscold);

        // post-incrementare: a++ (a++<=>a=a+1)
        System.out.println("post-incrementare: a++ (a++<=>a=a+1)");
        int numar =7;
        System.out.println("Post incrementare: " +numar++);
        System.out.println("Dupa post incrementare:" + numar);
        // post-decrementare: a--
        System.out.println("post-decrementare: a--");
        System.out.println("post decrementare: " + numar--);
        System.out.println("Dupa post decrementare:" + numar);
        // pre-incrementare: ++a (++a<=>a=a+1)
        System.out.println("pre-incrementare: ++a (++a<=>a=a+1)");
        int numar1 =7;
        System.out.println("Pre incrementare: " + ++numar1);
        System.out.println("Dupa pre incrementare:" + numar1);
        // pre-decrementare: --a
        System.out.println("pre-decrementare: --a");
        System.out.println("pre decrementare: " + --numar1);
        System.out.println("Dupa pre decrementare:" + numar1);


        //operatori binari(au 2 operanzi)
        System.out.println("operatori binari(au 2 operanzi");
        //aritmetice: +, -, *, /, %(restul impartirii)
        System.out.println("aritmetice: +, -, *, /, %");
        System.out.println((7+5*2)%2);
        //comparatie: <, >, <=, >=, ==, !=
        System.out.println("comparatie: <, >, <=, >=, ==, !=");
        int a = 7, b = 10;
        boolean isTrue = a > b;
        System.out.println(isTrue);

        //atribuire: =, +=, -=, *=, /=, %=
        System.out.println("atribuire: =, +=, -=, *=, /=, %=");
        b += 2; //(b=b+2)
        System.out.println(b);
        //logici: &&(si), ||(sau)
        System.out.println("logici: &&(si), ||(sau)");
        boolean isTrue2 = isTrue && (3 != 10);

        boolean isTrue3 =(7 == 6) || (3 != 10);
        System.out.println(isTrue2 + " " + isTrue3);
        //biti: &, |, ^(xor), >>, >>>, <<
        System.out.println("biti: &, |, ^(xor), >>, >>>, <<");
        int c = 5;
        int d = 7;
        System.out.println("c&d = " + (c & d));
        System.out.println("c|d = " + (c | d));
        System.out.println("c^d = " + (c ^ d));
        System.out.println("~c = " + ~c);
        c &= d;
        System.out.println("c= " + c);

        String binary[]={
                "0000","0001","0010","0011","0100","0101",
                "0110","0111","1000","1001","1010",
                "1011","1100","1101","1110","1111"
        };

        int a1=3; // 0+2+1 or 0011 in binary
        int b1=6; // 4+2+0 or 0110 in binary

        // bitwise or |
        int c1= a1 | b1;

        // bitwise and &
        int d1= a1 & b1;

        // bitwise xor ^
        int e1= a1 ^ b1;

        // bitwise not ~
        int f1= (~a1 & b1)|(a1 &~b1);
        int g1= ~a1 & 0x0f;


        System.out.println(" a1= "+binary[a1]);
        System.out.println(" b1= "+binary[b1]);
        System.out.println(" a1|b1= "+binary[c1]);
        System.out.println(" a1&b1= "+binary[d1]);
        System.out.println(" a1^b1= "+binary[e1]);
        System.out.println("~a1 & b1|a1&~b1= "+binary[f1]);
        System.out.println("~a1= "+binary[g1]);


        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("Bitwise AND: " + (num1 & num2));
        System.out.println("Bitwise OR: " + (num1 | num2));
        System.out.println("Bitwise XOR: " + (num1 ^ num2));
        System.out.println("Bitwise NOT: " + (~num1));
        System.out.println("Bitwise Left Shift: " + (num1 << 2));
        System.out.println("Bitwise Right Shift: " + (num1 >> 2));
        System.out.println("Bitwise Unsigned Right Shift: " + (num1 >>> 2));
        input.close();

        // << - deplasare pe biti la stanga
        System.out.println("<< - deplasare pe biti la stanga");
        int num3 = 2;
        num3 = num3 << 2; //deplasare cu 2 biti la stanga
        System.out.println("Deplasare cu 2 biti la stanga: " + num3);
        //eliminam 2 biti de la stanga si adaugam 0 la dreapta

        //>>> - deplasare pe biti la dreapta fara semn
        System.out.println(">>> - deplasare pe biti la dreapta");
        System.out.println("Deplasare cu 2 biti la stanga: " + (num3 >>> 2));

        //>> - deplasare pe biti la dreapta cu sumn
        num3 = -8;
        System.out.println("deplasare pe biti la dreapta cu semn: " + (num3 >> 2));

        //operatorul ternar(are 3 operatori)
        System.out.println("operatorul ternar(are 3 operatori)");
        double num = 10;
        String isHigherThan30 = (num > 30) ? "conditia este adevarata" : "conditia este falsa" ;
        System.out.println("Este adevarata conditia?" + isHigherThan30);

        double val = 25;
        double r = (val > 10 && val < 20) ? (val /=5) : (val /= 3);
        System.out.printf("%0.2f\n" ,r);

        //ordinea operatorilor
        //1.
        boolean isValid = ( 5 + 2 ) * 2 > 10 && (7 != 3);
        //= (8 + 2 > 10) && true => 16>10 && true => true && true
        System.out.println(isValid);

        //2.
        int x = 6;
        int res = 2*(++x) + (x--) + 1;
        //2*6+(x--)+1
        //x devine 6+1 =7
        //2*6+7+1
        //12 + 7 + 1 = 20
        System.out.println("Rezultatul este: " + res + ", iar valoarea lui x = " + x);

        //3.
        int y = 3, z = 8;
        res = ++x + y-- + z/2;
        //7 + y-- +z/2
        //7 + 3 + 8/2
        // x=7, y=3
        //7+3+4=14
        System.out.println(res + ", x = " + x + ", y = " + y + ", z = " + z);
    }
}
