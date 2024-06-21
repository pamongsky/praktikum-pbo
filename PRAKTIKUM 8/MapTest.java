import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        // Kunci -> integer, nilai -> string
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "satu");
        map.put(2, "dua");
        // Mengambil elemen pertama
        System.out.println(map.get(1));
        //Mengambil keseluruhan kunci sebagai objek collection Set
        Set<Integer> keys = map.keySet();

        for(Integer key : keys) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}