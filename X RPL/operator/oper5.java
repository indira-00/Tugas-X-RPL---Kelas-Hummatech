import javax.swing.JOptionPane;

public class oper5 {
    public static void main(String[] args) {
        // Inisialisasi jumlah barang
        int sirup = 5;
        int deterjen = 6;
        int miInstan = 10;

        // Menampilkan jumlah awal barang
        String message = "Jumlah awal barang:\n" +
                         "Sirup: " + sirup + " botol\n" +
                         "Deterjen: " + deterjen + " bungkus\n" +
                         "Mi Instan: " + miInstan + " bungkus";
        JOptionPane.showMessageDialog(null, message);

        // Mengambil input tambahan dari pengguna
        String inputSirup = JOptionPane.showInputDialog("Masukkan jumlah tambahan sirup:");
        String inputDeterjen = JOptionPane.showInputDialog("Masukkan jumlah tambahan deterjen:");
        String inputMiInstan = JOptionPane.showInputDialog("Masukkan jumlah tambahan mi instan:");

        // Mengonversi input ke integer
        int tambahanSirup = Integer.parseInt(inputSirup);
        int tambahanDeterjen = Integer.parseInt(inputDeterjen);
        int tambahanMiInstan = Integer.parseInt(inputMiInstan);

        // Menambahkan jumlah barang menggunakan operator assignment
        sirup += tambahanSirup;
        deterjen += tambahanDeterjen;
        miInstan += tambahanMiInstan;

        // Menampilkan jumlah akhir barang
        String finalMessage = "Jumlah akhir barang:\n" +
                              "Sirup: " + sirup + " botol\n" +
                              "Deterjen: " + deterjen + " bungkus\n" +
                              "Mi Instan: " + miInstan + " bungkus";
        JOptionPane.showMessageDialog(null, finalMessage);
    }
} 
    

