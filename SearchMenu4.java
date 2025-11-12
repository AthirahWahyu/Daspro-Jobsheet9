import java.util.Scanner;

public class SearchMenu4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi menu
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", 
        "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.println("--- SELAMAT DATANG DI MOON CAFE ---");
        System.out.println();

        // Menampilkan daftar menu 
        System.out.println("Daftar menu : ");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1) + ". " + menu[i]);
        }
        System.out.println();

        // Input nama makanan/minuman yang ingin dicari
        System.out.print("Masukkan nama makanan/minuman yang ingin dicari : ");
        String search = input.nextLine();

        // Hasil pencarian -1 karena indeks Array dimulai dari 0
        int hasil = -1;
        
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(search)) {
                hasil = i;
                break;
            }
        }
        System.out.println();
        if (hasil != -1) {
            System.out.println("Pesanan " + search + " tersedia!");
        } else {
            System.out.println("Pesanan " + search + " tidak ada di menu!");
        }
        System.out.println();
        System.out.println("--- THANK YOUU ---");
        input.close();
    }
}
