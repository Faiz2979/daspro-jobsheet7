package Jobsheet7;

import java.util.Scanner;

public class SiakadWhile15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai, jml, i = 0;

        System.out.print("Masukkan jumlah mahasiswa : ");
        jml = sc.nextInt();

        while (i < jml) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan nilai antara 0-100.");
                continue;
            }
            if (nilai > 80 && nilai <= 100) {
                System.out.println("Predikat : A");
                System.out.println("Bagus, pertahankan prestasimu!");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Predikat : B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Predikat : B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Predikat : C+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Predikat : C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Predikat : D");
            } else {
                System.out.println("Predikat : E");
            }
            i++;
        }

        sc.close();
    }

}
