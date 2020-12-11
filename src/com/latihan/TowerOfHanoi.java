package com.latihan;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukan angka: ");
        int angka = in.nextInt();

        fungsiTowerOfHanoi(angka, 'A','B','C', "daun atas");
    }

    static void fungsiTowerOfHanoi(int cakram, char dariBatang, char batangTransisi, char keBatang, String daun) {
        if (cakram == 1) {
            System.out.println("Cakram 1 dipindahkan dari " + dariBatang + " ke " + keBatang + " pada " + daun);
        } else {
            fungsiTowerOfHanoi(cakram - 1, dariBatang, keBatang, batangTransisi, "kiri" );
            System.out.println("Cakram " + cakram + " dipindahkan dari " + dariBatang + " ke " + keBatang + " pada " + daun);
            fungsiTowerOfHanoi(cakram - 1, batangTransisi, dariBatang, keBatang, "kanan");
        }
    }
}
