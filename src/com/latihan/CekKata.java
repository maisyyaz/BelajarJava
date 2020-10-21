package com.latihan;

import java.util.Scanner;

public class CekKata {
    public static void main(String[] args) {
        int jumlahKata, jumlahKarakter, jumlahKalimat;
        String inputan;

        Scanner in = new Scanner(System.in);

        System.out.print("masukan kata/kalimat: ");
        inputan = in.nextLine();

        jumlahKarakter = inputan.length();
        jumlahKata = 0;
        jumlahKalimat = 0;

        for (int i = 0; i < jumlahKarakter; i++) {
            if (inputan.charAt(i) == ' '){
                jumlahKata = jumlahKata + 1;
            }
            if (inputan.charAt(i) == '.') {
                jumlahKalimat = jumlahKalimat + 1;
            }
        }
        System.out.println(jumlahKarakter);
        System.out.println(jumlahKata + 1);
        System.out.println(jumlahKalimat);
    }
}
