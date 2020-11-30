package com.latihan;

import java.util.Scanner;

public class LuasPermukaanKerucut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int jari2 = in.nextInt();
        int tinggi = in.nextInt();

        double result = luasPermukaanKerucut(tinggi, jari2);

        System.out.printf("%.3f", result);
    }

    public static double luasPermukaanKerucut(int h, int r) {
        final double pi = 3.14;
        return pi * r * (r + Math.sqrt(Math.pow(r, 2) + Math.pow(h, 2)));
    }
}
