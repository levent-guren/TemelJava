package tr.com.ornek;

import java.sql.Array;
import java.util.*;

public class ListOrnegi {
    public static void main(String[] args) {
        // collection'larda değişken tipi olarak her zaman interface kullanılır.
        List<String> liste = new ArrayList<>();
        liste.add("Ankara");
        liste.add("İstanbul");
        liste.add("İzmir");
        String sehir1 = liste.get(2);
        System.out.println(sehir1);
    }
}
