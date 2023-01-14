package org.example;

public class Pesawat
{
    private String kdPesawat;
    private String nama;

    public Pesawat(String kdPesawat, String nama)
    {
        this.kdPesawat = kdPesawat;
        this.nama = nama;
    }

    public String getKdPesawat()
    {
        return kdPesawat;
    }

    public void setKdPesawat(String kdPesawat)
    {
        this.kdPesawat = kdPesawat;
    }

    public String getNama()
    {
        return nama;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }
}
