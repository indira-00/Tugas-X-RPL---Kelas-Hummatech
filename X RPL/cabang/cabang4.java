
import java.util.Scanner;

public class cabang4 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pilihan merk
        System.out.println("Pilih merk celana:");
        System.out.println("1. ABC");
        System.out.println("2. DEF");
        System.out.print("Masukkan pilihan merk (1/2): ");
        int pilihanMerk = scanner.nextInt();

        // Menampilkan pilihan ukuran
        System.out.println("Pilih ukuran celana:");
        System.out.println("1. Ukuran 26 - 30");
        System.out.println("2. Ukuran 31 - 34");
        System.out.print("Masukkan pilihan ukuran (1/2): ");
        int pilihanUkuran = scanner.nextInt();

        // Menentukan harga berdasarkan merk dan ukuran
        int harga = 0;

        if (pilihanMerk == 1) { // Merk ABC
            if (pilihanUkuran == 1) {
                harga = 160000; // Ukuran 26 - 30
            } else if (pilihanUkuran == 2) {
                harga = 180000; // Ukuran 31 - 34
            } else {
                System.out.println("Pilihan ukuran tidak valid.");
                scanner.close();
                return;
            }
        } else if (pilihanMerk == 2) { // Merk DEF
            if (pilihanUkuran == 1) {
                harga = 210000; // Ukuran 26 - 30
            } else if (pilihanUkuran == 2) {
                harga = 220000; // Ukuran 31 - 34
            } else {
                System.out.println("Pilihan ukuran tidak valid.");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Pilihan merk tidak valid.");
            scanner.close();
            return;
        }

        // Menampilkan harga celana
        System.out.println("Harga celana yang Anda pilih: Rp. " + harga);

        // Menutup scanner
        scanner.close();
    }
}
