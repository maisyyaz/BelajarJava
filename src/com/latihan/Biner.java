package com.latihan;

import java.util.Scanner;

public class Biner {
    public static void main(String[] args) {
        int desimal, biner;
        StringBuilder bin = new StringBuilder();

        Scanner in = new Scanner(System.in);

        System.out.print("masukan desimal: ");
        desimal = in.nextInt();

        while (desimal>0) {
            biner = desimal % 2;
            desimal = desimal / 2;
            bin.insert(0, biner);
        }
        System.out.println(bin);
    }
}
