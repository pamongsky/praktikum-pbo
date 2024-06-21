public class Senjata {
    private final String bunyi;
    private final Peluru peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = new Peluru();
    }

    public String getPeluru() {
        return Integer.toString(peluru.getJumlah());
    }

    public void setPeluru(int jumlah) {
        peluru.setJumlah(jumlah);
    }

    public void menembak() {
        if (peluru.getJumlah() > 0) {
            System.out.println(bunyi);
            peluru.kurangiJumlah(1);
            System.out.println("Sisa Peluru: " + peluru.getJumlah());
        } else {
            System.out.println("Peluru habis!");
        }
    }
}