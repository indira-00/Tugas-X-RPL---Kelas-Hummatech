
import java.util.InputMismatchException;
import java.util.Scanner;

public class cabang7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka pertama: ");
            double inputAngka1 = scanner.nextDouble();

            System.out.print("Masukkan angka kedua: ");
            double inputAngka2 = scanner.nextDouble();

            // Menggunakan percabangan untuk menentukan angka terbesar
            if (inputAngka1 > inputAngka2) {
                System.out.println("Angka terbesar adalah: " + inputAngka1);
            } else if (inputAngka2 > inputAngka1) {
                System.out.println("Angka terbesar adalah: " + inputAngka2);
            } else {
                System.out.println("Kedua angka sama.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Silakan masukkan angka yang valid.");
        } finally {
            scanner.close(); // Menutup scanner
        }
    }
}

