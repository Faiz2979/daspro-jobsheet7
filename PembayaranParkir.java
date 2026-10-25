package Jobsheet7;
import java.util.Scanner;

public class PembayaranParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 Mobil, 2 Motor, 0 Keluar
        int jenis = 0; 
        int durasi = 0, total = 0;

        do {
            System.out.print("Input jenis (1 mobil, 2 motor, 0 keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Input durasi: ");
                durasi = sc.nextInt();

                if (jenis == 1) {
                    total += durasi * 3000; 
                } else {
                    total += durasi * 2000;
                }
            }
        } while (jenis != 0);

       
        System.out.println("Output total: " + total);

        sc.close();
    }
}