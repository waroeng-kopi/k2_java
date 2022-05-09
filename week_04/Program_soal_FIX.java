package week_04;

import java.util.Scanner;

public class Program_soal_FIX{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Pilihan : ");
            System.out.println("A. TVRI");
            System.out.println("B. RCTI");
            System.out.println("C. SCTV");
            System.out.println("D. ANTV");
            System.out.println("E. TRANSTV");
            System.out.println("F. METROTV");
            System.out.print("Masukkan Pilihan : ");
            
            char pilihan = input.next().charAt(0);
            System.out.println("======================");

            switch(pilihan){
                case 'A' :
                    System.out.println("Masukkan Pilihan : TVRI");
                    break;
                case 'B' :
                    System.out.println("Masukkan Pilihan : RCTI");
                    break;
                case 'C' :
                    System.out.println("Masukkan Pilihan :SCTV");
                    break;
                case 'D' :
                    System.out.println("Masukkan Pilihan :ANTV");
                    break;
                case 'E' :
                    System.out.println("Masukkan Pilihan :TRANSTV");
                    break;
                case 'F' :
                    System.out.println("Masukkan Pilihan :METROTV");
                    break;
                default :
                    System.out.print("Salah Pilih ! ");
            }
        }   
    }
}