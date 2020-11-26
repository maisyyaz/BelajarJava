package com.latihan;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Ukuran papan: ");

        int n = in.nextInt();
        int baris, kolom, akhir;
        int
                cekBaris1, cekBaris2,
                cekKolom1, cekKolom2,
                cekHorizon1, cekHorizon2,
                cekVertikal1, cekVertikal2;
        int
                simpanBaris1 = 0, simpanBaris2 = 0,
                simpanKolom1 = 0, simpanKolom2 = 0,
                simpanHorizon1 = 0, simpanHorizon2 = 0,
                simpanVertikal1 = 0, simpanVertikal2 = 0;
        String player = "";

        if (n >= 2 && n <= 10) {
            Integer[][] papan = new Integer[n][n];

            for (baris = 0; baris < n; baris++) {
                for (kolom = 0; kolom < n; kolom++) {
                    papan[baris][kolom] = in.nextInt();
                }
            }
/*
[00][01][02]
[10][11][12]
[20][21][22]

0,0 1,1 2,2
0,2 1,1 2,0
*/
            for (int i = 0; i < n; i++) {
//                deklarasi variabel
                cekBaris1 = 0;
                cekKolom1 = 0;
                cekBaris2 = 0;
                cekKolom2 = 0;
                cekHorizon1 = 0;
                cekHorizon2 = 0;
                cekVertikal1 = 0;
                cekVertikal2 = 0;
                akhir = n - 1;

//              cek baris, kolom, vertikal, horizontal 1
                for (int j = 0; j < n; j++) {
                    if (papan[i][j] == 1) {
                        cekBaris1++;
                        simpanBaris1 = cekBaris1;
                        if (cekBaris1 == n) {
                            player = "O";
                        }
                    }
                    if (papan[j][i] == 1) {
                        cekKolom1++;
                        simpanKolom1 = cekKolom1;
                        if (cekKolom1 == n) {
                            player = "O";                        }
                    }
                    if (papan[j][j] == 1) {
                        cekHorizon1++;
                        simpanHorizon1 = cekHorizon1;
                        if (cekHorizon1 == n) {
                            player = "O";
                        }
                    }
                    if (papan[j][akhir] == 1) {
                        cekVertikal1++;
                        simpanVertikal1 = cekVertikal1;
                        if (simpanVertikal1 == n) {
                            player = "O";
                        }
                        akhir--;
                    }
                }

                akhir = n - 1;
//              cek baris, kolom, vertikal, horizontal 2
                for (int j = 0; j < n; j++) {
                    if (papan[i][j] == 2) {
                        cekBaris2++;
                        simpanBaris2 = cekBaris2;
                        if (cekBaris2 == n) {
                            player = "X";                        }
                    }
                    if (papan[j][i] == 2) {
                        cekKolom2++;
                        simpanKolom2 = cekKolom2;
                        if (cekKolom2 == n) {
                            player = "X";                        }
                    }
                    if (papan[j][j] == 2) {
                        cekHorizon2++;
                        simpanHorizon2 = cekHorizon2;
                        if (cekHorizon2 == n) {
                            player = "X";
                        }
                    }
                    if (papan[j][akhir] == 2) {
                        cekVertikal2++;
                        simpanVertikal2 = cekVertikal2;
                        if (simpanVertikal2 == n) {
                            player = "X";
                        }
                        akhir--;
                    }
                }
            }
            if (simpanBaris1 != n && simpanBaris2 != n && simpanKolom1 != n && simpanKolom2 != n && simpanHorizon1 != n && simpanHorizon2 != n && simpanVertikal1 != n && simpanVertikal2 != n) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (papan[i][j] == 0) {
                            player = "?";
                            break;
                        } else if (papan[i][j] != 0) {
                            player = "-";
                        }
                    }
                }
            }
            System.out.println("Output: " + player);

        } else {
            System.out.println("Ukuran papan harus 2-10");
        }
    }
}
