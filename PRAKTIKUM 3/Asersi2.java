/* File : Asersi2.java */
/* Deskripsi : Program untuk demo asersi, yang aka meonlak input jari - jari lingkarang yang bernilai nol */
/* NIM / Nama : 24060122140111 / Muhammad Fahmi */

// Class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran (double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
         double keliling = 2*Math.PI*jariJari;
         return keliling;
    }
}

// Class Asersi2
public class Asersi2{
    public static void main(String[] args){
        double jariJari = 1.5;
        assert(jariJari > 0) : "jari jari tidak boleh nol!!";
        Lingkaran rumus = new Lingkaran(jariJari);
        double kelilingLingkaran = rumus.hitungKeliling();
        System.out.println("Keliling Lingkaran = " + kelilingLingkaran);
    }
}


















































