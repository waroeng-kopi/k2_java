// Programmer : Adam Rahmat Ilahi
// Monday, 18 April 2022
// 
// Soal :
//          Mencetak tampilan sesuai dengan inputan
//      Misal : Input = 4
//              Output : 1  8  9  4
//          
//              Input = 5
//              Output : 1  16  27  16  5
//

package week_07;

import java.util.Scanner;

public class soal_02 {

    static int Pangkat(int base, int exponent){
        int hasil = 1; // nllai awal

        for(int a = 1; a <= exponent; a++){
            hasil = hasil * base; // perkalian pangkat
        }
        return hasil;
    }

    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)){
            int input;

            System.out.print("Program Pencetak Nilai Pangkat berurutan terbalik\n");
            System.out.print("Input nilai : ");
            input = Input.nextInt();

            // proses
            int b = input;

            for(int a = 1; a <= input; a++){          
                System.out.print(Pangkat(a, b) + " ");
                b--;
            }
        }
    }
}
