package org.example;

public class Tujuan
{
    private String kdTujuan;
    private String tujuan;

    public Tujuan(String kdTujuan, String tujuan)
    {
        this.kdTujuan = kdTujuan;
        this.tujuan = tujuan;
    }

    public String getKdTujuan()
    {
        return kdTujuan;
    }

    public void setKdTujuan(String kdTujuan)
    {
        this.kdTujuan = kdTujuan;
    }

    public String getTujuan()
    {
        return tujuan;
    }

    public void setTujuan(String tujuan)
    {
        this.tujuan = tujuan;
    }
}
