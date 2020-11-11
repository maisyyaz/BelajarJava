package com.latihan;

import java.util.Scanner;

public class HasilFaktorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int hasil = 1, faktorial, hitung;

        System.out.print("Masukkan nilai faktorial: ");
        faktorial = in.nextInt();

        for (hitung = 1; hitung <= faktorial; hitung++) {
            hasil *= hitung;
        }
        System.out.println("Faktorial dari " + faktorial + " adalah " + hasil);
    }
}
