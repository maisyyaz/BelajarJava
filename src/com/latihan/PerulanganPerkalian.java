package com.latihan;

import java.util.Scanner;

public class PerulanganPerkalian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int perkalian ,hasil;

        System.out.print("Masukkan nilai perkalian: ");
        perkalian = in.nextInt();

        if (perkalian > 0 && perkalian <= 10) {
            for (int hitung = 1; hitung <= 10; hitung++) {
                hasil = hitung * perkalian;
                System.out.println(hitung + " x "+ perkalian + " = " + hasil);
            }
        } else {
            System.out.println("Maaf, nilai perkalian harus diantara 1 - 10");
        }
    }
}
