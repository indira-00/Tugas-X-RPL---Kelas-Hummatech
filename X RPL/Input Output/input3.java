import java.util.Scanner;

public class input3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Jenis Kelamin: ");
        char jenisKelamin = input.nextLine(). charAt(0);

        System.out.print("Nomor Sepatu: ");
        int nomorSepatu = input.nextInt();

        System.out.print("Sudah Menikah");
        boolean sudahMenikah = input.nextBoolean();

        //output
        System.out.println("\n====== Output ======");
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Nomor Sepatu: " + nomorSepatu);
        System.out.println(" Sudah Menikah: " + sudahMenikah);
        input.close();

        

    }
    

}
