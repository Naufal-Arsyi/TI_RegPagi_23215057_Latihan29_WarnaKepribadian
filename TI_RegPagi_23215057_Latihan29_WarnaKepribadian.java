/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author Arsyi
 *
  * Nama  : Naufal Miftahul Arsyi
 * Kelas : Teknik Informatika
 * NIM   : 23215057
 * Deskripsi : program ini digunakkan untuk melihat kepribadian adri warna yang disukai

*/
import java.util.Scanner;

public class TI_RegPagi_23215057_Latihan29_WarnaKepribadian {

    // Kode ANSI untuk warna teks
    public static final String RESET = "\033[0m";
    public static final String RED = "\033[41m\033[30m"; // Background Merah dengan teks Hitam
    public static final String GREEN = "\033[42m\033[30m"; // Background Hijau dengan teks Hitam
    public static final String YELLOW = "\033[43m\033[30m"; // Background Kuning dengan teks Hitam
    public static final String BLUE = "\033[44m\033[37m"; // Background Biru dengan teks Putih
    public static final String PURPLE = "\033[45m\033[37m"; // Background Ungu dengan teks Putih

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display menu warna
        System.out.println("YUK CEK KEPRIBADIAN DARI WARNA FAVORITMU");
        System.out.println(RED + "         MERAH         " + RESET);
        System.out.println(GREEN + "         HIJAU         " + RESET);
        System.out.println(YELLOW + "         KUNING        " + RESET);
        System.out.println(BLUE + "         BIRU          " + RESET);
        System.out.println(PURPLE + "         UNGU          " + RESET);
        System.out.print("\nPILIH WARNA FAVORITMU : ");

        String warna = input.nextLine().toUpperCase();
        System.out.print("NAMA KAMU : ");
        String nama = input.nextLine();

        // Menampilkan hasil kepribadian berdasarkan warna
        System.out.println("\n====HASIL TEST KEPRIBADIAN " + nama.toUpperCase() + "====");
        switch (warna) {
            case "MERAH":
                System.out.println("Warna favoritmu adalah " + RED + "MERAH" + RESET);
                System.out.println("1. Periang,");
                System.out.println("2. Pemberani,");
                System.out.println("3. Berani mengambil risiko dalam setiap langkah,");
                System.out.println("4. Menyukai tantangan,");
                System.out.println("5. Kurang sabar,");
                System.out.println("6. Dapat menahan amarah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,");
                System.out.println("7. Memiliki energi kehangatan dan cinta.");
                break;
            case "HIJAU":
                System.out.println("Warna favoritmu adalah " + GREEN + "HIJAU" + RESET);
                System.out.println("1. Romantis,");
                System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
                System.out.println("3. Teguh pada prinsip,");
                System.out.println("4. Menginginkan kesempurnaan,");
                System.out.println("5. Mudah cemburu,");
                System.out.println("6. Mudah merasa iri,");
                System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
                break;
            case "BIRU":
                System.out.println("Warna favoritmu adalah " + BLUE + "BIRU" + RESET);
                System.out.println("1. Menyenangkan,");
                System.out.println("2. Bijaksana,");
                System.out.println("3. Tenang saat menghadapi masalah,");
                System.out.println("4. Dinamis,");
                System.out.println("5. Senang berbagi,");
                System.out.println("6. Bersahabat,");
                System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
                System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
                break;
            case "UNGU":
                System.out.println("Warna favoritmu adalah " + PURPLE + "UNGU" + RESET);
                System.out.println("1. Optimis,");
                System.out.println("2. Tidak pernah ragu,");
                System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
                System.out.println("4. Memiliki ambisi yang besar,");
                System.out.println("5. Memiliki empati yang besar,");
                System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,");
                System.out.println("7. Terkadang bersikap keras kepala dan angkuh.");
                break;
            case "KUNING":
                System.out.println("Warna favoritmu adalah " + YELLOW + "KUNING" + RESET);
                System.out.println("1. Optimis,");
                System.out.println("2. Suka bergaul,");
                System.out.println("3. Periang,");
                System.out.println("4. Senang menolong,");
                System.out.println("5. Lincah dan aktif,");
                System.out.println("6. Tidak suka meremehkan kekurangan orang lain,");
                System.out.println("7. Loyal,");
                System.out.println("8. Hangat,");
                System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,");
                System.out.println("10. Cenderung penakut.");
                break;
            default:
                System.out.println("Oops! Warna yang kamu pilih tidak ada dalam daftar.");
        }
    }
}
