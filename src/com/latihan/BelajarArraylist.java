package com.latihan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BelajarArraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> dataAngka = new ArrayList<>();
//      deklarasi variabel
        int n, cari, hitung, banyak, indeks;

        System.out.print("Mau berapa kali input: ");
        n = in.nextInt();

        for (int a = 0; a < n; a++) {
            System.out.print("Masukan nilai index ke-"+ a +": ");
            dataAngka.add(in.nextInt());
        }

        System.out.println("Data Angka");
        for (int tampil : dataAngka) {
            System.out.print(tampil+" ");
        }

        System.out.println();

        System.out.println("Data dibalik");
        for (int x = n-1; x >=0; x--) {
            System.out.print(dataAngka.get(x) + " ");
        }

        System.out.println();

//      Pencarian data dan Index
        System.out.print("Cari: ");
        cari = in.nextInt();

        hitung = 0;
        banyak = 0;
        while (hitung < n) {
            if (dataAngka.contains(cari)) {
                banyak++;
            }
            hitung++;
        }
        if (banyak > 0) {
            System.out.println("Angka " + cari + " ditemukan");
        } else {
            System.out.println("Angka " + cari + " tidak ditemukan");
        }

        hitung = 0;
        while (hitung < n) {
            if (dataAngka.get(hitung) == cari) {
                indeks = hitung;
                System.out.println("Angka " + cari + " ditemukan pada indeks ke " + indeks);
            }
            hitung++;
        }

        System.out.println("Angka urut dari yg terkecil");
        Collections.sort(dataAngka);
        for (int tampil : dataAngka) {
            System.out.print(tampil + " ");
        }

        System.out.println();

        System.out.println("Angka urut dari yang terbesar");
        dataAngka.sort(Collections.reverseOrder());
        for (int tampil : dataAngka) {
            System.out.print(tampil + " ");
        }
    }
}
