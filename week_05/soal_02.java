// Programmer : Adam Rahmat Ilahi
// Friday, 08 April 2022
//
// soal:
//      Rancanglah program untuk menampilakan bilangan-bilangan NON PRIMA, 
//      mulai dari var_1 sampai var_2.
//

import java.util.Scanner;

public class soal_02 {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)){
            int var_01, var_02;

            System.out.print("PROGRAM PENAMPIL BILANGAN NON PRIMA\n");
            System.out.print("Input bilangan Awal  : ");
            var_01 = Input.nextInt();
            System.out.print("Input bilangan Akhir : ");
            var_02 = Input.nextInt();

            // proses menguji nilai
            if(var_01 >= var_02){
                System.out.println("Input awal tidak boleh lebih dari bilangan akhir.");
            }

            else if(var_01 <= 0 || var_02 <= 0){
                System.out.println("Input tidak boleh kurang atau sama dengan 0");
            }

            else{
                for(int a = 2; a <= )
            }
        }
    }
}
