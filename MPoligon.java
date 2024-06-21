/* Nama File : MPoligon.java */
/* Deskripsi : Driver class untuk poligon, persegi panjang dan segitiga */
/* Nama / NIM : Muhammad Anshar Al Faruq / 24060122140148 */

package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegiPanjang = new PersegiPanjang(10, 10, 4);
        persegiPanjang.printInfo();
        System.out.println("Luas Persegi Panjang : "+persegiPanjang.hitungLuas());

        Segitiga segitiga = new Segitiga(2, 3, 4);
        segitiga.printInfo();
        System.out.println("Luas Persegi Panjang: " + segitiga.hitungLuas());
    }
}
