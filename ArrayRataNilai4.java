import java.util.Scanner;

public class ArrayRataNilai4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah mahasiswa 
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = input.nextInt();

        // Membuat array dengan ukuran sesuai input pengguna 
        int[] nilaiMhs  = new int[jumlahMhs];

        // Membuat array nilaiMhs bertipe integer dengan kapasitas 10. 
        // Kemudian mendeklarasi variable total dan rata2
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int jumlahLulus = 0; // untuk menghitung mahasiswa yang lulus
        int jumlahTidakLulus = 0;

        // Mengisi array nilaiMhs dengan nilai dari input pengguna
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+ (i+1) +" : ");
            nilaiMhs [i] = input.nextInt();
        }
        
        // Menghitung total nilai lulus dan tidak lulus
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus = totalLulus + nilaiMhs[i];
                jumlahLulus++;
        } else {
                totalTidakLulus = totalTidakLulus + nilaiMhs[i];
                jumlahTidakLulus++;
        } 
    }

        // Menghitug rata - rata 
        double rata2Lulus = 0, rata2TidakLulus = 0;

        if (jumlahLulus > 0) {
            rata2Lulus = totalLulus / jumlahLulus;
        }
        if (jumlahTidakLulus > 0) {
            rata2TidakLulus = totalTidakLulus / jumlahTidakLulus;
        }

        // Output 
        System.out.println("-------------------------------------");
        System.out.println("Rata - rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata - rata nilai tidak lulus = " + rata2TidakLulus);

        input.close();
    }
}