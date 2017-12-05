package id.ivan;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        int pilih;
        String yes;
        do {
            System.out.println("******************");
            System.out.println("1.  Penjumlahan");
            System.out.println("2.  Pengurangan");
            System.out.println("3.  Perkalian");
            System.out.println("4.  Pembagian");
            System.out.println("5.  Keluar");
            System.out.println("******************");
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            System.out.println();
            switch (pilih) {

                case 1:
                    System.out.println("MENU PENJUMLAHAN");
                    Tambah satu;
                    System.out.print("Input x : ");
                    x = input.nextInt();
                    System.out.print("Input y : ");
                    y = input.nextInt();
                    System.out.println();
                    satu = new Tambah(x, y);
                    System.out.println(+x + " + " + y + " : " + satu.getTambah());
                    break;

                case 2:
                    System.out.println("MENU PENGURANGAN");
                    Kurang dua;
                    System.out.print("Input x : ");
                    x = input.nextInt();
                    System.out.print("Input y : ");
                    y = input.nextInt();
                    System.out.println();
                    dua = new Kurang(x, y);
                    System.out.println(+x + " - " + y + " : " + dua.getKurang());
                    break;

                case 3:
                    System.out.println("MENU PERKALIAN");
                    Kali tiga;
                    System.out.print("Input x : ");
                    x = input.nextInt();
                    System.out.print("Input y : ");
                    y = input.nextInt();
                    System.out.println();
                    tiga = new Kali(x, y);
                    System.out.println(+x + " x " + y + " : " + tiga.getKali());
                    break;

                case 4:
                    System.out.println("MENU PEMBAGIAN");
                    Bagi empat;
                    System.out.print("Input x : ");
                    x = input.nextInt();
                    System.out.print("Input y : ");
                    y = input.nextInt();
                    System.out.println();
                    empat = new Bagi(x, y);
                    System.out.println(+x + " / " + y + " : " + empat.getBagi());
                    break;
            }
            System.out.print("Kembali ke menu (y/n) : ");
            yes = input.next();
        } while (yes.equals("y"));
    }
}
