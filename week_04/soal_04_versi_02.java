// Programmer : Adam Rahmat Ilahi
// Saturday, 02 April 2022
//
//  soal_04_versi_02.java
//  Merupakan versi ke 2 dari soal nomer 4, dikarenakan perbedaan logika
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

public class soal_04_versi_02{
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int hari_kerja, hari_lembur, gaji = 0;

        System.out.println("Program Gaji Pegawai Toko ABC");
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        
        while(true){
            System.out.print("Input jumlah Hari Kerja wajib : ");
            hari_kerja = Input.nextInt();

            // menguji hari masuk apakah habis jika dibagi 5 (dalam seminggu)
            if(hari_kerja % 5 == 0){
                break;
            }

            else{
                System.out.println("Input Harus 5 hari atau kelipatan 5");
            }
        }

        System.out.print("Input jumlah Hari lembur : ");
        hari_lembur = Input.nextInt();

        // proses
        // gaji perhari 75.000 perhari
        // gaji lembur (lebih dari 5 dalam seminggu) 80.000 perhari

        // menghitung gaji yang didapatkan selama kerja wajib 5 hari
        hari_kerja = hari_kerja * 75000;

        // menghitung gaji yang didapatkan selama kerja lembur
        hari_lembur = hari_lembur * 80000;

        gaji = hari_kerja + hari_lembur;

        System.out.println("Gaji yang akan diterima : "+gaji);
    }
}