// Programmer : Adam Rahmat Ilahi
// 13.2021.1.01030
// Monday, 9 May 2022
//
// Soal:
//      buatlah program untuk menentukan zodiak berdasarkan inputan 
//      berupa tanggal dan bulan.
//      

package week_09;
import java.util.Scanner;

public class Remidi_UTS{
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)){
            int tanggal, bulan;

            System.out.print("+-------------------------------------------------------------+\n"+
                             "|   Program penentu Zodiak berdasarkan input tanggal & bulan  |\n"+
                             "+-------------------------------------------------------------+\n");
            System.out.print("Tangal haruslah 1 - 31\n");
            System.out.print("Input Tanggal : ");
            tanggal = Input.nextInt();
            System.out.print("\n" + 
                            "+-----------------+----------------+\n" +
                            "|  1 = Januari    |  2 = Februari  |\n" + 
                            "|  3 = Maret      |  4 = April     |\n" + 
                            "|  5 = Mei        |  6 = Juni      |\n" + 
                            "|  7 = Juli       |  8 = Agustus   |\n" + 
                            "|  9 = September  |  10 = Oktober  |\n" + 
                            "|  11 = November  |  12 = Desember |\n" +
                            "+-----------------+----------------+\n" );
            System.out.print("Input bulan : ");
            bulan = Input.nextInt();

            // proses
            if(tanggal >= 20 && tanggal <= 31 && bulan == 1 || tanggal >= 1 && tanggal <= 18 && bulan == 2){
                System.out.print("\nZodiak : Aquarius");
            }

            else if(tanggal >= 19 && tanggal <= 31 && bulan == 2 || tanggal >= 1 && tanggal <= 20 && bulan == 3){
                System.out.print("\nZodiak : Pisces");
            }

            else if(tanggal >= 21 && tanggal <= 31 && bulan == 3 || tanggal >= 1 && tanggal <= 19 && bulan == 4){
                System.out.print("\nZodiak : Aries");
            }

            else if(tanggal >= 20 && tanggal <= 31 && bulan == 4 || tanggal >= 1 && tanggal <= 20 && bulan == 5){
                System.out.print("\nZodiak : Taurus");
            }

            else if(tanggal >= 21 && tanggal <= 31 && bulan == 5 || tanggal >= 1 && tanggal <= 18 && bulan == 6){
                System.out.print("\nZodiak : Gemini");
            }

            else if(tanggal >= 21 && tanggal <= 31 && bulan == 6 || tanggal >= 1 && tanggal <= 22 && bulan == 7){
                System.out.print("\nZodiak : Cancer");
            }

            else if(tanggal >= 23 && tanggal <= 31 && bulan == 7 || tanggal >= 1 && tanggal <= 22 && bulan == 8){
                System.out.print("\nZodiak : Leo");
            }

            else if(tanggal >= 23 && tanggal <= 31 && bulan == 8 || tanggal >= 1 && tanggal <= 22 && bulan == 9){
                System.out.print("\nZodiak : Virgo");
            }

            else if(tanggal >= 23 && tanggal <= 31 && bulan == 9 || tanggal >= 1 && tanggal <= 22 && bulan == 10){
                System.out.print("\nZodiak : Libra");
            }

            else if(tanggal >= 23 && tanggal <= 31 && bulan == 10 || tanggal >= 1 && tanggal <= 21 && bulan == 11){
                System.out.print("\nZodiak : Scorpion");
            }

            else if(tanggal >= 22 && tanggal <= 31 && bulan == 11 || tanggal >= 1 && tanggal <= 21 && bulan == 12){
                System.out.print("\nZodiak : Sagitarius");
            }

            else if(tanggal >= 22 && tanggal <= 31 && bulan == 12 || tanggal >= 1 && tanggal <= 19 && bulan == 1){
                System.out.print("\nZodiak : Capricorn");
            }

            else {
                System.out.print("Terjadi kesalahan periksa inputan\n");
            }
        }
    }
}