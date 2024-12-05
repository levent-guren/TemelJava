package tr.com.ornek;

import java.util.HashMap;
import java.util.Map;

public class MapOrnegi {
    public static void main(String[] args) {
        Map<Integer, String> sehirler = new HashMap<>();
        sehirler.put(34, "İstanbul");
        sehirler.put(6, "Ankara");
        sehirler.put(26, "Eskişehir");
        sehirler.put(42, "Konya");
        sehirler.put(20, "Denizli");
        sehirler.put(35, "İzmir");
        System.out.println(sehirler.get(26));
        System.out.println(sehirler.get(20));
    }
}
