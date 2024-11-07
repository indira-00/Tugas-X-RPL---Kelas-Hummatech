import java.util.Scanner;

public class input1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        // menerima inputan
        System.out.println("Inputkan nama lengkap: ");
        String nama = input.nextLine();

        System.out.println("Inputkan usia");
        int angka = input.nextInt();

        System.out.println("Inputkan kota Asal");
        String kotaAsal = input.nextLine();

        System.out.println("Inputkan tinggi Badan");
        double tinggiBadan = input.nextDouble();

        // output
        System.out.println("\n======= Output =======");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + angka);
        System.out.println("Kota asal: " + kotaAsal);
        System.out.println("Tinggi Badan: "+ tinggiBadan);


        
    }
    
}
