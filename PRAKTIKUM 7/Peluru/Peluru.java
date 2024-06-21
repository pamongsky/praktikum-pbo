public class Peluru {
    private int jumlah;

    public Peluru() {
        this.jumlah = 0;
    }

    public Peluru(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void kurangiJumlah(int jumlah) {
        this.jumlah -= jumlah;
    }
}