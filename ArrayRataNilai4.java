 import java.util.Scanner;

    public class ArrayRataNilai4 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Membuat array nilaiMhs bertipe integer dengan kapasitas 10. 
            // Kemudian mendeklarasi variable total dan rata2
            int[] nilaiMhs = new int [10];
            double total = 0;
            double rata2;
            int jumlahLulus = 0; // untuk menghitung mahasiswa yang lulus

            // Mengisi array nilaiMhs dengan nilai dari input pengguna
            for (int i = 0; i < nilaiMhs.length; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-"+ (i+1) +" : ");
                    nilaiMhs [i] = input.nextInt();
            }
        
            // Menggunakan perulangan untuk menghitung jumlah 
            // keseluruhan nilai dalam array nilaiMhs
            for (int i = 0; i < nilaiMhs.length; i++) {
                total = total + nilaiMhs[i];

            // Jika nilai mahasiswa lebih dari 70, menambahkan jumlahLulus
                if (nilaiMhs[i] > 70) {
                    jumlahLulus++;
                }
            }

            // Menghitung nilai rata-rata dengan cara nilai 
            // total dibagi jumlah elemen dari array nilaiMhs
            rata2 = total/nilaiMhs.length;

            // Output 
            System.out.println("-------------------------------------");
            System.out.println("Rata - rata nilai = " + rata2);
            System.out.println("Jumlah mahasiswa yang lulus = " + jumlahLulus);

            input.close();
        }
    }
    