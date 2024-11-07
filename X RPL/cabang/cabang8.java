
import java.util.InputMismatchException;
import java.util.Scanner;

public class cabang8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka pertama: ");
            int inputAngka1 = scanner.nextInt();

            System.out.print("Masukkan angka kedua: ");
            int inputAngka2 = scanner.nextInt();

            // Menentukan dan mencetak hasil untuk angka pertama
            if (inputAngka1 % 2 == 0) {
                System.out.println(inputAngka1 + " adalah bilangan genap.");
            } else {
                System.out.println(inputAngka1 + " adalah bilangan ganjil.");
            }

            // Menentukan dan mencetak hasil untuk angka kedua
            if (inputAngka2 % 2 == 0) {
                System.out.println(inputAngka2 + " adalah bilangan genap.");
            } else {
                System.out.println(inputAngka2 + " adalah bilangan ganjil.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Silakan masukkan angka yang valid.");
        } finally {
            scanner.close(); // Menutup scanner
        }
    }
}

