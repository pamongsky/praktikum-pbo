public class Superman extends Animal implements IFlyer {
    private String name;

    public Superman(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return "Kryptonian";
    }

    @Override
    public void fly() {
        System.out.println("Bisa terbang");
    }

    @Override
    public void eat() {
        System.out.println("Makan: Nasi Goreng");
    }

    @Override
    public String toString() {
        return "I'm " + name;
    }
}
