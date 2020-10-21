/*logika fibonaci
*
* contoh inputan1 angka
* contoh inputan2 angka
* contoh unputan3 angka ke n
*
* rumus fibonaci = angka1 + angka2
*
* contoh
* input1: 1
* input2: 1
* n angka ke: 5
* output
* 1 1 2 3 5
*
* pseudocode
* var angka1, angka2, angkaKeN, hasil
*
* perulangan
* angkaKeN > 0
* hasil = angka1 + angka2
* angka1 = angka2
* angka2 = hasil
* angkaKeN = angkaKeN - 1
*
* 5 > 0
* 1 + 2 = 3
* angka1 = 2
* angka2 = 3
* 5 - 1 = 4
*
* 1 > 0
* 2 + 3 = 5
* angka1 = 3
* angka2 = 5
* 1 - 1 = 0
*
* cetak dari hasil
* */

package com.latihan;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
//      deklarasi variabel
        int angka1, angka2, angkaKeN, hasil;

        Scanner input = new Scanner(System.in);

//      inputan dari user
        System.out.print("Angka 1: ");
        angka1 = input.nextInt();

        System.out.print("Angka 2: ");
        angka2 = input.nextInt();

        System.out.print("N angka ke: ");
        angkaKeN = input.nextInt();

//      cetak angka ke 1 dan 2
        System.out.print(angka1 + " ");
        System.out.print(angka2 + " ");

//      perulangan angka ke 3 sampai n
        while (angkaKeN > 2) {
            hasil = angka1 + angka2;
            angka1 = angka2;
            angka2 = hasil;
            angkaKeN = angkaKeN - 1;
            System.out.print(hasil + " ");
        }
    }
}
