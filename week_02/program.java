package week_02;

/*
 *  Programmer : Adam Rahmat Ilahi
 *  Thursday, 31 March 2022
 * 
 * Week_02 ALPRO 2 - Elemen Java
 */

public class program {
    public static void main(String[] args){
        // Tipe Data

        int Angka = 5;
        double angka = 6.4;
        char Huruf = 'A';
        String Kalimat = "Adam Rahmat ILahi";

        System.out.println("Angka bernilai   : "+Angka);
        System.out.println("angka bernilai   : "+angka);
        System.out.println("Huruf bernilai   : "+Huruf);
        System.out.println("Kalimat bernilai : "+Kalimat);

        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        // Aritmatik Operator

        int a, b, c;
        a = 7;
        b = 4;
        c = a + b;
        System.out.println(a+" + "+b+" = "+c);

        a = 8;
        b = 2;
        c = a - b;
        System.out.println(a+" - "+b+" = "+c);

        a = 3;
        b = 3;
        c = a * b;
        System.out.println(a+" x "+b+" = "+c);

        a = 9;
        b = 3;
        c = a / b;
        System.out.println(a+" / "+b+" = "+c);

        c = a % b;
        System.out.println(a+" % "+b+" = "+c);

        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        // Unary Operator

        a = 6;
        b = ++a;
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        a = 3;
        b = a++;
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        a = 20;
        b = --a;
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        a = 15;
        b = a--;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}