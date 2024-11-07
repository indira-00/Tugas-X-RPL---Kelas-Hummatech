
    import java.util.Scanner;

public class cabang6 {
    public static void main(String[] args) {
        // Membuat scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan kode plat nomor (huruf): ");
        String kodePlat = scanner.nextLine().toUpperCase(); // Mengubah input menjadi huruf besar
        
        // Menentukan nama kota berdasarkan kode plat
        String namaKota;
        
        switch (kodePlat) {
            case "N":
                namaKota = "Malang";
                break;
            case "B":
                namaKota = "Jakarta";
                break;
            case "D":
                namaKota = "Bandung";
                break;
            case "L":
                namaKota = "Surabaya";
                break;
            case "P":
                namaKota = "Jember, Banyuwangi, Bondowoso, Situbondo";
                break;
            case "S":
                namaKota = "Semarang";
                break;
            case "T":
                namaKota = "Tangerang";
                break;
            default:
                namaKota = "Kode plat tidak valid. Harap masukkan huruf yang sesuai.";
        }
        
        // Menampilkan hasil
        System.out.println("Kota: " + namaKota);
        
        // Menutup scanner
        scanner.close();
    }
}

