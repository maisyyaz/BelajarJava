package com.latihan;

import java.util.Scanner;

public class PolaBintang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//      deklarasi variabel
        int baris, kolom, n, spasi;

        System.out.print("Masukkan angka: ");
        n = in.nextInt();

//      pola persegi
        baris = 0;
        System.out.println("a. Pola Persegi\n");
        while (baris < n) {
            kolom = 0;
            while (kolom < n) {
                System.out.print("* ");
                kolom++;
            }

            System.out.println();
            baris++;
        }

        System.out.println();

//      pola segitiga 1
        System.out.println("b. Pola Segitiga 1\n");
        baris = 0;
        while (baris < n) {
            kolom = 0;
            while (kolom <= baris) {
                System.out.print("* ");
                kolom++;
            }
            System.out.println();
            baris++;
        }

        System.out.println();

//      pola segitiga 2
        System.out.println("c. Pola Segitiga 2\n");
        baris = n;
        while (baris > 0) {
            kolom = baris;
            while (kolom > 0) {
                System.out.print("* ");
                kolom--;
            }

            System.out.println();
            baris--;
        }

        System.out.println();

//      pola segitiga 3
        System.out.println("d. Pola Segitiga 3\n");
        baris = n;
        while (baris > 0) {
            spasi = n;
            while (spasi > baris) {
                System.out.print("  ");
                spasi--;
            }
            kolom = baris;
            while (kolom > 0) {
                System.out.print("* ");
                kolom--;
            }
            System.out.println();
            baris--;
        }

        System.out.println();

//      pola segitiga 4
        System.out.println("e. Pola Segitiga 4\n");
        baris = 0;
        while (baris < n) {
            spasi = n - 1;
            while (spasi > baris) {
                System.out.print("  ");
                spasi--;
            }

            kolom = baris;
            while (kolom >= 0) {
                System.out.print("* ");
                kolom--;
            }
            System.out.println();
            baris++;
        }
    }
}
