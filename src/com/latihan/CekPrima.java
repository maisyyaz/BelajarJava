package com.latihan;

import java.util.Scanner;

public class CekPrima {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int bagi,hitung, angka;

        System.out.print("Masukkan angka: ");
        angka = in.nextInt();

        hitung = 0;
        bagi = 1;
        while (bagi <= angka) {
            if (angka % bagi == 0) {
                hitung++;
            }
            bagi++;
        }

        String prima = hitung == 2 ? ("Ya, " + angka + " adalah bilangan prima") : ("Tidak, " + angka + " bukan bilangan prima");

        System.out.println(prima);
    }
}
