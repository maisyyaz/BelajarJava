package com.latihan;

import java.util.Scanner;
import java.util.Arrays;

public class BelajarArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//      deklarasi variabel
        int N, hitung, angka, cari, cek, indeks;

        System.out.print("Mau berapa kali input: ");
        N = in.nextInt();

        Integer[] dataAngka = new Integer[N];

        System.out.println("Input: ");
        hitung = 0;
        while (hitung < N) {
            angka = in.nextInt();
            dataAngka[hitung] = angka;
            hitung++;
        }

        System.out.println("Datanya");
        for (int tampil: dataAngka) {
            System.out.print(tampil + " ");
        }

        System.out.println();

        System.out.println("Data dibalik");
        for (int x = N-1; x >=0; x--) {
            System.out.print(dataAngka[x] + " ");
        }

        System.out.println();

//      Pencarian data dan index
        System.out.print("Cari: ");
        cari = in.nextInt();

        hitung = 0;
        cek = 0;
        while (hitung < N) {
            if (dataAngka[hitung] == cari) {
                cek++;
            }
            hitung++;
        }
        if (cek > 0) {
            System.out.println("Angka " + cari + " ditemukan");
        } else {
            System.out.println("Angka " + cari + " tidak ditemukan");
        }

        hitung = 0;
        while (hitung < N) {
            if (dataAngka[hitung] == cari) {
                indeks = hitung;
                System.out.println("Angka " + cari + " ditemukan pada indeks ke " + indeks);
            }
            hitung++;
        }

        Arrays.sort(dataAngka);

        System.out.println("Angka urut dari yg terkecil");
        for (int tampil: dataAngka) {
            System.out.print(tampil + " ");
        }

        System.out.println();

        System.out.println("Angka urut dari yang terbesar");
        for (int x = N-1; x >=0; x--) {
            System.out.print(dataAngka[x] + " ");
        }
    }
}
