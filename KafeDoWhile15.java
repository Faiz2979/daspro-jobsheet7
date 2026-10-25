package Jobsheet7;
import java.util.Scanner;


public class KafeDoWhile15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int kopi=0, teh=0, roti=0;
        int hargaKopi =12_000, hargaTeh = 7_000, hargaRoti = 20_000;
        int totalHarga;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan, atau ketik 'exit' untuk keluar: ");
            namaPelanggan = sc.nextLine();
            if(namaPelanggan.equalsIgnoreCase("exit")) {
                System.out.println("Terima kasih telah menggunakan layanan kami!");
                break;
            }
            
            System.out.println("Jumlah kopi yang dipesan: ");
            kopi = sc.nextInt();
            System.out.println("Jumlah teh yang dipesan: ");
            teh = sc.nextInt();
            System.out.println("Jumlah roti yang dipesan: ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total harga untuk " + namaPelanggan + " adalah: Rp" + totalHarga);

            sc.nextLine(); // Membersihkan buffer input
        } while (true);

        System.out.println("Terima kasih telah menggunakan layanan kami!");
        sc.close();
    }
}