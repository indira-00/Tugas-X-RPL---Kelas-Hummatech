
import java.util.Scanner;

public class cabang5 {
    public static void main(String[] args) {
        // Membuat scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan angka (1-7): ");
        int angka = scanner.nextInt();
        
        // Menentukan nama hari berdasarkan angka menggunakan percabangan if-else
        String namaHari;
        
        if (angka == 1) {
            namaHari = "Minggu";
        } else if (angka == 2) {
            namaHari = "Senin";
        } else if (angka == 3) {
            namaHari = "Selasa";
        } else if (angka == 4) {
            namaHari = "Rabu";
        } else if (angka == 5) {
            namaHari = "Kamis";
        } else if (angka == 6) {
            namaHari = "Jum’at";
        } else if (angka == 7) {
            namaHari = "Sabtu";
        } else {
            namaHari = "Input tidak valid. Harap masukkan angka antara 1 hingga 7.";
        }
        
        // Menampilkan hasil
        System.out.println("Hari: " + namaHari);
        
        // Menutup scanner
        scanner.close();
    }
}

