// Programmer : Adam Rahmat Ilahi
// Saturday, 02 April 2022
//
// Soal:
//      Berdasarkan data berikut :
//      A = TVRI        D = ANTV
//      B = RCTI        E = TRANSTV
//      C = SCTV        F = METROTV
//      Buatlah program yang meminta masukan huruf saluran
//      TV, kemudian program menampilkan nama stasiun
//      penyiarannya.
//

import java.util.Scanner;

public class soal_03 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        char input;

        System.out.println("Program Penentu saluran TV dari character hasil inputan");
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        
        // Menu
        System.out.println("A = TVRI    D = ANTV");
        System.out.println("B = RCTI    E = TRANSTV");
        System.out.println("C = SCTV    F = METROTV");
        
        System.out.print("Input Index TV channel : ");
        input = Input.next().charAt(0);

        // Proses
        if(input == 'a' || input == 'A'){
            System.out.println("Saluran TV adalah TVRI");
        }

        else if(input == 'b' || input == 'B'){
            System.out.println("Saluran TV adalah RCTI");
        }

        else if(input == 'c' || input == 'C'){
            System.out.println("Saluran TV adalah SCTV");
        }

        else if(input == 'd' || input == 'D'){
            System.out.println("Saluran TV adalah ANTV");
        }

        else if(input == 'e' || input == 'E'){
            System.out.println("Saluran TV adalah TRANSTV");
        }

        else if(input == 'f' || input == 'F'){
            System.out.println("Saluran TV adalah METROTV");
        }

        else{
            System.out.println("Tidak dapat menemukan channel TV");
            System.out.println("Terjadi kesalahan dalam input");
        }

    }    
}
