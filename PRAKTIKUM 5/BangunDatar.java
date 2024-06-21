/* Nama File : BangunDatar.java */
/* Deskripsi : Kelas Abstrak, berisi abstraksi bangun datar */
/* Nama / NIM : Muhammad Fahmi / 24060122140111 */

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}