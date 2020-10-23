/* logika isi watertank dengan 4 alat
*
* input kapasitas watertank
*
* tampilkan menu alat buat isi water tank
*
* perulangan do while start{
* ulangi selama water tank awal < kapasitas watertank
*
* input alatnya
* jika input 1 maka pilih gelas kapasitasnya 1 liter
* jika input 2 maka pilih ember kapasitasnya 10 liter
* jika input 3 maka pilih galon kapasitasnya 16 liter
* jika input 4 maka pilih tangan kapasitasnya 0.2 liter
*
* rumusnya
* water tank awal = water tank awal + kapsitas alat
* isian ke = isian ke + 1
*
* cek jika water tank awal > kapasitas water tank
* rumusnya
* lebih = water tank awal - kapasitas water tank
* cetak water tank lebih {beberapa} liter dari kapasitas water tank.
* selain itu
* cetak water tank sekarang {sekarang} liter
* } end
*
* cetak banyak isian untuk mengisi water tank adalah {banyak} kali
*/

package com.latihan;

import java.util.Scanner;

public class WaterTank {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        WaterTank air = new WaterTank();
        air.run();
    }
    void run() {
        double kapasitasWaterTank, watertank = 0, kapasitasAlat;
        int alat = 0, isianKe = 0, n;
        String namaAlat = "";
        System.out.println("Aplikasi menghitung berapa banyak alat yang bisa mengisi water tank\n");

        System.out.print("Masukkan kapasitas Water Tank: ");
        kapasitasWaterTank = in.nextDouble();

        do {
            if (watertank <= kapasitasWaterTank) {
                if (watertank + 16 <= kapasitasWaterTank) {
                    System.out.println("[1] Gelas , 1 Liter ");
                    System.out.println("[2] Ember , 10 Liter ");
                    System.out.println("[3] Galon , 16 Liter ");
                    System.out.println("[4] Tangan, 0.2 Liter ");
                    System.out.print("Pilih alat [1-4]: ");
                    alat = in.nextInt();
                } else if (watertank + 10 <= kapasitasWaterTank) {
                    System.out.println("[1] Gelas , 1 Liter ");
                    System.out.println("[2] Ember , 10 Liter ");
                    System.out.println("[3] Tangan, 0.2 Liter ");
                    System.out.print("Pilih alat [1-3]: ");
                    n = in.nextInt();
                    switch (n) {
                        case 1:
                            alat = 1;
                            break;
                        case 2:
                            alat = 2;
                            break;
                        case 3:
                            alat = 4;
                            break;
                    }
                } else if (watertank + 1 <= kapasitasWaterTank) {
                    System.out.println("[1] Gelas , 1 Liter ");
                    System.out.println("[2] Tangan, 0.2 Liter ");
                    System.out.print("Pilih alat [1-2]: ");
                    n = in.nextInt();
                    switch (n) {
                        case 1:
                            alat = 1;
                            break;
                        case 2:
                            alat = 4;
                            break;
                    }
                } else if (watertank + 0.2 <= kapasitasWaterTank) {
                    System.out.println("[1] Tangan, 0.2 Liter ");
                    System.out.print("Pilih alat [1]: ");
                    n = in.nextInt();
                    if (n == 1) {
                        alat = 4;
                    }
                }
            }

            switch (alat) {
                case 1:
                    namaAlat = "gelas";
                    kapasitasAlat = 1.0;
                    break;
                case 2:
                    namaAlat = "ember";
                    kapasitasAlat = 10.0;
                    break;
                case 3:
                    namaAlat = "galon";
                    kapasitasAlat = 16.0;
                    break;
                case 4:
                    namaAlat = "tangan";
                    kapasitasAlat = 0.2;
                    break;
                default:
                    kapasitasAlat = 0.0;
                    break;
            }

            watertank = watertank + kapasitasAlat;
            isianKe = isianKe + 1;

            System.out.println("Alat yang dipilih adalah " + namaAlat + ", water tank sekarang berisi " + watertank + " liter.");

            if (watertank < kapasitasWaterTank - 1) {
                System.out.println("Ulangi hingga penuh!");
            }

        } while (watertank < kapasitasWaterTank);

        System.out.println("\nIsi watertank sudah penuh, proses pengisian dilakukan sebanyak " + isianKe + " kali.");

    }
}

