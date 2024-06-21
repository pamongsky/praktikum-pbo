public class Manajer extends Pegawai {

    private final int tunjangan;

    public Manajer(String nama) {
        super(nama);
        this.tunjangan = 700000;
    }

    @Override
    public void tampilData() {
        System.out.println("Nama       : " + getNama());
        System.out.println("Gaji pokok : " + getGajiPokok());
        System.out.println("Tunjangan  : " + tunjangan);
    }

    @Override
    public void cetakGaji() {
        System.out.println("Nama       : " + getNama());
        System.out.println("Gaji pokok : " + getGajiPokok());
        System.out.println("Tunjangan  : " + tunjangan);
        System.out.println("Total gaji : " + (getGajiPokok() + tunjangan));
    }
}