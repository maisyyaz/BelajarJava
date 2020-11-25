package com.latihan;

import java.util.Scanner;

public class MatriksCirular2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int xKiri = 0, xKanan = n-1;
        int yAtas = 0, yBawah = n-1;
        int angka = 1;

        if (n >= 2 && n <= 10) {
            Integer[][] matriks = new Integer[n][n];

            while (angka <= Math.pow(n, 2)) {

//              kiri ke bawah
                for (int i = yAtas; i <= yBawah; i++) {
                    matriks[i][xKiri] = angka;
                    angka++;
                }

                xKiri++;

//              bawah ke kanan
                for (int i = xKiri; i <= xKanan; i++) {
                    matriks[yBawah][i] = angka;
                    angka++;
                }

                yBawah--;

//              kanan ke atas
                for (int i = yBawah; i >= yAtas; i--) {
                    matriks[i][xKanan] = angka;
                    angka++;
                }

                xKanan--;

//              atas ke kiri
                for (int i = xKanan; i >= xKiri; i--) {
                    matriks[yAtas][i] = angka;
                    angka++;
                }

                yAtas++;
            }

            for (Integer[] cetak : matriks) {
                for (int j = 0; j < matriks.length; j++) {
                    System.out.print(cetak[j]+"\t");
                }
                System.out.println();
            }

        } else {
            System.out.println("Matriks harus ordo 2-10: ");
        }
    }
}
