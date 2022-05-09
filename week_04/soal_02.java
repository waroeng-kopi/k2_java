package week_04;

// Programmer : Adam Rahmat Ilahi
// Saturday, 2 April 2022
//
// Soal:
//      Buatlah Program java untuk menerima masukan dua angka,
//      kemudian menentukan angka mana yang lebih besar
//

import java.util.Scanner;

public class soal_02 {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)){

        // Deklarasi variabel
        int angka_1, angka_2;

        System.out.println("Program penentu bilangan terbesar dari 2 bilangan input");
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        System.out.print("Inputkan angka ke-1 : ");
        angka_1 = Input.nextInt();

        System.out.print("Inputkna angka ke-2 : ");
        angka_2 = Input.nextInt();

        // proses
        if(angka_1 > angka_2){
            System.out.println(angka_1+" lebih besar dari "+angka_2);
        }
        else{
            System.out.println(angka_2+" lebih besar dari "+angka_1);
        }
        }
    }
}
