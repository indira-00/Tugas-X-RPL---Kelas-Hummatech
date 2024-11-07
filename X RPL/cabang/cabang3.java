import java.util.Scanner;

public class cabang3 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nilai angka
        System.out.print("Masukkan nilai angka (0 - 100): ");
        int nilaiAngka = scanner.nextInt();

        // Menentukan nilai huruf berdasarkan rentang nilai angka
        String nilaiHuruf;

        if (nilaiAngka >= 81 && nilaiAngka <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAngka >= 71 && nilaiAngka <= 80) {
            nilaiHuruf = "B";
        } else if (nilaiAngka >= 51 && nilaiAngka <= 70) {
            nilaiHuruf = "C";
        } else if (nilaiAngka >= 21 && nilaiAngka <= 50) {
            nilaiHuruf = "D";
        } else if (nilaiAngka >= 0 && nilaiAngka <= 20) {
            nilaiHuruf = "E";
        } else {
            nilaiHuruf = "Nilai tidak valid. Harap masukkan nilai antara 0 hingga 100.";
        }

        // Menampilkan hasil konversi
        System.out.println("Nilai huruf Anda: " + nilaiHuruf);

        // Menutup scanner
        scanner.close();
    }
}

