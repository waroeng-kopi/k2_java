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
            int var_01, var_02,pengalih;

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
                System.out.println("Bilangan Non Prima : ");
                for(int awal = var_01; awal <= var_02; awal++){     // untuk membuat loop dari var_01 -> var_02
                    // untuk proses pengujian
                    pengalih = 0;

                    for(int uji = 1; uji <= awal; uji++){            // untuk membuat loop yang menguji suatu bilangan dibagi mulai dari angka 1 sampai dirinya sendiri
                        // menambah nilai 1 pada variabel pengalih
                        if(awal % uji == 0){
                            pengalih++;
                        }
                    }

                    // berdasarkan rumus diatas jika var_01 % 1 == 0 dan var_01 % var_01 == 0
                    if(pengalih != 2){
                        System.out.print(awal+" ");
                    }
                }
            }
        }
        System.out.print("\n");
    }
}
