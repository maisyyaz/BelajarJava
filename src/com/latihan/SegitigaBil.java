package com.latihan;

import java.util.Scanner;

public class SegitigaBil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int baris, kolom, bilangan, hitung, batas;

        System.out.print("Masukkan jumlah baris: ");
        batas = in.nextInt();

        hitung = 0;
        baris = 0;
        while (baris < batas) {
            kolom = 0;
            while (kolom <= baris) {
                if (hitung > 9) {
                    hitung = 0;
                }
                System.out.print(hitung + " ");
                hitung++;
                kolom++;
            }
            System.out.println();
            baris++;
        }
    }
}
