public class tugas5 {
    public static void main(String[] args) {
        final String namaToko = "Toko Akik Ambalabu";
        final int hargaBasreng = 35_000;
        int potonganPromo = 10_000;
        int potonganReseller =  20_000;

        int hargaPromo = hargaBasreng - potonganPromo;
        int hargaReseller = hargaBasreng - potonganPromo;

        System.out.println("Nama Toko : " + namaToko);
        System.out.println("Harga Basreng : " + hargaBasreng);
        System.out.println("Harga Promo : " + hargaPromo);
        System.out.println("Harga Reseller : " + hargaReseller);
       
        

        
    }
}
