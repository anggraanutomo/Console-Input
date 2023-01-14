package org.example;

public class Tiket
{
    private Pesawat pesawat;
    private Tujuan tujuan;
    private int harga;

    public Tiket(Pesawat pesawat, Tujuan tujuan, int harga)
    {
        this.pesawat = pesawat;
        this.tujuan = tujuan;
        this.harga = harga;
    }

    public Pesawat getPesawat()
    {
        return pesawat;
    }

    public void setPesawat(Pesawat pesawat)
    {
        this.pesawat = pesawat;
    }

    public Tujuan getTujuan()
    {
        return tujuan;
    }

    public void setTujuan(Tujuan tujuan)
    {
        this.tujuan = tujuan;
    }

    public int getHarga()
    {
        return harga;
    }

    public void setHarga(int harga)
    {
        this.harga = harga;
    }
}
