import java.util.Scanner;

public class SearchNilai4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input banyaknya nilai (jumlah elemen array)
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlah = input.nextInt();

        // Deklarasi array dengan ukuran sesuai input pengguna 
        int[] arrNilai = new int[jumlah];

        // Input nilai - nilai mahasiswa 
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            arrNilai[i] = input.nextInt();
        }

        // Input nilai yang ingin dicari 
        System.out.print("Masukkan nilai yang ingin dicari : ");
        int key = input.nextInt();

        // Variabel untuk menyimpan posisi hasil pencarian 
        int hasil = -1; // -1 berarti belum ditemukan 

        // Proses pencarian nilai dalam array 
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break; // langsung berhenti setelah ketemu 
            }
        }
        System.out.println(); // baris kosong 

        // Menampilkan hasil pencarian 
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } 
        input.close();
    }
}
