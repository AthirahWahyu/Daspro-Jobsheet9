import java.util.Scanner;

public class ArrayNilai4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi array bertipe integer dengan
        // nama nilaiAkhir dan berkapasitas 10 elemen
        int[] nilaiAkhir = new int[10];
        
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke - " + i + " : ");
            nilaiAkhir[i] = input.nextInt();            
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] >= 70) {
                System.out.println("Nilai akhir ke-" + i + " Lulus! ");
            } else {
                System.out.println("Nilai akhir ke-" + i + " Tidak Lulus! ");
            }
        }
        input.close();
    }
}
