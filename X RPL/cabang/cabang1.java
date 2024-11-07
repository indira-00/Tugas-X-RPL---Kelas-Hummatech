import java.util.Scanner;
public class cabang1 {

    public static boolean cabang1(int totalBelanja) {
        // Fungsi untuk mengecek apakah pelanggan berhak mendapatkan gantungan kunci atau tidak.
        int minimalBelanja = 500000;
        return totalBelanja >= minimalBelanja;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Program Pemberian Hadiah Gantungan Kunci");
        System.out.println("----------------------------------------");

        System.out.print("Masukkan total belanja: Rp ");
        int totalBelanja = scanner.nextInt();

        if (cabang1(totalBelanja)) {
            System.out.println("Selamat, Anda berhak mendapatkan gantungan kunci!");
        } else {
            System.out.println("Maaf, Anda belum berhak mendapatkan gantungan kunci.");
        }

        scanner.close();
    }
}

