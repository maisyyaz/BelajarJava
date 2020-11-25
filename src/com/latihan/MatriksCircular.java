package com.latihan;

import java.util.Scanner;

public class MatriksCircular {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
/*
00 01 02
10 11 12
20 21 22
*/
        int n = in.nextInt();
        Integer[][] matriks = new Integer[n][n];
        int xKiri = 0, xKanan = n-1;
        int yAtas = 0, yBawah = n-1;
        int angka = 1;

        while (angka <= Math.pow(n, 2)) {

//          atas ke kanan
            for (int i = xKiri; i <= xKanan; i++) {
                matriks[yAtas][i] = angka;
                angka++;
            }

            yAtas++;

//          kanan ke bawah
            for (int i = yAtas; i <= yBawah; i++) {
                matriks[i][xKanan] = angka;
                angka++;
            }

            xKanan--;

//          bawah ke kiri
            for (int i = xKanan; i >= xKiri; i--) {
                matriks[yBawah][i] = angka;
                angka++;
            }

            yBawah--;

//          bawah ke atas
            for (int i = yBawah; i >= yAtas; i--) {
                matriks[i][xKiri] = angka;
                angka++;
            }

            xKiri++;

        }

        for (Integer[] cetak: matriks) {
            for (int i = 0; i < matriks.length; i++) {
                System.out.print(cetak[i]+"\t");
            }
            System.out.println();
        }
    }
}
