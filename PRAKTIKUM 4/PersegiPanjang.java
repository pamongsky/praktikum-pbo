/* Nama File : PersegiPanjang.java */
/* Nama / NIM : Muhammad Fahmi / 24060122140111 */

package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon{
    private int panjang, lebar;

    public PersegiPanjang(int panjang, int lebar, int jumlahSisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return panjang * lebar;
    }

    public void printInfo(){
        System.out.println("Bangun Persegi Panjang bersisi " + this.getJumlahSisi());
    }
}
