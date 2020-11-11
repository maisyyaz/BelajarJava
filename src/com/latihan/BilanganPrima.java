package com.latihan;

import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//      deklarasi variabel
        int hitung, n, bagi;
        boolean prima;

        System.out.print("Masukkan angka: ");
        n = in.nextInt();

        hitung = 2;
        while (hitung <= n) {

            prima=true;

            for(bagi = 2;bagi < hitung; bagi++){
                if(hitung % bagi == 0){
                    prima=false;
                    break;
                }
            }

            if(prima)
                System.out.print(hitung + " ");

            hitung++;
        }
    }
}
