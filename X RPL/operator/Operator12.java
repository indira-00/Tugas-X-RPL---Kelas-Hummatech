import java.util.Scanner;
public class Operator12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Tinggi Badan Anda: ");
        double tinggiBadan = scanner.nextDouble();

        System.out.println("Masukkan Nilai UN Anda: ");
        double nilaiUn = scanner.nextDouble();

        double minTinggi = 160;
        double minNilai = 80;

        if (tinggiBadan >= minTinggi && nilaiUn >= minNilai) {
            System.out.println("True : Kamu Memenuhi Persyaratan");
        } else {
            System.out.println("False: Kamu Tidak Memenuhi");
        }
        
    }
}
