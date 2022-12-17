package PBO;

public abstract class Barang
{
    protected int nomer;
    protected String barang;
    protected int stokBarang;
    protected int harga;

    abstract void display();

    abstract void pilihBarang();
}