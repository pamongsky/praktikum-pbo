public class Bird extends Animal implements IFlyer {
    @Override
    public void fly() {
        System.out.println("Bisa terbang");
    }

    @Override
    public void eat() {
        System.out.println("Makan: Makanan Burung");
    }

    @Override
    public String toString() {
        return "I'm Bird";
    }
}
