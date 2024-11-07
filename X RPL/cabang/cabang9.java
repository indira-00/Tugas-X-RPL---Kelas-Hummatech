
import java.util.Scanner;

public class cabang9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pemilihan menu:");
        System.out.println("1. Penentuan angka terbesar");
        System.out.println("2. Penentuan angka ganjil dan genap");
        System.out.print("Masukkan pilihan anda: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan angka pertama: ");
                double angka1 = scanner.nextDouble();
                System.out.print("Masukkan angka kedua: ");
                double angka2 = scanner.nextDouble();
                if (angka1 > angka2) {
                    System.out.println("Angka terbesar adalah: " + angka1);
                } else if (angka2 > angka1) {
                    System.out.println("Angka terbesar adalah: " + angka2);
                } else {
                    System.out.println("Kedua angka sama.");
                }
                break;
            case 2:
                System.out.print("Masukkan angka pertama: ");
                int num1 = scanner.nextInt();
                System.out.print("Masukkan angka kedua: ");
                int num2 = scanner.nextInt();
                if (num1 % 2 == 0) {
                    System.out.println(num1 + " adalah bilangan genap.");
                } else {
                    System.out.println(num1 + " adalah bilangan ganjil.");
                }
                if (num2 % 2 == 0) {
                    System.out.println(num2 + " adalah bilangan genap.");
                } else {
                    System.out.println(num2 + " adalah bilangan ganjil.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}

