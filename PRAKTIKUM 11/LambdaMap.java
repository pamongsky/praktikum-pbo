import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        // Membuat sebuah Map dengan NIM sebagai key dan nama mahasiswa sebagai value
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060122140148", "Muhammad Anshar Al Faruq");
        mahasiswaMap.put("24060122140129", "Riski Akbar Firmansah");
        mahasiswaMap.put("24060122140116", "Muhammad Faiq Assajjad");
        mahasiswaMap.put("24060122140144", "Farhan Hariz Abdurrahman");
        mahasiswaMap.put("24060122140135", "Kanz Alief Aryaputra");

        // Menggunakan ekspresi lambda untuk menampilkan key dan value dari Map
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
