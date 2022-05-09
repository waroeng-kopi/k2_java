package week_04;

// Programmer : Adam Rahmat Ilahi
// Saturday, 02 April 2022
//
//  soal_04_versi_01.java
//  Merupakan versi ke 1 dari soal nomer 4, dikarenakan perbedaan logika
//
// Soal:
//      Karyawan toko 'ABC' mempunyai kewajiban kerja 5 hari
//      dalam satu minggu. Gaji perhari adalah Rp. 75.000.
//      Gaji diberikan perminggu. jika dia bekerja lebih
//      dari 5 hari dalam seminggu maka sisanya dianggap lembur
//      dengan updah lembur Rp. 80.000 perhari.
//      Hitung gaji yang diterima karyawan per minggu dengan
//      masukan jumlah hari kerja, lalu tampilkan jumlah hari 
//      kerja, lembur, gaji bersih.
//

import java.util.Scanner;

public class soal_04_versi_01{
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)){
        int hari_kerja, gaji = 0;

        System.out.println("Program Gaji Pegawai Toko ABC");
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        System.out.print("Input jumlah Hari Kerja : ");
        hari_kerja = Input.nextInt();

        // proses
        // gaji perhari 75.000 perhari
        // gaji lembur (lebih dari 5 dalam seminggu) 80.000 perhari

        for(int a = 1; a <= hari_kerja; a++){
            // untuk gaji hari wajib dalam seminggu
            if(a <= 5){
                gaji = gaji + 75000;
            }
    
            // untuk gaji lembur dalam seminggu
            else if(a >= 5 && a <= 7){
                gaji = gaji + 80000;
            }

            // reset nilai untuk menghitung ulang loop
            else{
                a = 0;
                hari_kerja = hari_kerja - 7;
            }
        }
        

        System.out.println("Gaji yang akan diterima : "+gaji);
    }
    }
}