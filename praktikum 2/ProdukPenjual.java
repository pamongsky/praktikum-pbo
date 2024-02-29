/* Program   : ProdukPenjual.java */
/* Deskripsi : Kelas yang berisi program utama yang memanfaatkan kelas produk dan penjual*/
/* NIM/Nama  : 24060122140111/Muhammad Fahmi*/
/* Tanggal   : 29 Februari 2024*/
class Penjual {
    private String nama;
    private String alamat;
    private String nomorTelepon;

    public Penjual(String nama, String alamat, String nomorTelepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
    }

    // Getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }
}

class Produk {
    private String nama;
    private double harga;
    private int stok;
    private String deskripsi;
    private Penjual penjual; 
    public Produk(String nama, double harga, int stok, String deskripsi, Penjual penjual) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.deskripsi = deskripsi;
        this.penjual = penjual;
    }

    // Getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Penjual getPenjual() {
        return penjual;
    }

    // Method untuk mendapatkan informasi produk
    public String getInfoProduk() {
        return "Nama: " + nama + "\nHarga: " + harga + "\nStok: " + stok + "\nDeskripsi: " + deskripsi;
    }

    // Method untuk mengurangi stok produk
    public void kurangiStok(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi.");
        }
    }
}
