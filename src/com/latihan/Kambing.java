package com.latihan;

public class Kambing {
    public static void main(String[] args) {
        int jmlKambing = 100, kambing = 150, waktu = 0, persen, semester = 6;

        while (jmlKambing < kambing) {
            persen = (jmlKambing * 5) / 100;
            jmlKambing = jmlKambing + persen;
            waktu = waktu + semester;
            System.out.println("Anda membutuhkan waktu " + waktu + " bulan untuk " + jmlKambing + " ekor kambing");
        }
    }
}