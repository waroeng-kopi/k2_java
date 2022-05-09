package week_04;

// Programmer : Adam Rahmat Ilahi
// Saturday, 2 April 2022
//
// soal:
//      Buatlah program untuk menentukan apakah suatu bilangan bulat habis dibagi 3 atau tidak.
//

import java.util.Scanner;

public class soal_01 {
    public static void main(String[] args) {
        // deklarasi variabel
        int input;

        // membuat scanner baru
        try(Scanner Input = new Scanner(System.in)){

        System.out.println("Program Penentu bilangan bulat habis dibagi 3");
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        System.out.print("Inputkan angka : ");
        input = Input.nextInt();

        // proses
        if(input % 3 == 0){
            System.out.println(input+" adalah bilangan yang habis dibagi 3");
        }

        else{
            System.out.println(input+" bukan bilangan yang habis dibagi 3");
        }
        }
  }  
}
