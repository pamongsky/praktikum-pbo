package Titik;

public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;

    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
     }

    // Getter dan Setter
    
    // Set TitikAwal
    public void setTitikawal(Titik titikAwal){
        this.titikAwal = titikAwal;
    }
    // Get TitikAwal
    public Titik getTitikawal(){
        return titikAwal;
    }

    // Set TitikAkhir
    public void setTitikAkhir(Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }

    // Get TitikAkhir
    public Titik getTitikAkhir(){
        return titikAkhir;
    }

     // Method menghitung panjang garis
     public double getPanjang() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Method menghitung gradien garis
    public double getGradien() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return dy / dx;
    }

    // Method menghasilkan garis baru yang merupakan hasil pencerminan dengan sumbu Y
    public Garis getRefleksiY() {
        Titik titikAwalRefleksi = titikAwal.getRefleksiY();
        Titik titikAkhirRefleksi = titikAkhir.getRefleksiY();
        return new Garis(titikAwalRefleksi, titikAkhirRefleksi);
    }

    // Method untuk mengecek apakah objek garis tegak lurus dengan garis G
    public boolean isTegakLurus(Garis G) {
        double gradienG1 = this.getGradien();
        double gradienG2 = G.getGradien();
        return gradienG1 * gradienG2 == -1; // Jika perkalian gradien = -1, maka tegak lurus
    }
}
