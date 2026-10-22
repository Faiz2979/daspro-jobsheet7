package Jobsheet7;
import java.util.Scanner;


public class SiakadFor15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi=0, terendah=100;
        int lulus=0, mahasiswa = 10;
        for(int i=1; i<=mahasiswa; i++){
            System.out.print("Masukkan nilai ke-"+i+" : ");
            nilai = sc.nextDouble();
            if(nilai>tertinggi){
                tertinggi = nilai;
            }
            if(nilai<terendah){
                terendah = nilai;
            }
            if(nilai>=60){
                lulus++;
            }
        }
        System.out.println("Nilai tertinggi adalah : "+tertinggi);
        System.out.println("Nilai terendah adalah : "+terendah);
        
        System.out.println("Jumlah mahasiswa yang lulus adalah : "+lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus adalah : "+(mahasiswa-lulus));
        sc.close();
    }
}
