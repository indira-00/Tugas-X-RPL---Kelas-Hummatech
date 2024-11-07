import java.util.Scanner;

public class operator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan alas segitiga: ");
        double alas = scanner.nextDouble();

        System.out.println("Masukkan tinggi segitiga: ");
        double tinggi = scanner.nextDouble();

        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas segitiga tersebut adalah: " + luas);

    }
    
}
