package Jobsheet7;
import java.util.Scanner;

public class PenjualanBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalTiketTerjual = 0;
        int totalPendapatan = 0;

        System.out.println("=== Program Kasir Bioskop (Ketik 0 untuk selesai) ===");

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            int jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan angka positif.");
                continue;
            }

            if (jumlahTiket == 0) {
                break;
            }

            int hargaTiket = 50_000;
            if (jumlahTiket > 10) {
                hargaTiket *= 0.85;
            } else if (jumlahTiket > 4) {
                hargaTiket *= 0.90; 
            }

            int totalTransaksi = jumlahTiket * hargaTiket;
            totalTiketTerjual += jumlahTiket;
            totalPendapatan += totalTransaksi;

            System.out.println("Total harga untuk transaksi ini: " + totalTransaksi);
        }

        System.out.println("\n--- REKAPITULASI PENJUALAN HARI INI ---");
        System.out.println("Total tiket terjual : " + totalTiketTerjual);
        System.out.println("Total pendapatan    : Rp " + totalPendapatan);

        sc.close();
    }
}