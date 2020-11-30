package com.latihan;

import java.util.Scanner;

public class SapaMereka {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nama1 = in.nextLine();
        String nama2 = in.nextLine();

        int time = in.nextInt();

        cetakSapa(nama1, time);
        cetakSapa(nama2, time);
    }

    public static void cetakSapa(String nama, int time) {
        System.out.println(sapa(nama, time));
    }

    public static String waktu(int time) {
        if (time >= 6 && time <= 11) {
            return "pagi";
        } else if (time >= 12 && time <= 14) {
            return "siang";
        } else if (time >= 15 && time <= 17) {
            return "sore";
        } else {
            return "malam";
        }
    }

    public static String sapa(String nama, int time) {
        return "Halo, "+ nama + ". Selamat "+ waktu(time)+".";
    }
}
