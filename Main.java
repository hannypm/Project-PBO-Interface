package PBO;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("SELAMAT DATANG DI VENDING MACHINE MAKANAN DAN MINUMAN");
        //NANTI USER NGINPUTIN UANG
        Scanner input = new Scanner(System.in);
        User usr = new User();
        System.out.print("MasukKan Uang Kelipatan 50000 : ");
        int uang=input.nextInt();
        usr.getUang();
        System.out.println("Silahkan Pilih Jenis Barang :");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.print("Masukkan Pilihan Anda : ");
        int choose = input.nextInt();
        switch (choose)
        {
            case 1:
                Barang makan = new Makanan();
                makan.display();
                break;
            case 2:
                Barang minum = new Minuman();
                minum.display();
                break;
        }
        System.out.println("Sisa Uang Anda : " );
        usr.kembalian();
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scn = new Scanner(System.in);
        {
            System.out.println("Apakah Anda Ingin Keluar?");
            System.out.print("Jawab Y/N : ");

            jawab = scn.nextLine();

            // cek jawabnnya, kalau ya maka berhenti mengulang
            if( jawab.equalsIgnoreCase("Y") )
            {
                running = false;
            }
            System.out.println("Anda Sudah Melakukan Perulangan Sebanyak " + counter + " Kali");
            counter++;
        }
    }
}