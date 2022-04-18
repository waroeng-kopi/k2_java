// Programmer : Adam Rahmat Ilahi
// Monday, 18 April 2022
// 
// Soal :
//          Rancanglah program java untuk menginputkan nilai UTS, UAS, dan nilai tugas mhs (sebanyak n mhs)
//      Kemudian hitung nilai rata-rata tiap mhs.
//

package week_07;

import java.util.Scanner;

public class soal_01 {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)){
            float[] UTS, UAS, NIlAI_TUGAS, RATA_RATA;
            int input;

            System.out.print("Program Penghitung Nilai Rata-Rata mhs\n");
            System.out.print("Jumlah mhs : ");
            input = Input.nextInt();

            UTS = new float[input];
            UAS = new float[input];
            NIlAI_TUGAS = new float[input];
            RATA_RATA = new float[input];

            for(int a = 0; a < input; a++){
                System.out.print("mhs ke-" + (a+1) + " : \n");
                System.out.print("UTS : ");
                UTS[a] = Input.nextInt();
                System.out.print("UAS : ");
                UAS[a] = Input.nextInt();
                System.out.print("Nilai Tugas : ");
                NIlAI_TUGAS[a] = Input.nextInt();

                RATA_RATA[a] = (UTS[a] + UAS[a] + NIlAI_TUGAS[a]) / 3;
            }

            for(int b = 0; b < input; b++){
                System.out.print("mhs ke-" + (b+1) + " : \n");
                System.out.print("Nilai rata-rata : " + RATA_RATA[b] + "\n");
            }
        }
    }
}