import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Untuk membaca input dari pengguna melalui berbagai sumber

        System.out.println("Selamat datang di Program pengecekan validitas Nama Pengguna!");

        validasiUsername(input); // Memanggil fungsi validasiUsername dan menyimpan hasilnya dalam variabel

        input.close(); // Untuk menutup scanner
    }

    public static String validasiUsername(Scanner input){
        String username;
        do {
            System.out.print("Masukkan nama pengguna (Username): ");
            username = input.nextLine();

            // Validasi untuk Nama Pengguna hanya boleh berupa angka atau huruf
            if (!username.matches("^[a-zA-Z0-9]+$")) {
                System.out.println("Maaf, nama pengguna hanya boleh menggunakan huruf dan angka.\n");
            // Validasi untuk Nama Pengguna diawali dengan huruf, tidak boleh angka
            } else if (!Character.isLetter(username.charAt(0))) {
                System.out.println("Maaf, nama pengguna harus dimulai dengan huruf.\n");
            // Validasi untuk Nama Pengguna harus terdiri 5 karakter atau 12 karakter
            } else if (username.length() < 5 || username.length() > 12) {
                System.out.println("Maaf, nama pengguna harus terdiri dari 5 hingga 12 karakter.\n");
            // Jika semua validasi telah terpenuhi, maka keluar dari loop dan validasi telah sukses
            } else {
                System.out.println("Selamat, nama pengguna sudah valid!");
                break;
            }
        } while (true);

        return username;
    }
}