package tr.com.ornek;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<String> isimler = List.of("ali", "veli", "zeynep", "betül");
        isimler.stream().filter(isim -> isim.length()<5).forEach(System.out::println);
        //
        System.out.println("*************");
        isimler.stream().filter(isim -> {
            System.out.println("filter");
            return isim.length()<5;
        }).forEach(s-> {
            System.out.println("foreach");
            System.out.println(s);
        });
        System.out.println("*************");
        // isimlerden uzunlukları 5'ten ufak olanların uzunluk toplamını bulduk.
        System.out.println(isimler.stream().filter(isim -> isim.length()<5).mapToInt(i-> i.length()).sum());
        System.out.println(isimler.stream().filter(isim -> isim.length()<5).mapToInt(i-> i.length()).reduce(5, (deger1, deger2) -> deger1 + deger2 * deger2));

    }
}
