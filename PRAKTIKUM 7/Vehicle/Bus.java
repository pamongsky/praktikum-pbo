public class Bus extends Vehicle {
    void calRent(int jarak, float harga) {
        float fare = jarak*harga;
        fare = fare - 50.00f;
        System.out.println("harga sewa bis = " + fare);
    }
}