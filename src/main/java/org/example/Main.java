package org.example;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<DataPenerbangan> dataPenerbangan = new ArrayList<>();

        Map<String, String> pesawat = new HashMap<>();
        pesawat.put("LA", "Lion Air");
        pesawat.put("BA", "Batik Air");
        pesawat.put("CL", "Citilink");
        pesawat.put("GA", "Garuda Indonesia");

        Map<String, String> tujuan = new HashMap<>();
        tujuan.put("BTH", "Batam");
        tujuan.put("SUB", "Surabaya");
        tujuan.put("DPS", "Denpasar");

        Map<String, Integer> hargaTiket = new HashMap<>();
        hargaTiket.put("LA-DPS", 731000);
        hargaTiket.put("LA-BTH", 1006000);
        hargaTiket.put("LA-SUB", 674500);
        hargaTiket.put("BA-DPS", 843500);
        hargaTiket.put("BA-BTH", 1085500);
        hargaTiket.put("BA-SUB", 841000);
        hargaTiket.put("CL-DPS", 743000);
        hargaTiket.put("CL-BTH", 988000);
        hargaTiket.put("CL-SUB", 833000);
        hargaTiket.put("GA-DPS", 1869000);
        hargaTiket.put("GA-BTH", 1931000);
        hargaTiket.put("GA-SUB", 1568000);

        DecimalFormat rupiahFormat = new DecimalFormat("Rp #,###");

        // Bertanya berapa banyak data
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan banyak data: ");
        int jumlahData = scanner.nextInt();

        // Looping sebanyak jumlah data
        for (int i = 0; i < jumlahData; i++)
        {
            // Mengisi data
            System.out.println("Masukkan data ke-" + (i + 1));
            System.out.print("No Penerbangan: ");
            int noPenerbangan = scanner.nextInt();
            System.out.print("Kode Pesawat: ");
            String kode_pesawat = scanner.next();
            System.out.print("Kode Tujuan: ");
            String kode_tujuan = scanner.next();
            System.out.print("Jumlah Tiket: ");
            int jumlah_tiket = scanner.nextInt();
            System.out.println();

            // Menambahkan ke array
            dataPenerbangan.add(new DataPenerbangan(noPenerbangan, kode_pesawat, kode_tujuan, jumlah_tiket));
        }

        // Looping untuk menampilkan data
        System.out.println("No. | Kode Pesawat | Nama Pesawat | Kode Tujuan | Daerah Tujuan | Harga Tiket | Jumlah Tiket | Diskon | Total Bayar");
        System.out.printf("%2s  | %10s  | %17s  | %9s  | %12s  | %10s  | %11s  | %6s  | %11s\n",
                    "No.", "Kode Pesawat", "Nama Pesawat", "Kode Tujuan", "Daerah Tujuan", "Harga Tiket", "Jumlah Tiket", "Diskon", "Total Bayar");

        System.out.println("------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < dataPenerbangan.size(); i++)
        {
            DataPenerbangan data = dataPenerbangan.get(i);

            String kodePesawat = data.getKodePesawat();
            String kodeTujuan = data.getKodeTujuan();
            int harga = hargaTiket.get(data.getKey());
            int jumlahTiket = data.getJumlahTiket();
            int jumlahBayar = harga * jumlahTiket;
            int diskon = hitungDiskon(jumlahBayar);
            int total = jumlahBayar - (jumlahBayar * diskon);

            System.out.printf("%2d  | %10s  | %17s  | %9s  | %12s  | %10s  | %11d  | %6d  | %11s\n",
                    i + 1, kodePesawat, pesawat.get(kodePesawat), kodeTujuan, tujuan.get(kodeTujuan),
                    rupiahFormat.format((double) harga),
                    jumlahTiket, diskon, rupiahFormat.format((double) total));
        }
    }

    public static int hitungDiskon(int jumlahBayar)
    {
        int diskon = 0;

        if (jumlahBayar > 10_000_000)
        {
            diskon = 25 / 100;
        }
        else if (jumlahBayar > 7_500_000)
        {
            diskon = 15 / 100;
        }
        else if (jumlahBayar > 5_000_000)
        {
            diskon = 10 / 100;
        }

        return diskon;
    }
}
