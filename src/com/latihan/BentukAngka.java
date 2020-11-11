/*
1=
11111
    1
    1
    1
    1
    1
    1
    1
111111111

2 =
222222222
        2
        2
        2
222222222
2
2
2
222222222

3 =
333333333
        3
        3
        3
333333333
        3
        3
        3
333333333

4 =
4       4
4       4
4       4
4       4
444444444
        4
        4
        4
        4

5 =
555555555
5
5
5
555555555
        5
        5
        5
555555555

6 =
666666666
6
6
6
666666666
6       6
6       6
6       6
666666666

7 =
777777777
        7
        7
        7
        7
        7
        7
        7
        7

8 =
888888888
8       8
8       8
8       8
888888888
8       8
8       8
8       8
888888888

9 =
999999999
9       9
9       9
9       9
999999999
        9
        9
        9
999999999

0 =
000000000
0       0
0       0
0       0
0       0
0       0
0       0
0       0
000000000
* */
package com.latihan;

import java.util.Scanner;


public class BentukAngka {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//      deklarasi variabel;
        int baris, kolom, spasi, batas = 9, angka, input, inputan, digit = 0;

        System.out.print("Masukkan angka: ");
        inputan = in.nextInt();
        input = inputan;

        while (input > 0) {
            digit++;
            input /= 10;
        }

        for (int i = 1; i <= digit; digit--) {
            angka = (int) (inputan / Math.pow(10, digit-1) % 10);

//      pencetak angka
        switch (angka) {
            case 1:
                //      angka 1
                System.out.println();
                baris = 1;
                while (baris <= batas) {

                    kolom = 1;
                    spasi = 1;

                    if (baris == 1) {
                        while (kolom <= 5) {
                            System.out.print("1");
                            kolom++;
                        }
                    } else if (baris > 1 && baris < batas) {
                        while (spasi <= 4) {
                            System.out.print(" ");
                            spasi++;
                        }
                        while (kolom == 1) {
                            System.out.print("1");
                            kolom++;
                        }
                    } else {
                        while (kolom <= batas) {
                            System.out.print("1");
                            kolom++;
                        }
                    }
                    System.out.println();
                    baris++;
                }

                break;
            case 2:
                //      angka 2
                System.out.println();
                baris = 1;
                while (baris <= batas) {

                    kolom = 1;
                    spasi = 1;

                    switch (baris) {
                        case 1: case 5: case 9:
                            while (kolom <= batas) {
                                System.out.print("2");
                                kolom++;
                            }
                            break;
                    }
                    if (baris > 1 && baris < 5) {
                        while (spasi < batas) {
                            System.out.print(" ");
                            spasi++;
                        }
                        while (kolom == 1) {
                            System.out.print("2");
                            kolom++;
                        }
                    } else if (baris > 5 && baris < batas) {
                        while (kolom == 1) {
                            System.out.print("2");
                            kolom++;
                        }
                    }
                    System.out.println();
                    baris++;
                }

                break;
            case 3:
                //      angka 3
                System.out.println();
                baris = 1;
                while (baris <= batas) {
                    kolom = 1;
                    spasi = 1;

                    switch (baris) {
                        case 1: case 5: case 9:
                            while (kolom <= batas) {
                                System.out.print("3");
                                kolom++;
                            }
                            break;
                    }
                    if (baris > 1 && baris < 5  || baris > 5 && baris < batas) {
                        while (spasi <= 8) {
                            System.out.print(" ");
                            spasi++;
                        }
                        while (kolom == 1) {
                            System.out.print("3");
                            kolom++;
                        }
                    }
                    System.out.println();
                    baris++;
                }

                break;
            case 4:
        //      angka 4
                System.out.println();
                baris = 1;
                while (baris <= 9) {

                    kolom = 1;

                    if (baris == 5) {
                        while (kolom <= batas) {
                            System.out.print("4");
                            kolom++;
                        }
                    }

                    while (kolom <= batas) {
                        if (baris >= 1 && baris < 5 && kolom == 1 || kolom == 9) {
                            System.out.print("4");

                        }
                        if (baris >= 1 && baris < 5 && kolom >= 2 && kolom < batas || baris > 5 && kolom >= 1) {
                            System.out.print(" ");
                        }
                        kolom++;
                    }
                    System.out.println();
                    baris++;
                }

                break;
            case 5:
        //      angka 5
                System.out.println();
                baris = 1;
                while (baris <= batas) {
                    kolom = 1;

                    while (kolom <= batas) {
                        switch (baris) {
                            case 1: case 5: case 9:
                                while (kolom <= batas) {
                                    System.out.print("5");
                                    kolom++;
                                }
                                break;
                        }
                        while (kolom <= batas) {
                            if (baris > 1 && baris < 5 && kolom == 1 || baris > 5 && kolom == batas) {
                                System.out.print("5");
                            } else {
                                System.out.print(" ");
                            }
                            kolom++;
                        }
                        kolom++;
                    }
                    System.out.println();
                    baris++;
                }

                break;
            case 6:
        //      angka 6
                System.out.println();
                baris = 1;
                while (baris <= batas) {
                    kolom = 1;
                    while (kolom <= batas) {
                        switch (baris) {
                            case 1: case 5: case 9:
                                while (kolom <= batas) {
                                    System.out.print("6");
                                    kolom++;
                                }
                                break;
                        }
                        if (kolom == 1 || (baris > 5 && kolom == batas)) {
                            System.out.print("6");
                        } else {
                            System.out.print(" ");
                        }
                        kolom++;
                    }
                    System.out.println();
                    baris++;
                }
                break;
            case 7:
        //      angka 7
                System.out.println();
                baris = 1;
                while (baris <= batas) {
                    kolom = 1;
                    while (kolom <= batas) {
                        if (baris == 1 || baris > 1 && kolom == batas) {
                            System.out.print("7");
                        } else {
                            System.out.print(" ");
                        }
                        kolom++;
                    }
                    System.out.println();
                    baris++;
                }
                break;
            case 8:
        //      angka 8
                System.out.println();
                baris = 1;
                while (baris <= batas) {
                    kolom = 1;
                    while (kolom <= batas) {
                        if (baris == 1 || baris == 5 || baris == batas || kolom == 1 || kolom == batas) {
                            System.out.print("8");
                        } else {
                            System.out.print(" ");
                        }
                        kolom++;
                    }
                    System.out.println();
                    baris++;
                }
                break;
            case 9:
        //      angka 9
                System.out.println();
                baris = 1;
                while (baris <= batas) {
                    kolom = 1;
                    while (kolom <= batas) {
                        if (baris == 1 || baris == 5 || baris == batas || baris > 1 && baris < 5 && kolom == 1 || kolom == batas) {
                            System.out.print("9");
                        } else {
                            System.out.print(" ");
                        }
                        kolom++;
                    }
                    System.out.println();
                    baris++;
                }
                break;
            case 0:
        //      angka 0
                System.out.println();
                baris = 1;
                while (baris <= batas) {
                    kolom = 1;
                    while (kolom <= batas) {
                        if (baris == 1 || baris == batas || kolom == 1 || kolom == batas) {
                            System.out.print("0");
                        } else {
                            System.out.print(" ");
                        }
                        kolom++;
                    }
                    System.out.println();
                    baris++;
                }
                break;
        }
        }
    }
}
