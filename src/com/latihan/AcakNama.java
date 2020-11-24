package com.latihan;

import java.util.Scanner;
import java.util.ArrayList;

public class AcakNama {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//      deklarasi variabel
        int namaAcak, hitung;
        String nama;
        ArrayList<String> dataNama = new ArrayList<>();

        hitung = 1;
        System.out.print("Masukan inputan ke-"+ hitung + ": ");
        nama = in.nextLine();
        while (!nama.equals("-")) {
            hitung++;
            dataNama.add(nama);
            System.out.print("Masukan inputan ke-"+ hitung + ": ");
            nama = in.nextLine();
        }

        if (dataNama.isEmpty()) {
            System.out.println("Data kosong");
        } else {
            namaAcak = (int) (Math.random() * dataNama.size());
            System.out.println("Nama yang keluar: ");
            System.out.println(dataNama.get(namaAcak));
        }
    }
}
