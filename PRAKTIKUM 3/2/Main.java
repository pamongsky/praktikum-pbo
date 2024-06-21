/* File : Main.java */
/* Deskripsi : Program untuk menunjukkan Exception */
/* Nama/Nim : Muhammad Fahmi /24060122140111 */
package tugas2;

public class Main {
    public static void main(String[] args) {
        Pembeli pembeli = new Pembeli("John Doe");
        Obat obat1 = new Obat("Paracetamol");
        Obat obat2 = new Obat("Amoxicillin");
        Obat obat3 = new Obat("Ibuprofen");
        Obat obat4 = new Obat("Cetirizine");
        Obat obat5 = new Obat("Omeprazole");
        Obat obat6 = new Obat("Vitamin C");
        Obat obat7 = new Obat("Vitamin C");

        try {
            pembeli.beliObat(obat1);
            pembeli.beliObat(obat2);
            pembeli.beliObat(obat3);
            pembeli.beliObat(obat4);
            pembeli.beliObat(obat5);
            System.out.println("Pembelian obat berhasil.");
            pembeli.beliObat(obat6);
            pembeli.beliObat(obat7);
        } catch (ObatTidakTersediaException | BatasObatPenuhException e) {
            System.out.println("Terjadi kesalahan saat pembelian obat: " + e.getMessage());
        }
    }
}
