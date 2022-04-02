// Programmer : Adam Rahmat Ilahi
// Saturday, 02 April 2022
//
// soal:
//      Buatlah program menghitung biaya laundry yang
//      dibayar dengan biaya laundry Rp. 3500 per Kg.
//      program menerima masukan berat pakaian (dalam
//      Kg). Ketentuan biaya yang dibayar:
//      - jika berat < 5 Kg maka tidak mendapat potongan.
//      - jika berat >= 5 Kg dan berat < 10 Kg maka
//          mendapat potongan 2 Kg (berat - 2 Kg).
//      - jika berat >= 10 Kg maka mendapat potongan 4
//          Kg (berat - 4 Kg).
//

import java.util.Scanner;

public class soal_05 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int berat,  diskon = 0,  biaya, harga = 3500;

        System.out.println("Program penentu biaya laudry dari inputan berat laundry");
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");

        while(true){
            System.out.print("input berat laundry (dalam Kg) : ");
            berat = Input.nextInt();

            //  proses
            if(berat < 5 && berat > 0){
                biaya = harga * berat;
                break;
            }

            else if(berat >= 5 && berat < 10){
                // diskon pengurangan biaya dari berat sebesar 2 Kg
                diskon = berat - 2;
                biaya = diskon * harga;
                break;
            }

            else if (berat >= 10){
                // diskon pengurangan biaya dari berat sebesar 4 Kg
                diskon = berat - 4;
                biaya = diskon * harga;
                break;
            }

            else {
                System.out.println("Terjadi kesalahan pada input");
                System.out.println("Silahkan periksa kembali");
            }
        }    
        System.out.println("Berat laundry               = "+berat+" Kg");

        // akan di jalankan jika mendapatkan diskon
        if(diskon != 0){
            System.out.println("Mendapatkan diskon jadi = "+diskon+" Kg");
        }

        System.out.println("Biaya yang harus di bayar   = Rp."+biaya);
    }
}