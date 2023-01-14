package org.example;

public class DataPenerbangan
{
    private int noPenerbangan;
    private String kodePesawat;
    private String kodeTujuan;
    private int jumlahTiket;

    private String key;

    public DataPenerbangan(int noPenerbangan, String kodePesawat, String kodeTujuan, int jumlahTiket)
    {
        this.noPenerbangan = noPenerbangan;
        this.kodePesawat = kodePesawat;
        this.kodeTujuan = kodeTujuan;
        this.jumlahTiket = jumlahTiket;
        key = kodePesawat + "-" + kodeTujuan;
    }

    public String getKey()
    {
        return key;
    }


    public int getNoPenerbangan()
    {
        return noPenerbangan;
    }

    public void setNoPenerbangan(int noPenerbangan)
    {
        this.noPenerbangan = noPenerbangan;
    }

    public String getKodePesawat()
    {
        return kodePesawat;
    }

    public void setKodePesawat(String kodePesawat)
    {
        this.kodePesawat = kodePesawat;
    }

    public String getKodeTujuan()
    {
        return kodeTujuan;
    }

    public void setKodeTujuan(String kodeTujuan)
    {
        this.kodeTujuan = kodeTujuan;
    }

    public int getJumlahTiket()
    {
        return jumlahTiket;
    }

    public void setJumlahTiket(int jumlahTiket)
    {
        this.jumlahTiket = jumlahTiket;
    }

    @Override
    public String toString()
    {
        return "DataPenerbangan{" +
                "noPenerbangan=" + noPenerbangan +
                ", kode_pesawat='" + kodePesawat + '\'' +
                ", kode_tujuan='" + kodeTujuan + '\'' +
                ", jumlah_tiket=" + jumlahTiket +
                ", key='" + key + '\'' +
                '}';
    }
}
