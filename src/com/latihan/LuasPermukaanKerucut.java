package com.latihan;

import java.util.Scanner;

public class LuasPermukaanKerucut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukan jari-jari: ");
        int jari2 = in.nextInt();
        System.out.print("Masukan tinggi: ");
        int tinggi = in.nextInt();

        double result = luasPermukaanKerucut(tinggi, jari2);

        System.out.printf("Luas Permukaan Kerucut adalah : %.3f", result);
    }

    public static double luasPermukaanKerucut(int h, int r) {
        final double pi = 3.14;
        return pi * r * (r + Math.sqrt(Math.pow(r, 2) + Math.pow(h, 2)));
    }
}
