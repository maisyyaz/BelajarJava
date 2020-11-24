package com.latihan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UrutTertinggi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> dataAngka = new ArrayList<>();

        int hitung;

        hitung = 1;
        System.out.print("Masukan angka ke-"+ hitung +": ");
        int input = in.nextInt();
        while (input != -1) {
            hitung++;
            dataAngka.add(input);
            System.out.print("Masukan angka ke-"+ hitung +": ");
            input = in.nextInt();
        }

        System.out.println("Data angka urut dari yang paling besar");
        dataAngka.sort(Collections.reverseOrder());
        for (int tampil : dataAngka) {
            System.out.print(tampil + " ");
        }
    }
}
