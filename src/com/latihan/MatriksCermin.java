package com.latihan;

import java.util.Scanner;
import java.util.Arrays;

public class MatriksCermin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int hitung = 0;

        int n = in.nextInt();
        if (n >= 2 && n <= 10) {
            Integer[][] matriks = new Integer[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matriks[i][j] = in.nextInt();
                }
            }

            for (int i = n-1; i >= 0; i--) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matriks[i][j]+"\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matriks harus ordo 2-10: ");
        }
    }
}
