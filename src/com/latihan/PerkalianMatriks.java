package com.latihan;

import java.util.Scanner;
import java.util.Arrays;

public class PerkalianMatriks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, kali;

        System.out.print("Mau berapa baris: ");
        n = in.nextInt();
        Integer[][] dataAngka = new Integer[n][n];

        System.out.print("Mau dikali berapa: ");
        kali = in.nextInt();

        System.out.println("Buat Matriksnya");
        for (int dataBaris = 0; dataBaris < n; dataBaris++) {
            for (int dataKolom = 0; dataKolom < n; dataKolom++) {
                dataAngka[dataBaris][dataKolom] = in.nextInt();
            }
        }

        System.out.println("Hasil Matriksnya");
        for (int baris = 0; baris < n; baris++) {
            for (int kolom = 0; kolom < n; kolom++) {
                System.out.print((dataAngka[baris][kolom]*kali)+" ");
            }
            System.out.println();
        }
    }
}
