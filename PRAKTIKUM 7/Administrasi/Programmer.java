public class Programmer extends Pegawai {

    private final int bonus;

    public Programmer(String nama) {
        super(nama);
        this.bonus = 450000;
    }

    @Override
    public void tampilData() {
        System.out.println("Nama       : " + getNama());
        System.out.println("Gaji pokok : " + getGajiPokok());
        System.out.println("Bonus      : " + bonus);
    }

    @Override
    public void cetakGaji() {
        System.out.println("Nama       : " + getNama());
        System.out.println("Gaji pokok : " + getGajiPokok());
        System.out.println("Bonus      : " + bonus);
        System.out.println("Total gaji : " + (getGajiPokok() + bonus));
    }
}