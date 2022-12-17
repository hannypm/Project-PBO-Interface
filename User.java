package PBO;

import java.util.Scanner;
public class User implements Mesin
{
    private int uang = 50000;
    private int noBarang;

    @Override
    public void kembalian()
    {
        System.out.println(uang - harga);
    }

    public int getUang()
    {
        return uang;
    }

    public void setUang(int uang)
    {
        this.uang = uang;
    }

    public int getNoBarang()
    {
        return noBarang;
    }

    public void setNoBarang(int noBarang)
    {
        this.noBarang = noBarang;
    }


}