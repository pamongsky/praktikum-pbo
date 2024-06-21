/* File : AngkaSialException.java */
/* Deskripsi : Exception usaha sendiri nih, menolak angka 13 */
/* NIM / Nama : 24060122140111 / Muhammad Fahmi */

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena sial broo!!");

    }
}