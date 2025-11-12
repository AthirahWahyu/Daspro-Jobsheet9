import java.util.Scanner;

public class NilaiMahasiswa4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Input banyaknya nilai mahasiswa yang akan diinput
        System.out.println("--- PROGRAM MENYIMPAN DAN MENGELOLA NILAI MAHASISWA ---");
        System.out.print("Masukkan banyak nilai mahasiswa yang akan diinput : ");
        int jumlah = input.nextInt();

        // Deklarasi array dengan ukuran sesuai input user 
        int[] nilai = new int[jumlah]; 

        // Input nilai-nilai mahasiswa menggunakan array dari input pengguna 
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilai[i] = input.nextInt();
        }
        System.out.println();

        // Menghitung total nilai
        int totalNilai = 0;
        double rata2;

        for (int i = 0; i < nilai.length; i++) {
            totalNilai = totalNilai + nilai[i];
        }

        // Menghitung rata-rata
        rata2 = totalNilai / jumlah;

        System.out.println("--- RATA - RATA ---");
        System.out.println("Nilai rata-rata : " + rata2);

        System.out.println();

        // Menampilkan nilai tertinggi dan terendah
        int nilaiTertinggi = 0;
        int nilaiTerendah = 100;

        for (int i = 0; i < nilai.length; i++) {

            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            } else if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
        }

        // Output 
        System.out.println("--- NILAI TERTINGGI DAN NILAI TERENDAH ---");
        System.out.println("Nilai tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai terendah  : " + nilaiTerendah);

        System.out.println();

        System.out.println("--- NILAI YANG DIINPUTKAN ---");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i+1) + " : " + nilai[i]);
        }
        input.close();
    }
}

