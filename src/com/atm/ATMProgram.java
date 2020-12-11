package com.atm;

import com.atm.progate.Customer;
import java.time.LocalDate;
import java.util.Scanner;


public class ATMProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Customer atm = new Customer(0);


        System.out.print("Masukan pin anda: ");
        int id = in.nextInt();
        int trial = 0;

        while (id != atm.cekPin() && trial < 3) {
            System.out.print("Pin anda salah. Silakan Masukkan lagi: ");
            id = in.nextInt();

            trial++;
        }

        if (trial == 3) {
            System.out.println("Error. Silakan ambil kartu dan coba lagi..");
            System.exit(0);
        }

        while (true) {
            System.out.println("Selamat datang di ATM Progate..");
            System.out.println("\n1 - Cek Saldo \t 2 - Debet \t 3 - Simpan \t 4 - Ganti Pin \t 5 - Keluar ");
            System.out.print("Silahkan pilih menu[1-5]: ");
            int pilihMenu = in.nextInt();
            System.out.println();

            switch (pilihMenu) {
                case 1:
                    System.out.println("Saldo anda sekarang: Rp. " + atm.cekSaldo() + "\n");
                    break;
                case 2:
                    System.out.print("Masukan nominal saldo: ");
                    float nominal = in.nextFloat();
                    System.out.print("Konfirmasi: Anda akan melakukan debet dengan nominal Rp. "+ nominal +"? y/n ");
                    String verDebet = in.next();

                    if (verDebet.equalsIgnoreCase("y")) {
                        System.out.println("Saldo awal anda adalah Rp. " + atm.cekSaldo() + "");
                    } else {
                        break;
                    }

                    if (nominal < atm.cekSaldo()) {
                        atm.debet((int)nominal);
                        System.out.println("Transaksi debet berhasil!");
                        System.out.println("Saldo sisa sekarang Rp. " + atm.cekSaldo() + "\n");
                    } else {
                        System.out.println("Maaf. Saldo anda tidak cukup untuk melakukan debet!");
                        System.out.println("Silahkan lakukan penambahan nominal saldo\n");
                    }

                    break;
                case 3:
                    System.out.print("Masukan nominal saldo: ");
                    nominal = in.nextFloat();
                    System.out.print("Konfirmasi: Anda akan melakukan deposit dengan nominal Rp. "+ nominal +"? y/n ");
                    String verDeposit = in.next();

                    if (verDeposit.equalsIgnoreCase("y")) {
                        atm.deposit((int)nominal);
                        System.out.println("Saldo anda sekarang adalah Rp. " + atm.cekSaldo() + "\n");
                    } else {
                        break;
                    }

                    break;
                case 4:
                    System.out.print("Masukan pin anda: ");
                    int verPin = in.nextInt();
                    trial = 0;

                    while (verPin != atm.cekPin() && trial < 3) {
                        System.out.print("Pin anda salah, silahkan masukkan pin: ");
                        verPin = in.nextInt();
                        trial++;
                    }

                    System.out.print("Silahkan masukkan pin baru: ");
                    int updatePin = in.nextInt();
                    System.out.print("Coba masukkan pin baru: ");
                    int verUpdatePin = in.nextInt();
                    System.out.println();
                    trial = 0;

                    while (updatePin != verUpdatePin && trial < 3) {
                        System.out.print("Silahkan masukkan pin baru: ");
                        updatePin = in.nextInt();
                        System.out.print("Coba masukkan pin baru: ");
                        verUpdatePin = in.nextInt();
                        trial++;
                    }

                    if (updatePin == verUpdatePin) {
                        atm.custPin = updatePin;
                        System.out.println("Pin baru anda Sukses");
                    } else {
                        System.out.println("Maaf, pin anda salah");
                        break;
                    }

                    break;
                case 5:
                    System.out.println("Resi tercetak otomatis saat anda keluar. \nHarap simpan tanda terima ini \nsebagai bukti transaksi anda.");
                    System.out.println("No. record: " + (100000 + (int) (Math.random() * 1000)));
                    System.out.println("Tanggal: " + LocalDate.now());
                    System.out.println("Saldo akhir: Rp. " + atm.cekSaldo());
                    System.out.println("Terima kasih telah menggunakan ATM Progate");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
