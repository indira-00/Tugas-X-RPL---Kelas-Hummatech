import java.util.Scanner;

public class oper13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menampilkan pertanyaan
        System.out.println("Berikut ini manakah yang termasuk jenis operator di dalam pemrograman Java?");
        System.out.println("1. Operator Indosat");
        System.out.println("2. Operator Aritmatika");
        System.out.println("3. Operator Telkomsel");
        System.out.println("4. Operator Assignment");
        
        // Meminta input pengguna
        System.out.print("Masukkan nomor jawaban (1-4): ");
        int jawaban = scanner.nextInt();
        
        // Memeriksa jawaban
        if (jawaban == 2 || jawaban == 4) {
            System.out.println("Jawaban Anda benar!");
        } else {
            System.out.println("Jawaban Anda salah. Jawaban yang benar adalah: Operator Aritmatika dan Operator Assignment.");
        }
        
        // Menutup scanner
        scanner.close();
    }
}

