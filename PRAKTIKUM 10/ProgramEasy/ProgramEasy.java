import java.util.ArrayList;
import java.util.List;

public class ProgramEasy {
    public static void main(String[] args) {
        List<IFlyer> koleksiBisaTerbang;
        koleksiBisaTerbang = new ArrayList<>();

        IFlyer superman = new Superman("superman");
        IFlyer superboy = new Superman("superboy");
        IFlyer supergirl = new Superman("supergirl");
        IFlyer negriti = new Bird();
        IFlyer eagle = new Bird();

        koleksiBisaTerbang.add(negriti);
        koleksiBisaTerbang.add(eagle);
        koleksiBisaTerbang.add(superman);
        koleksiBisaTerbang.add(supergirl);
        koleksiBisaTerbang.add(superboy);

        for (IFlyer bisaTerbang : koleksiBisaTerbang) {
            if (bisaTerbang instanceof Superman) {
                System.out.println(bisaTerbang);
                System.out.println("Bangsa : " + ((Superman)bisaTerbang).getSpecies());
                System.out.print("Makan: ");
                ((Animal)bisaTerbang).eat();
                System.out.println("");
            } else {
                System.out.println(bisaTerbang);
                bisaTerbang.fly();
                System.out.print("Makan: ");
                ((Animal)bisaTerbang).eat();
                System.out.println("");
            }
        }
    }
}
