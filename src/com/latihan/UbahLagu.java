package com.latihan;

import java.util.Scanner;

public class UbahLagu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukan lirik lagu: ");
        String lagu = in.nextLine();

        System.out.println("Keluaran");
        System.out.println(ubahLagu(lagu));
    }

    public static String ubahLagu(String lagu) {
        char[] vokal = {'a', 'i', 'u', 'e', 'o'};
        String ubah = lagu;
        int jumlahKarakter = lagu.length();

        if (jumlahKarakter % 5 == 0) {
            for (char c : vokal) {
                if (c != 'a') {
                    ubah = ubah.replace(c, 'a');
                }
            }
        } else if (jumlahKarakter % 5 == 1) {
            for (char c : vokal) {
                if (c != 'e') {
                    ubah = ubah.replace(c, 'e');
                }
            }
        } else if (jumlahKarakter % 5 == 2) {
            for (char c : vokal) {
                if (c != 'i') {
                    ubah = ubah.replace(c, 'i');
                }
            }
        } else if (jumlahKarakter % 5 == 3) {
            for (char c : vokal) {
                if (c != 'o') {
                    ubah = ubah.replace(c, 'o');
                }
            }
        } else {
            for (char c : vokal) {
                if (c != 'u') {
                    ubah = ubah.replace(c, 'u');
                }
            }
        }
        return ubah;
    }
}
