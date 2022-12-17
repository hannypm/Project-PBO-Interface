package PBO;

import java.util.Scanner;

public class Minuman extends Barang
{
    private int harga;

    public int getHarga()
    {
        return harga;
    }

    public void setHarga(int harga)
    {
        this.harga = harga;
    }

    @Override
    void display()
    {
        System.out.println("======================");
        System.out.println("Daftar Pilihan Minuman");
        System.out.println("======================");
        System.out.println("1. Coca-cola");
        System.out.println("2. Sprite");
        System.out.println("3. Fanta");
        pilihBarang();
    }

    @Override
    void pilihBarang()
    {
        System.out.println("Pilih Minuman");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan pilihan : ");
        int choose = input.nextInt();
        switch (choose)
        {
            case 1:
                System.out.println("Anda Memilih Coca-cola");
                barang = "Minuman1";
                break;
            case 2:
                System.out.println("Anda Memilih Sprite");
                barang = "Minuman2";
                break;
            case 3:
                System.out.println("Anda Memilih Fanta");
                barang = "Minuman3";
                break;
        }
    }
}

