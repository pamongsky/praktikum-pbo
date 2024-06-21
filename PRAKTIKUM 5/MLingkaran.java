/* Nama File : MLingkaran.java */
/* Deskripsi : Kelas Abstrak, berisi abstraksi bangun datar */
/* Nama / NIM : Muhammad Fahmi / 24060122140111 */

import java.util.Scanner;

class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jejari lingkaran: ");
        double jejari = scan.nextDouble();
        Lingkaran lingkaran = new Lingkaran(jejari);
        double luas = lingkaran.hitungLuas();
        System.out.println("Luas lingkaran dengan jejari " + jejari + " adalah: " + luas);
    
        scan.close();
    }
}

