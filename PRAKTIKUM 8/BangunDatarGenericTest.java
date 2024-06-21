public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran(2);

        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(lingkaran1); // Mengirim objek Lingkaran lingkaran1
        System.out.println("Keliling Lingkaran : " + bdg.hitungKeliling());
        System.err.println("tipe generic : " + bdg.get().getClass().getName());

    }
}