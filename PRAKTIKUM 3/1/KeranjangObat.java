/* File : KeranjangObat.java */
/* Deskripsi : Program untuk menunjukkan asersi */
/* Nama/Nim : Muhammad Fahmi /24060122140111 */

package tugas1;
public class KeranjangObat {
    private String[] keranjang;
    private int kapasitas;
    private int jumlahObat;

    public KeranjangObat() {
        keranjang = new String[5];
        kapasitas = 5;
        jumlahObat = 0;
    }

    public void tambahObat(String obat) {
        // Tambahkan obat ke dalam keranjang jika masih ada kapasitas
        try {
            if (jumlahObat < kapasitas) {
                keranjang[jumlahObat] = obat;
                jumlahObat++;
            } else {
                throw new AssertionError("Keranjang sudah penuh!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new AssertionError("Keranjang sudah penuh!", e);
        }
    }

    public void tampilkanObat() {
        for (int i = 0; i < jumlahObat; i++) {
            System.out.println(keranjang[i]);
        }
    }
}
