import java.util.Scanner;

public class cabang2 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan total belanja
        System.out.print("Masukkan total belanja Anda (dalam Rp): ");
        double totalBelanja = scanner.nextDouble();

        // Mengecek apakah total belanja memenuhi syarat untuk mendapatkan hadiah
        if (totalBelanja >= 500000) {
            System.out.println("Selamat! Anda mendapatkan gantungan kunci sebagai hadiah.");
        } else {
            // Menghitung sisa belanja yang diperlukan untuk mendapatkan hadiah
            double sisaBelanja = 500000 - totalBelanja;
            System.out.println("Belanja anda kurang dari Rp. 500.000. Silahkan tambah lagi belanjanya senilai Rp. " + sisaBelanja + ". Agar mendapatkan bonus gantungan kunci.");
        }

        // Menutup scanner
        scanner.close();
    }
}

