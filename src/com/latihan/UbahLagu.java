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

    private static String ubahLagu(String lagu) {
        int jumlahKarakter = lagu.length();
        char vokal;
        String simpanUbah;
        switch (jumlahKarakter % 5) {
            case 0:
                vokal = 'a';
                simpanUbah = ubahVokal(vokal, lagu);
                break;
            case 1:
                vokal = 'e';
                simpanUbah = ubahVokal(vokal, lagu);
                break;
            case 2:
                vokal = 'i';
                simpanUbah = ubahVokal(vokal, lagu);
                break;
            case 3:
                vokal = 'o';
                simpanUbah = ubahVokal(vokal, lagu);
                break;
            default:
                vokal = 'u';
                simpanUbah = ubahVokal(vokal, lagu);
                break;
        }
        return simpanUbah;
    }

    private static String ubahVokal(char vokal, String lagu) {
        char[] dataVokal = {'a', 'i', 'u', 'e', 'o'};
        String ubah = lagu;
        for (char c : dataVokal) {
            ubah = ubah.replace(c, vokal);
        }
        return ubah;
    }
}
