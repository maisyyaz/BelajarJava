package com.latihan;

public class Perpangkatan {
    public static void main(String[] args) {
        int hasil, batas, pangkat;

        batas = 10;
        pangkat = 1;
        while (pangkat <= batas) {
            hasil = pangkat * pangkat;
            System.out.print(hasil + " ");
            pangkat++;
        }
    }
}
