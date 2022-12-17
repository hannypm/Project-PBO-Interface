package PBO;

import java.util.Scanner;

public class Makanan extends Barang
{
    private int harga;

    public int getHarga()
    {
        return harga;
    }

    public void setHarga(int harga)
    {
        this.harga = harga ;
    }

    @Override
    void display()
    {
        System.out.println("======================");
        System.out.println("Daftar Pilihan Makanan");
        System.out.println("======================");
        System.out.println("1. Cheetos");
        System.out.println("2. Qtela");
        System.out.println("3. Lays");
        pilihBarang();
    }

    @Override
    void pilihBarang()
    {
        System.out.println("Pilih Makanan");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan pilihan : ");
        int choose = input.nextInt();
        switch (choose)
        {
            case 1:
                System.out.println("Anda Memilih Cheetos");
                barang = "makanan1";
                break;
            case 2:
                System.out.println("Anda Memilih Qtela");
                barang = "makanan2";
                break;
            case 3:
                System.out.println("Anda Memilih Lays");
                barang = "makanan3";
                break;
        }
    }
}