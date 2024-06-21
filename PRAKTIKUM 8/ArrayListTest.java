import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // Inisialisasi ArrayList  yang hanya dapat berisi objek string
        ArrayList<String> strings = new ArrayList<String>();
        // Menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("and generics");
        // Menghapus elemen
        strings.remove("praktikum");
        // Iterasi pada keseluruhan AraayList
        for (String s : strings){
            System.out.println(s+" ");
        }
    }
}