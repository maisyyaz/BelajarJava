package com.latihan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Modus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//      deklarasi variabel
        int n, hitung, banyak, simpan = 0, simpanBanyak = 0;

        System.out.print("Mau berapa kali input: ");
        n = in.nextInt();
        ArrayList<Integer> dataAngka = new ArrayList<>();
        ArrayList<Integer> dataBanding = new ArrayList<>();

        hitung = 1;
        while (hitung <= n) {
            System.out.print("Masukan nilai ke-"+hitung+": ");
            dataAngka.add(in.nextInt());
            hitung++;
        }

        for (int a = 0; a < n; a++) {
            banyak = 0;
            for (int b = 0; b < n; b++) {
                if (dataAngka.get(a).equals(dataAngka.get(b))) {
                    if (banyak >= simpanBanyak) {
                        if (banyak == simpanBanyak) {
                            dataBanding.add(dataAngka.get(a));
                            dataBanding.sort(Collections.reverseOrder());
                            simpan = dataBanding.get(0);
                        } else {
                            simpan = dataAngka.get(a);
                        }
                        simpanBanyak = banyak;
                    }
                    banyak++;
                } 
            }
        }
        System.out.println("Modus adalah: "+simpan);
    }
}
