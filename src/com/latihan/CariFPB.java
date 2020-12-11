package com.latihan;

import java.util.Scanner;

public class CariFPB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukan angka 1: ");
        int angka1 = in.nextInt();

        System.out.print("Masukan angka 2: ");
        int angka2 = in.nextInt();

        System.out.println(fungsiFPB(angka1,angka2));

    }

    static int fungsiFPB(int angka1, int angka2) {
        if (angka1 >= angka2 && angka1 % angka2 == 0) {
            return angka2;
        } else if (angka1 < angka2) {
            return fungsiFPB(angka2, angka1);
        } else {
            return fungsiFPB(angka2, angka1 % angka2);
        }
    }
}
