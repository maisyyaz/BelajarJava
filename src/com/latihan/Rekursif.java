package com.latihan;

import java.util.Scanner;

public class Rekursif {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Masukan angka1: ");
//        int angka1 = in.nextInt();
//        System.out.print("Masukan angka2: ");
//        int angka2 = in.nextInt();

//        int cetak = fungsi(angka1);
//        System.out.println(cetak);
//        fibonacci(5);
        for (int i = 0; i < 10; i++) {
            int cetak = fibonacci(i);
            System.out.println(cetak);
        }

    }

//    private static void fungsi(int parameter) {
//        System.out.println(parameter);
//
//        if (parameter == 0) {
//            return;
//        }
//
//        parameter--;
//
//        fungsi(parameter);
//    }

//    static void fungsi(int parameter1, int parameter2) {
//        System.out.println(parameter1);
//        System.out.println(parameter2);
//
//        parameter1 = parameter1 + parameter2;
//        parameter2 = parameter1 + parameter2;
//
//        if (parameter1 > 100) {
//            return;
//        }
//
//        fungsi(parameter1, parameter2);
//    }

    static int fibonacci(int n) {
//        System.out.println("fibonacci ke-"+n);

        if (n == 1 || n == 0) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
