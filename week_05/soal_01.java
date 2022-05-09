package week_05;

// Programmer : Adam Rahmat Ilahi
// Wednesday, 06 April 2022
// 
// Soal :
//          Membuat program java yang dapat menampilkan tabel perkalian 
//      sesuai dengan input.
//

import java.util.Scanner;

public class soal_01 {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)){
            int input;

            System.out.println("Program Pembuat Tabel Perkalian");
            System.out.print("Input nilai perkalian : ");
            input = Input.nextInt();

            if(input <= 0 ){
                System.out.println("Input tidak boleh kurang atau sama dengan 0");
            }

            // proses
            for(int a = 1; a <= input+1; a++){              // diagonal x
                for(int b = 1; b <= input+1; b++){          // diagonal y
                    if(a == 1 && b == 1){
                        System.out.print("X\t");

                        for(int c = 1; c <= input; c++){
                            System.out.print(c+"\t");
                        }
                        System.out.print("\n");
                    }

                    else if(b == 1 && a != 1){
                        int d = a-1;
                        System.out.print(d+"\t");
                        for(int c = 1; c <= input; c++){
                            System.out.print((c*d)+"\t");
                        }
                        System.out.print("\n");
                    }
                }
            }
        }
    }
}
