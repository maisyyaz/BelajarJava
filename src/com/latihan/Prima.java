package com.latihan;

import java.util.Scanner;

public class Prima {
    public static void main(String[] args) {
        int angka, awal = 2, cek = 0;

        Scanner input = new Scanner(System.in);

//      inputan user
        System.out.print("Masukan angka: ");
        angka = input.nextInt();

//      perulangan while
        while (awal <= angka) {
            if (angka % awal == 0) {
                cek = cek + 1;
            }
            awal++;
        }

//      cek apakah variabel cek memiliki 1 nilai
        if (cek == 1) {
            System.out.println(angka + " adalah bilangan Prima");
        } else {
            System.out.println(angka + " bukan bilangan Prima");
        }
    }
}
