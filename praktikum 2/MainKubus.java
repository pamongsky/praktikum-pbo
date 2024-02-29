/* Program   : MainKubus.java */
/* Deskripsi : Kelas yang berisi program utama yang memanfaatkan kelas kamu*/
/* NIM/Nama  : 24060122140111/Muhammad Fahmi*/
/* Tanggal   : 29 Februari 2024*/
public class MainKubus {
    public static void main(String[] args) {
        Kubus kubus1 = new Kubus(5);
        System.out.println("Volume Kubus : " + kubus1.hitungVolume());
        System.out.println("Luas Permukaan Kubus : " + kubus1.hitungLuasPermukaan());
    }
}