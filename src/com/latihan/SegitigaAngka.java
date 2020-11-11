package com.latihan;

import java.util.Scanner;

public class SegitigaAngka {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//      deklarasi variabel
        int baris, kolom, n, spasi;

        System.out.print("Masukkan angka: ");
        n = in.nextInt();

        baris = 1;
        while (baris <= n) {
            spasi = n;
            while (spasi > baris) {
                System.out.print(" ");
                spasi--;
            }
            kolom = 1;
            while (kolom <= baris) {
                System.out.print(baris+ " ");
                kolom++;
            }
            System.out.println();
            baris++;
        }
    }
}
