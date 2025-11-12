import java.util.Scanner;

public class Cafe4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah pesanan
        System.out.println("--- SELAMAT DATANG DI CAFE MOON CAFE ---");
        System.out.print("Masukkan jumlah pesanan : ");
        int jumlah = input.nextInt();

        // Deklarasi dan instansiasi pesanan dan harga
        String[] pesanan = new String[jumlah];
        int[] harga = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nama pesanan (makanan/minuman) ke-" + (i+1) + "  : ");
            input.nextLine();
            pesanan[i] = input.nextLine();
            System.out.print("Masukkan harga pesanan (makanan/minuman) ke-" + (i+1) + " : " + "Rp.");
            harga[i] = input.nextInt();
        }
        System.out.println();

        // Total harga 
        int totalHarga = 0;
        
        for (int i = 0; i < harga.length; i++) {
            totalHarga = totalHarga + harga[i];
        }
 
        // Output pesanan yang diinputkan 
        System.out.println("--- DAFTAR PESANAN ---");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Pesanan ke-" + (i+1) + " : " + pesanan[i]); 
            System.out.println("Harga pesanan ke-" + (i+1) + " : "  + "Rp." + harga[i]);
        }
        
        // Output total biaya pesanan
        System.out.println();
        System.out.println("--- TOTAL BIAYA PESANAN ---");
        System.out.println("Total biaya pesanan : " + "Rp." + totalHarga);
        input.close();
    }
}
